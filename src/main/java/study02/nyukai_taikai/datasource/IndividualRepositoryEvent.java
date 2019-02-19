package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.domain.individual.IndividualRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class IndividualRepositoryEvent implements IndividualRepository {

    public Individual create(MemberId memberId, IndividualApplication individualApplication) {

        return new Individual(
                memberId,
                individualApplication.getName(),
                individualApplication.getNameKana(),
                individualApplication.getGender(),
                individualApplication.getBirthday(),
                individualApplication.getPostalCode(),
                individualApplication.getStreetAddress(),
                individualApplication.getPhoneNumber(),
                individualApplication.getContactAddress()
        );

    }
}
