package study02.nyukai_taikai.api.form;

import study02.nyukai_taikai.domain.member.MemberId;

public class MemberIdForm {

    private String value;

    public MemberIdForm(String value) {
    }

    public MemberId getValueObject() {
        return new MemberId(value);
    }
}
