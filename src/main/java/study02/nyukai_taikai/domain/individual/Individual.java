package study02.nyukai_taikai.domain.individual;

import study02.nyukai_taikai.domain.member.MemberId;

public class Individual {

    private MemberId memberId;
    private Name name;
    private NameKana nameKana;
    private Gender gender;
    private Birthday birthday;
    private PostalCode postalCode;
    private StreetAddress streetAddress;
    private PhoneNumber phoneNumber;
    private ContactAddress contactAddress;

    public Individual(
            MemberId memberId,
            Name name,
            NameKana nameKana,
            Gender gender,
            Birthday birthday,
            PostalCode postalCode,
            StreetAddress streetAddress,
            PhoneNumber phoneNumber,
            ContactAddress contactAddress) {
        this.memberId = memberId;
        this.name = name;
        this.nameKana = nameKana;
        this.gender = gender;
        this.birthday = birthday;
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
        this.contactAddress = contactAddress;
    }

}
