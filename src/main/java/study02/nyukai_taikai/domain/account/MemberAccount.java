package study02.nyukai_taikai.domain.account;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.member.MemberId;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class MemberAccount {

    @Getter
    private final MemberId memberId;
    @Getter
    private final PassWord passWord;
}
