package study02.quiz_game.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study02.quiz_game.domain.answer.CorrectAnswerChoice;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.question.*;

@AllArgsConstructor
public class ThreeChoiceQuestionInfomation {
    @Getter
    private final ThreeChoiceQuizQuestion threeChoiceQuizQuestion;
    @Getter
    private final ThreeChoiceQuizAnswer threeChoiceQuizAnswer;
}
