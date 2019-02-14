package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.individual.Birthday;
import study02.nyukai_taikai.domain.individual.ContactAddress;
import study02.nyukai_taikai.domain.individual.Gender;
import study02.nyukai_taikai.domain.individual.Individual;
import study02.nyukai_taikai.domain.individual.IndividualRepository;
import study02.nyukai_taikai.domain.individual.Name;
import study02.nyukai_taikai.domain.individual.NameKana;
import study02.nyukai_taikai.domain.individual.PhoneNumber;
import study02.nyukai_taikai.domain.individual.PostalCode;
import study02.nyukai_taikai.domain.individual.StreetAddress;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class IndividualRepositoryEvent implements IndividualRepository {

    public Individual create(MemberId memberId) {

        return new Individual(
                memberId,
                new Name("太郎さん"),
                new NameKana("たろうさん"),
                Gender.MAN,
                new Birthday("20190101"),
                new PostalCode("000-0001"),
                new StreetAddress("住所"),
                new PhoneNumber("01-2345-6789"),
                new ContactAddress("090-1234-5678")
        );

    }
}
