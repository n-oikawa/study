package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuizAnswer {
    @Getter
    private final ThreeChoiceQuizChoice threeChoiceQuizChoice;
    @Getter
    private final Explanation explanation;
}
