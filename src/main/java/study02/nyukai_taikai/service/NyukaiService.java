package study02.nyukai_taikai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.account.MemberAccountRepository;
import study02.nyukai_taikai.domain.account.PassWord;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Service
public class NyukaiService {

    @Autowired
    private MemberAccountRepository memberAccountRepository;
    @Autowired
    private CreditCardRepository creditCardRepository;

    public MemberAccount create(MemberId memberId, PassWord passWord) {

        // check
        // クレジットカードチェック

        // 個人情報チェック
        //

        // アカウント払い出し
        MemberAccount memberAccount = memberAccountRepository.issue();

        // クレジットカードドメイン作成
        CreditCard creditCard = creditCardRepository.create();

        // 個人情報ドメイン作成

        // 登録

        return new MemberAccount(
                memberId,
                passWord
        );
    }
}
