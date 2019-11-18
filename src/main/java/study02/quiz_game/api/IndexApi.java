package study02.quiz_game.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import study02.quiz_game.domain.ThreeChoiceQuestionRegistrationRequest;

@Controller
public class IndexApi {
    @RequestMapping(value = "/index")
    public String index(ThreeChoiceQuestionRegistrationRequest threeChoiceQuestionRegistrationRequest, Model model) {
        model.addAttribute("threeChoiceQuestionRegistrationRequest", threeChoiceQuestionRegistrationRequest);
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "index";
    }
}
