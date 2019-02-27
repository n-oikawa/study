package study02.nyukai_taikai.domain;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.credit_card.CreditCardInquiry;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.service.CheckResult;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class CheckPolicy {
    public static CheckResult check(
            CreditCardInquiry creditCardInquiry,
            IndividualApplication individualApplication,
            SystemDate systemDate) {

        if (creditCardInquiry.isExist()) {
            return CheckResult.EXIST_CREDIT_CARD;
        }
        if (creditCardInquiry.isExpired()) {
            return CheckResult.EXPIRED_CREDIT_CARD;
        }
        if (individualApplication.isNotTwentyYearsOld(systemDate)) {
            return CheckResult.NOT_TWENTY_YEARS_OLD;
        }
        return CheckResult.OK;
    }
}
