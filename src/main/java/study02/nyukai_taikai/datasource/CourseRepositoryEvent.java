package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.course.Course;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.course.CourseRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class CourseRepositoryEvent implements CourseRepository {

    public CourseInfomation create(MemberId memberId, Course course) {
        return new CourseInfomation(
                memberId,
                Course.BASIC
        );
    }
}
