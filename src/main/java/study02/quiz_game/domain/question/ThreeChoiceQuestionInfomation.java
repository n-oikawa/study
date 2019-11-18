package study02.quiz_game.domain.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study02.quiz_game.domain.answer.CorrectAnswerChoice;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;

@AllArgsConstructor
public class ThreeChoiceQuestionInfomation {
    @Getter
    private final Question question;
    @Getter
    private final ThreeChoiceQuizChoiceA threeChoiceQuizChoiceA;
    @Getter
    private final ThreeChoiceQuizChoiceB threeChoiceQuizChoiceB;
    @Getter
    private final ThreeChoiceQuizChoiceC threeChoiceQuizChoiceC;
    @Getter
    private final CorrectAnswerChoice answer;
    @Getter
    private final Explanation explanation;
}
