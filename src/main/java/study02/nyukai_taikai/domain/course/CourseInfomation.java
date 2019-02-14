package study02.nyukai_taikai.domain.course;

import study02.nyukai_taikai.domain.member.MemberId;

public class CourseInfomation {

    private MemberId memberId;
    private Course course;

    public CourseInfomation(MemberId memberId, Course course) {
        this.memberId = memberId;
        this.course = course;
    }
}
