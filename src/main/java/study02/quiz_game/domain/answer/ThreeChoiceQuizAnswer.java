package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuizAnswer {
    @Getter
    private final CorrectAnswerChoice correctAnswerChoice;
    @Getter
    private final Explanation explanation;
}
