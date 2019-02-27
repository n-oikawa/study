package study02.nyukai_taikai.domain.member;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class MemberMailAddress {

    @Getter
    private final String value;
}
