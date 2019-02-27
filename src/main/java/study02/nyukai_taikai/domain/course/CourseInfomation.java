package study02.nyukai_taikai.domain.course;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import study02.nyukai_taikai.domain.member.MemberId;

@RequiredArgsConstructor
@EqualsAndHashCode
public class CourseInfomation {

    private final MemberId memberId;
    private final Course course;
}
