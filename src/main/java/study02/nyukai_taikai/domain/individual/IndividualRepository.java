package study02.nyukai_taikai.domain.individual;

import study02.nyukai_taikai.domain.member.MemberId;

public interface IndividualRepository {

    Individual create(MemberId memberId, IndividualApplication individualApplication);
}
