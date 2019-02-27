package study02.nyukai_taikai.domain.nyukai;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.account.MemberAccount;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class MemberNyukai {
    @Getter
    private final MemberAccount memberAccount;
    private final NyukaiApplyDate nyukaiApplyDate;
}
