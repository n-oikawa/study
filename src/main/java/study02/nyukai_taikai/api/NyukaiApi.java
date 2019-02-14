package study02.nyukai_taikai.api;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import study02.nyukai_taikai.domain.member.MemberId;
import study02.nyukai_taikai.service.NyukaiService;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class NyukaiApi {

    @Autowired
    private NyukaiService nyukaiService;

    @RequestMapping(value = "/nyukai", method = RequestMethod.GET)
    public Map hello() {

        nyukaiService.create();


        Map<String, MemberId> res = new HashMap<>();
        res.put("response", nyukaiRequest.getMemberIdForm().getValueObject());
        return res;
    }
}
