package study02.nyukai_taikai.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.course.Course;
import study02.nyukai_taikai.domain.course.CourseInfomation;
import study02.nyukai_taikai.domain.course.CourseRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class CourseRepositoryEvent implements CourseRepository {

    @Autowired
    private CourseMapper courseMapper;

    public void save(MemberId memberId, Course course) {

        courseMapper.insert(memberId.getValue(), "basic");
    }
}
