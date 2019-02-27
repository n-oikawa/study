package study02.nyukai_taikai.domain.individual;

import study02.nyukai_taikai.domain.member.MemberId;

public interface IndividualRepository {

    MemberId find(IndividualApplication individualApplication);

    void save(MemberId memberId, IndividualApplication individualApplication);
}
