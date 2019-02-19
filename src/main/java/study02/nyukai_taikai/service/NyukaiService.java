package study02.nyukai_taikai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.account.MemberAccountRepository;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.course.CourseRepository;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.credit_card.CreditCardApplication;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.domain.individual.IndividualRepository;
import study02.nyukai_taikai.domain.nyukai.MemberNyukai;
import study02.nyukai_taikai.domain.nyukai.NyukaiApplication;
import study02.nyukai_taikai.domain.nyukai.NyukaiApplyDate;
import study02.nyukai_taikai.domain.nyukai.NyukaiRepository;

@Service
public class NyukaiService {

    @Autowired
    private MemberAccountRepository memberAccountRepository;
    @Autowired
    private CreditCardRepository creditCardRepository;
    @Autowired
    private IndividualRepository individualRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private NyukaiRepository nyukaiRepository;

    public MemberAccount create(NyukaiApplication nyukaiApplication) {

        // check
        check(nyukaiApplication.getCreditCardApplication(), nyukaiApplication.getIndividualApplication());
        // アカウント払い出し
        MemberAccount memberAccount = memberAccountRepository.issue();
        // クレジットカードドメイン作成
        CreditCard creditCard = creditCardRepository.create(memberAccount.getMemberId(), nyukaiApplication.getCreditCardApplication());
        // 個人情報ドメイン作成
        Individual individual = individualRepository.create(memberAccount.getMemberId(), nyukaiApplication.getIndividualApplication());
        // コースドメイン作成
        CourseInfomation courseInfomation = courseRepository.create(memberAccount.getMemberId(), nyukaiApplication.getCourse());

        // 登録
        MemberNyukai memberNyukai = nyukaiRepository.create(
                memberAccount.getMemberId(),
                memberAccount,
                new NyukaiApplyDate("20190101"),
                individual,
                creditCard,
                courseInfomation
        );

        nyukaiRepository.register(memberNyukai);

        return memberAccount;
    }

    private void check(CreditCardApplication creditCard, IndividualApplication individual) {
        // クレジットカードチェック
        // 個人情報チェック
    }
}
