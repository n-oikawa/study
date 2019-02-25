package study02.nyukai_taikai.domain.individual;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IndividualMapper {

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
