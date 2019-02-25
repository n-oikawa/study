package study02.nyukai_taikai.domain.credit_card;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CreditCardMapper {

    @Insert("INSERT INTO credit_card_event (member_id, card_number, expiration_date, security_code) VALUES (#{memberId}, #{cardNumber}, #{expirationDate}, #{securityCode})")
    void insert(
            @Param("memberId") String memberId,
            @Param("cardNumber") String CardNumber,
            @Param("expirationDate") String expirationDate,
            @Param("securityCode") String securityCode);
}
