package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.course.Course;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.member.MemberId;
import study02.nyukai_taikai.domain.nyukai.MemberNyukai;
import study02.nyukai_taikai.domain.nyukai.NyukaiApplyDate;
import study02.nyukai_taikai.domain.nyukai.NyukaiDate;
import study02.nyukai_taikai.domain.nyukai.NyukaiRepository;

@Repository
public class NyukaiRepositoryEvent implements NyukaiRepository {

    public MemberNyukai create(
            MemberId memberId,
            MemberAccount memberAccount,
            NyukaiApplyDate nyukaiApplyDate,
            Individual individual,
            CreditCard creditCard,
            CourseInfomation courseInfomation
    ) {
        return new MemberNyukai(
                memberId,
                memberAccount,
                nyukaiApplyDate,
                new NyukaiDate("20190101"),
                individual,
                creditCard,
                courseInfomation
        );
    }

    public void register(MemberNyukai memberNyukai) {
        //DBにinsertする
    }
}
