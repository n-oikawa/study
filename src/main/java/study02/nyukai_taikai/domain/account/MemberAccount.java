package study02.nyukai_taikai.domain.account;

import study02.nyukai_taikai.domain.member.MemberId;

public class MemberAccount {

    private final MemberId memberId;
    private final PassWord passWord;

    public MemberAccount(MemberId memberId, PassWord passWord) {
        this.memberId = memberId;
        this.passWord = passWord;
    }

    public MemberAccount get() {
        return new MemberAccount(
                memberId,
                passWord
        );
    }

    public MemberId getMemberId() {
        return memberId;
    }
}
