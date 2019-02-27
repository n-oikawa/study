package study02.nyukai_taikai.domain.course;

import study02.nyukai_taikai.domain.member.MemberId;

public interface CourseRepository {

    void save(MemberId memberId, Course course);
}
