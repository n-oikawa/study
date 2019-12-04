package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class CorrectAnswerChoice {
    @Getter
    private final ThreeChoiceQuizChoice value;
}
