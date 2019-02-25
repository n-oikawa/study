package study02.nyukai_taikai.domain.individual;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class PhoneNumber {

    @Getter
    private final String value;
}
