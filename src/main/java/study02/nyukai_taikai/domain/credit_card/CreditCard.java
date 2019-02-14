package study02.nyukai_taikai.domain.credit_card;

import study02.nyukai_taikai.domain.member.MemberId;

public class CreditCard {

    private MemberId memberId;
    private CreditCardNumber creditCardNumber;
    private CreditCardExpirationDate creditCardExpirationDate;
    private CreditCardSecurityCode creditCardSecurityCode;

    public CreditCard(
            MemberId memberId,
            CreditCardNumber creditCardNumber,
            CreditCardExpirationDate creditCardExpirationDate,
            CreditCardSecurityCode creditCardSecurityCode) {

        this.memberId = memberId;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpirationDate = creditCardExpirationDate;
        this.creditCardSecurityCode = creditCardSecurityCode;
    }
}
