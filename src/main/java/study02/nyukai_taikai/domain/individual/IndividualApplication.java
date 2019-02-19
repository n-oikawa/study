package study02.nyukai_taikai.domain.individual;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class IndividualApplication {

    @Getter
    private final Name name;
    @Getter
    private final NameKana nameKana;
    @Getter
    private final Gender gender;
    @Getter
    private final Birthday birthday;
    @Getter
    private final PostalCode postalCode;
    @Getter
    private final StreetAddress streetAddress;
    @Getter
    private final PhoneNumber phoneNumber;
    @Getter
    private final ContactAddress contactAddress;

}
