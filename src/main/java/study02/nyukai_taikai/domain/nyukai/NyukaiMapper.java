package study02.nyukai_taikai.domain.nyukai;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NyukaiMapper {

    @Insert("INSERT INTO nyukai_event (member_id) VALUES (#{memberId})")
    void insert(@Param("memberId") String memberId);
}
