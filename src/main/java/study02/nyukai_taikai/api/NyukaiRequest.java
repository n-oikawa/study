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
import study02.nyukai_taikai.domain.nyukai.NyukaiApplyDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    private String NyukaiApplyDate;

    public NyukaiApplication create() {
        return new NyukaiApplication(
                new Name("太郎"),
                new NameKana("たろう"),
                new Gender("男"),
                new Birthday(LocalDate.parse("1999/01/01", DateTimeFormatter.ofPattern("yyyy/MM/dd"))),
                new PostalCode(postalCode),
                new StreetAddress(streetAddress),
                new PhoneNumber(phoneNumber),
                new ContactAddress(contactAddress),
                new MemberMailAddress(memberMailAddress),
                new CreditCardNumber("123456789012"),
                new CreditCardExpirationDate("203001"),
                new CreditCardSecurityCode("0123"),
                new NyukaiApplyDate("20190101")
        );
    }
}
