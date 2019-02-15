package study02.nyukai_taikai.domain.nyukai;

import study02.nyukai_taikai.domain.credit_card.CreditCardExpirationDate;
import study02.nyukai_taikai.domain.credit_card.CreditCardNumber;
import study02.nyukai_taikai.domain.credit_card.CreditCardSecurityCode;
import study02.nyukai_taikai.domain.individual.Birthday;
import study02.nyukai_taikai.domain.individual.ContactAddress;
import study02.nyukai_taikai.domain.individual.Gender;
import study02.nyukai_taikai.domain.individual.Name;
import study02.nyukai_taikai.domain.individual.NameKana;
import study02.nyukai_taikai.domain.individual.PhoneNumber;
import study02.nyukai_taikai.domain.individual.PostalCode;
import study02.nyukai_taikai.domain.individual.StreetAddress;
import study02.nyukai_taikai.domain.member.MemberMailAddress;

public class NyukaiApplication {
    private Name name;
    private NameKana nameKana;
    private Gender gender;
    private Birthday birthday;
    private PostalCode postalCode;
    private StreetAddress streetAddress;
    private PhoneNumber phoneNumber;
    private ContactAddress contactAddress;
    private MemberMailAddress memberMailAddress;
    private CreditCardNumber creditCardNumber;
    private CreditCardExpirationDate creditCardExpirationDate;
    private CreditCardSecurityCode creditCardSecurityCode;


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
            CreditCardSecurityCode creditCardSecurityCode) {

        this.name = name;
        this.nameKana = nameKana;
        this.gender = gender;
        this.birthday = birthday;
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
        this.contactAddress = contactAddress;
        this.memberMailAddress = memberMailAddress;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpirationDate = creditCardExpirationDate;
        this.creditCardSecurityCode = creditCardSecurityCode;
    }
}
