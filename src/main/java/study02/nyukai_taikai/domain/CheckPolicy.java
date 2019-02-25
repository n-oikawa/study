package study02.nyukai_taikai.domain;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.credit_card.CreditCardApplication;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.service.CheckResult;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class CheckPolicy {
    private final CreditCardApplication creditCardApplication;
    private final IndividualApplication individualApplication;

    public CheckResult isCheck() {

        if (individualApplication.isNotTwentyYearsOld()) {
            return CheckResult.NOT_TWENTY_YEARS_OLD;
        }

        return CheckResult.OK;
    }
}
