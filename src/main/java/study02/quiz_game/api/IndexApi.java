package study02.quiz_game.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexApi {
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "index";
    }
}
