package study02.nyukai_taikai.domain.nyukai;

import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.course.Course;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.member.MemberId;

public class MemberNyukai {

    private final MemberId memberId;
    private final MemberAccount memberAccount;
    private final NyukaiApplyDate nyukaiApplyDate;
    private final NyukaiDate nyukaiDate;
    private final Individual individual;
    private final CreditCard creditCard;
    private final CourseInfomation courseInfomation;

    public MemberNyukai(
            MemberId memberId,
            MemberAccount memberAccount,
            NyukaiApplyDate nyukaiApplyDate,
            NyukaiDate nyukaiDate,
            Individual individual,
            CreditCard creditCard,
            CourseInfomation courseInfomation
    ) {
        this.memberId = memberId;
        this.memberAccount = memberAccount;
        this.nyukaiApplyDate = nyukaiApplyDate;
        this.nyukaiDate = nyukaiDate;
        this.individual = individual;
        this.creditCard = creditCard;
        this.courseInfomation = courseInfomation;
    }

}
