package study02.nyukai_taikai.domain.nyukai;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.member.MemberId;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class MemberNyukai {

    @Getter
    private final MemberId memberId;
    private final MemberAccount memberAccount;
    private final NyukaiApplyDate nyukaiApplyDate;
    private final Individual individual;
    private final CreditCard creditCard;
    private final CourseInfomation courseInfomation;

}
