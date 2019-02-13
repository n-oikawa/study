package study02.nyukai_taikai.api;


import lombok.Getter;
import study02.nyukai_taikai.api.form.MemberIdForm;

public class NyukaiRequest {

    @Getter
    private MemberIdForm memberIdForm;

    public NyukaiRequest(String arg1) {
        memberIdForm = new MemberIdForm(arg1);
    }

}
