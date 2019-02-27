package study02.nyukai_taikai.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NyukaiMapper {

    @Insert("INSERT INTO nyukai_event (member_id, password, apply_date, mail_address, system_date) VALUES (#{memberId}, #{password}, #{nyukaiApplyDate}, #{mailAddress}, sysdate)")
    void insert(
            @Param("memberId") String memberId,
            @Param("password") String password,
            @Param("nyukaiApplyDate") String nyukaiApplyDate,
            @Param("mailAddress") String mailAddress);
}
