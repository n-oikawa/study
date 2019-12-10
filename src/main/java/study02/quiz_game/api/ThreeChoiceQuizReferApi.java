package study02.quiz_game.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;
import study02.quiz_game.service.ThreeChoiceQuizReferService;
import study02.quiz_game.service.ThreeChoiceQuizService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ThreeChoiceQuizReferApi {
    @Autowired
    private ThreeChoiceQuizReferService threeChoiceQuizReferService;

    @RequestMapping(value = "/three-choice-quiz/refer")
    public String refer() {
        ThreeChoiceQuizNumber threeChoiceQuizNumber = threeChoiceQuizReferService.refer();

        Map<String, String> res = new HashMap<>();
        res.put("response", "OK");
        res.put("quiz_number", threeChoiceQuizNumber.getValue().toString());
        return "three-choice-quiz/refer";
    }
}
