package study02.nyukai_taikai.domain.credit_card;

public class CreditCard {

    private CreditCardNumber creditCardNumber;
    private CreditCardExpirationDate creditCardExpirationDate;
    private CreditCardSecurityCode creditCardSecurityCode;

    public CreditCard(
            CreditCardNumber creditCardNumber,
            CreditCardExpirationDate creditCardExpirationDate,
            CreditCardSecurityCode creditCardSecurityCode) {

        this.creditCardNumber = creditCardNumber;
        this.creditCardExpirationDate = creditCardExpirationDate;
        this.creditCardSecurityCode = creditCardSecurityCode;
    }
}
