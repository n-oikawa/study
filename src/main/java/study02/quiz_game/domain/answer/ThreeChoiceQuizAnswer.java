package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreeChoiceQuizAnswer {
    private final CorrectAnswerChoice correctAnswerChoice;
    private final Explanation explanation;
}
