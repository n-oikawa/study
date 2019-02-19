package study02.nyukai_taikai.domain.credit_card;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class CreditCardApplication {

    @Getter
    private final CreditCardNumber creditCardNumber;
    @Getter
    private final CreditCardExpirationDate creditCardExpirationDate;
    @Getter
    private final CreditCardSecurityCode creditCardSecurityCode;
}
