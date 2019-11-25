package study02.quiz_game.domain.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study02.quiz_game.domain.ThreeChoiceQuizChoice;

import java.util.List;

@AllArgsConstructor
public class ThreeChoiceQuizQuestion {
    @Getter
    private final Question question;
    @Getter
    private final List<ThreeChoiceQuizChoice> threeChoiceQuizChoices;
}
