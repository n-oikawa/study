package study02.nyukai_taikai.domain.nyukai;

import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.member.MemberId;

public interface NyukaiRepository {

    MemberNyukai create(
            MemberId memberId,
            MemberAccount memberAccount,
            NyukaiApplyDate nyukaiApplyDate,
            Individual individual,
            CreditCard creditCard,
            CourseInfomation courseInfomation
    );

    void register(MemberNyukai memberNyukai);
}
