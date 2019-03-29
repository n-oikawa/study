package study02.nyukai_taikai.domain;

import study02.nyukai_taikai.domain.credit_card.CreditCardInquiry;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.service.CheckResult;

public class CheckPolicy {
    public static CheckResult judge(
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
