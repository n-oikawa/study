package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.account.MemberAccount;
import study02.nyukai_taikai.domain.account.MemberAccountRepository;
import study02.nyukai_taikai.domain.account.PassWord;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class MemberAccountRepositoryEvent implements MemberAccountRepository {

    public MemberAccount issue() {
        return new MemberAccount(
                new MemberId("1"),
                new PassWord("X")
        );

    }
}
