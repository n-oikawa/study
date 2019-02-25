package study02.nyukai_taikai.domain.individual;

import study02.nyukai_taikai.domain.member.MemberId;

public interface IndividualRepository {

    Individual save(MemberId memberId, IndividualApplication individualApplication);
}
