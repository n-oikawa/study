package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study02.quiz_game.domain.ThreeChoiceQuizChoice;

@AllArgsConstructor
public class ThreeChoiceQuizAnswer {
    @Getter
    private final ThreeChoiceQuizChoice threeChoiceQuizChoice;
    @Getter
    private final Explanation explanation;
}
