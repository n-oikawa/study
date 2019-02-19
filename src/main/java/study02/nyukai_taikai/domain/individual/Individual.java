package study02.nyukai_taikai.domain.individual;

import study02.nyukai_taikai.domain.member.MemberId;

public class Individual {

    private final MemberId memberId;
    private final Name name;
    private final NameKana nameKana;
    private final Gender gender;
    private final Birthday birthday;
    private final PostalCode postalCode;
    private final StreetAddress streetAddress;
    private final PhoneNumber phoneNumber;
    private final ContactAddress contactAddress;

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
