package study02.nyukai_taikai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.nyukai_taikai.domain.CheckPolicy;
import study02.nyukai_taikai.domain.SystemDate;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.account.MemberAccountRepository;
import study02.nyukai_taikai.domain.course.CourseRepository;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.individual.IndividualRepository;
import study02.nyukai_taikai.domain.member.MemberId;
import study02.nyukai_taikai.domain.nyukai.MemberNyukai;
import study02.nyukai_taikai.domain.nyukai.NyukaiApplication;
import study02.nyukai_taikai.domain.nyukai.NyukaiRepository;

import java.time.LocalDate;

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

    public MemberNyukai create(NyukaiApplication nyukaiApplication) {

        SystemDate systemDate = new SystemDate(LocalDate.now());

        // check
        CheckResult checkResult = CheckPolicy.check(
                creditCardRepository.find(nyukaiApplication.getCreditCardApplication()),
                nyukaiApplication.getIndividualApplication(),
                systemDate
        );

        if (!checkResult.isOK()) {
            throw new RuntimeException();
        }

        // アカウント払い出し
        MemberAccount memberAccount = memberAccountRepository.issue();
        // 会員ID取得
        MemberId memberId = memberAccount.getMemberId();

        creditCardRepository.save(memberId, nyukaiApplication.getCreditCardApplication());

        individualRepository.save(memberId, nyukaiApplication.getIndividualApplication());

        courseRepository.save(memberId, nyukaiApplication.getCourse());

        // 登録
        MemberNyukai memberNyukai = new MemberNyukai(
                memberAccount,
                nyukaiApplication.getNyukaiApplyDate(),
                nyukaiApplication.getMemberMailAddress()
        );
        nyukaiRepository.save(memberNyukai);

        return memberNyukai;
    }
}
