package study02.nyukai_taikai.domain.credit_card;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class CreditCardNumber {

    @Getter
    private final String value;

}
