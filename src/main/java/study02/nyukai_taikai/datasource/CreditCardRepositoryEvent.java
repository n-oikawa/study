package study02.nyukai_taikai.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.credit_card.CreditCardApplication;
import study02.nyukai_taikai.domain.credit_card.CreditCardMapper;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class CreditCardRepositoryEvent implements CreditCardRepository {

    @Autowired
    private CreditCardMapper creditCardMapper;

    public CreditCard save(MemberId memberId, CreditCardApplication creditCardApplication) {

        creditCardMapper.insert(
                memberId.getValue(),
                creditCardApplication.getCreditCardNumber().getValue(),
                creditCardApplication.getCreditCardExpirationDate().getValue(),
                creditCardApplication.getCreditCardSecurityCode().getValue());

        return new CreditCard(
                memberId,
                creditCardApplication.getCreditCardNumber(),
                creditCardApplication.getCreditCardExpirationDate(),
                creditCardApplication.getCreditCardSecurityCode()
        );
    }
}
