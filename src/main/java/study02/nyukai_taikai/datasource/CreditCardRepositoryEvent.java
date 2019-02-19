package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.credit_card.CreditCardApplication;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class CreditCardRepositoryEvent implements CreditCardRepository {

    public CreditCard create(MemberId memberId, CreditCardApplication creditCardApplication) {
        return new CreditCard(
                memberId,
                creditCardApplication.getCreditCardNumber(),
                creditCardApplication.getCreditCardExpirationDate(),
                creditCardApplication.getCreditCardSecurityCode()
        );
    }
}
