package study02.nyukai_taikai.domain.course;

import study02.nyukai_taikai.domain.member.MemberId;

public interface CourseRepository {

    CourseInfomation create(MemberId memberId, Course course);
}
