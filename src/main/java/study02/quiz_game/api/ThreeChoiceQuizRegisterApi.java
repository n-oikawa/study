package study02.quiz_game.api;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import study02.quiz_game.domain.ThreeChoiceQuestionRegistrationRequest;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;
import study02.quiz_game.service.ThreeChoiceQuizService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class ThreeChoiceQuizRegisterApi {
    @Autowired
    private ThreeChoiceQuizService threeChoiceQuizService;

    @RequestMapping(value = "/three-choice-quiz/register", method = RequestMethod.GET)
    public Map regsiter(@Valid ThreeChoiceQuestionRegistrationRequest request) {
        ThreeChoiceQuizNumber threeChoiceQuizNumber = threeChoiceQuizService.regsiter(request.create());

        Map<String, String> res = new HashMap<>();
        res.put("response", "OK");
        res.put("quiz_number", threeChoiceQuizNumber.getValue().toString());
        return res;
    }
}
