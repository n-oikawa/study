package study02.nyukai_taikai.domain.nyukai;

import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.course.Course;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.member.MemberId;

public class MemberNyukai {

    private MemberId memberId;
    private MemberAccount memberAccount;
    private NyukaiApplyDate nyukaiApplyDate;
    private NyukaiDate nyukaiDate;
    private Individual individual;
    private CreditCard creditCard;
    private CourseInfomation courseInfomation;

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
