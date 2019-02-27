package study02.nyukai_taikai.domain.nyukai;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.member.MemberMailAddress;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class MemberNyukai {
    @Getter
    private final MemberAccount memberAccount;
    @Getter
    private final NyukaiApplyDate nyukaiApplyDate;
    @Getter
    private final MemberMailAddress memberMailAddress;
}
