package study02.nyukai_taikai.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseMapper {

    @Insert("INSERT INTO course_event (member_id, course) VALUES (#{memberId}, #{course})")
    void insert(@Param("memberId") String memberId, @Param("course") String course);
}
