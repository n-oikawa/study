package study02.nyukai_taikai.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import study02.nyukai_taikai.domain.member.MemberId;

@Mapper
public interface IndividualMapper {

    @Select("SELECT member_id FROM individual_event WHERE name = #{name} AND name_kana = #{nameKana}")
    MemberId select(
            @Param("name") String name,
            @Param("nameKana") String nameKana
    );

    @Insert("INSERT INTO individual_event (member_id, name, name_kana, gender, birthday, postal_code, street_address, phone_number, contact_address) VALUES (#{memberId}, #{name}, #{nameKana}, #{gender}, #{birthday}, #{postalCode}, #{streetAddress}, #{phoneNumber}, #{contactAddress})")
    void insert(
            @Param("memberId") String memberId,
            @Param("name") String name,
            @Param("nameKana") String nameKana,
            @Param("gender") String gender,
            @Param("birthday") String birthday,
            @Param("postalCode") String postalCode,
            @Param("streetAddress") String streetAddress,
            @Param("phoneNumber") String phoneNumber,
            @Param("contactAddress") String contactAddress);
}
