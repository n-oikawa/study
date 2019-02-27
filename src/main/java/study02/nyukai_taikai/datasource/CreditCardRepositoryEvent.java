package study02.nyukai_taikai.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.credit_card.CreditCardApplication;
import study02.nyukai_taikai.domain.credit_card.CreditCardInquiry;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class CreditCardRepositoryEvent implements CreditCardRepository {

    @Autowired
    private CreditCardMapper creditCardMapper;

    public CreditCardInquiry find(CreditCardApplication creditCardApplication) {
        // クレジットカード会社に問い合わせる部品を呼び出して判定結果を返す
        return CreditCardInquiry.OK;
    }

    public void save(MemberId memberId, CreditCardApplication creditCardApplication) {

        creditCardMapper.insert(
                memberId.getValue(),
                creditCardApplication.getCreditCardNumber().getValue(),
                creditCardApplication.getCreditCardExpirationDate().getValue(),
                creditCardApplication.getCreditCardSecurityCode().getValue());
    }
}
