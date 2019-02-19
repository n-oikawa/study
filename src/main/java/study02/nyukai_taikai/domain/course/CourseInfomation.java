package study02.nyukai_taikai.domain.course;

import study02.nyukai_taikai.domain.member.MemberId;

public class CourseInfomation {

    private final MemberId memberId;
    private final Course course;

    public CourseInfomation(MemberId memberId, Course course) {
        this.memberId = memberId;
        this.course = course;
    }
}
