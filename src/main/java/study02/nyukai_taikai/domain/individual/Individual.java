package study02.nyukai_taikai.domain.individual;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import study02.nyukai_taikai.domain.member.MemberId;

@RequiredArgsConstructor
@EqualsAndHashCode
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
}
