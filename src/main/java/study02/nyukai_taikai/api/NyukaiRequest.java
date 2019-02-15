package study02.nyukai_taikai.api;


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
import study02.nyukai_taikai.domain.nyukai.NyukaiApplication;

public class NyukaiRequest {

    private String name;
    private String nameKana;
    private String gender;
    private String birthday;
    private String postalCode;
    private String streetAddress;
    private String phoneNumber;
    private String contactAddress;
    private String memberMailAddress;
    private String creditCardNumber;
    private String creditCardExpirationDate;
    private String creditCardSecurityCode;

    public NyukaiApplication create() {
        return new NyukaiApplication(
                new Name(name),
                new NameKana(nameKana),
                Gender.MAN,
                new Birthday(birthday),
                new PostalCode(postalCode),
                new StreetAddress(streetAddress),
                new PhoneNumber(phoneNumber),
                new ContactAddress(contactAddress),
                new MemberMailAddress(memberMailAddress),
                new CreditCardNumber(creditCardNumber),
                new CreditCardExpirationDate(creditCardExpirationDate),
                new CreditCardSecurityCode(creditCardSecurityCode)
        );
    }
}
