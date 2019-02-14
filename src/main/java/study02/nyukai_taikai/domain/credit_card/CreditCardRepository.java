package study02.nyukai_taikai.domain.credit_card;

import study02.nyukai_taikai.domain.member.MemberId;

public interface CreditCardRepository {

    CreditCard create(MemberId memberId);
}
