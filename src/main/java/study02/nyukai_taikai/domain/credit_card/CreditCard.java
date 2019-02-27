package study02.nyukai_taikai.domain.credit_card;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import study02.nyukai_taikai.domain.member.MemberId;

@RequiredArgsConstructor
@EqualsAndHashCode
public class CreditCard {

    private final MemberId memberId;
    private final CreditCardNumber creditCardNumber;
    private final CreditCardExpirationDate creditCardExpirationDate;
    private final CreditCardSecurityCode creditCardSecurityCode;
}
