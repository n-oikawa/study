package study02.nyukai_taikai.domain.member;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class Member {

    private final MemberId memberId;
    private final MemberStatus memberStatus;
    private final MemberMailAddress memberMailAddress;
}
