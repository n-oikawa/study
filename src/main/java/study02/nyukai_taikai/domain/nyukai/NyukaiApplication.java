package study02.nyukai_taikai.domain.nyukai;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.course.Course;
import study02.nyukai_taikai.domain.credit_card.CreditCardApplication;
import study02.nyukai_taikai.domain.credit_card.CreditCardExpirationDate;
import study02.nyukai_taikai.domain.credit_card.CreditCardNumber;
import study02.nyukai_taikai.domain.credit_card.CreditCardSecurityCode;
import study02.nyukai_taikai.domain.individual.Birthday;
import study02.nyukai_taikai.domain.individual.ContactAddress;
import study02.nyukai_taikai.domain.individual.Gender;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.domain.individual.Name;
import study02.nyukai_taikai.domain.individual.NameKana;
import study02.nyukai_taikai.domain.individual.PhoneNumber;
import study02.nyukai_taikai.domain.individual.PostalCode;
import study02.nyukai_taikai.domain.individual.StreetAddress;
import study02.nyukai_taikai.domain.member.MemberMailAddress;

public class NyukaiApplication {
    @Getter
    private final IndividualApplication individualApplication;
    @Getter
    private final MemberMailAddress memberMailAddress;
    @Getter
    private final CreditCardApplication creditCardApplication;
    @Getter
    private final Course course;
    @Getter
    private final NyukaiApplyDate nyukaiApplyDate;


    public NyukaiApplication(
            Name name,
            NameKana nameKana,
            Gender gender,
            Birthday birthday,
            PostalCode postalCode,
            StreetAddress streetAddress,
            PhoneNumber phoneNumber,
            ContactAddress contactAddress,
            MemberMailAddress memberMailAddress,
            CreditCardNumber creditCardNumber,
            CreditCardExpirationDate creditCardExpirationDate,
            CreditCardSecurityCode creditCardSecurityCode,
            NyukaiApplyDate nyukaiApplyDate) {

        this.individualApplication = new IndividualApplication(
                name,
                nameKana,
                gender,
                birthday,
                postalCode,
                streetAddress,
                phoneNumber,
                contactAddress
        );
        this.memberMailAddress = memberMailAddress;
        this.creditCardApplication = new CreditCardApplication(
                creditCardNumber,
                creditCardExpirationDate,
                creditCardSecurityCode
        );
        this.course = Course.BASIC;
        this.nyukaiApplyDate = nyukaiApplyDate;
    }
}
