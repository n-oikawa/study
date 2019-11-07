package study02.quiz_game.domain;

import lombok.AllArgsConstructor;
import study02.quiz_game.domain.answer.CorrectAnswerChoice;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.question.Question;
import study02.quiz_game.domain.question.ThreeChoiceQuestionRegistrationApplication;
import study02.quiz_game.domain.question.ThreeChoiceQuizChoiceA;
import study02.quiz_game.domain.question.ThreeChoiceQuizChoiceB;
import study02.quiz_game.domain.question.ThreeChoiceQuizChoiceC;
import study02.quiz_game.domain.question.ThreeChoiceQuizQuestion;

@AllArgsConstructor
public class ThreeChoiceQuestionRegistrationRequest {

    private final String threeChoiceQuestion;
    private final String threeChoiceA;
    private final String threeChoiceB;
    private final String threeChoiceC;
    private final String answerChoice;
    private final String explanation;

    public ThreeChoiceQuestionRegistrationApplication create() {
        return new ThreeChoiceQuestionRegistrationApplication(
                new ThreeChoiceQuizQuestion(
                        new Question(threeChoiceQuestion),
                        new ThreeChoiceQuizChoiceA(threeChoiceA),
                        new ThreeChoiceQuizChoiceB(threeChoiceB),
                        new ThreeChoiceQuizChoiceC(threeChoiceC)
                ),
                new ThreeChoiceQuizAnswer(
                        new CorrectAnswerChoice(answerChoice),
                        new Explanation(explanation)
                )
        );
    }
}
