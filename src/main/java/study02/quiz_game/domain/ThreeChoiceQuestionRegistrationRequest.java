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

    private final String threeChoiceQuestion = "及川は今何歳？";
    private final String threeChoiceA = "32歳";
    private final String threeChoiceB = "33歳";
    private final String threeChoiceC = "34歳";
    private final String answerChoice = "33歳";
    private final String explanation = "解説";

    public ThreeChoiceQuestionRegistrationApplication create() {
        return new ThreeChoiceQuestionRegistrationApplication(
                new ThreeChoiceQuizQuestion(
                        new Question(threeChoiceQuestion),
                        new ThreeChoiceQuizChoiceA(new ThreeChoiceQuizChoice(threeChoiceA)),
                        new ThreeChoiceQuizChoiceB(new ThreeChoiceQuizChoice(threeChoiceB)),
                        new ThreeChoiceQuizChoiceC(new ThreeChoiceQuizChoice(threeChoiceC))
                ),
                new ThreeChoiceQuizAnswer(
                        new CorrectAnswerChoice(new ThreeChoiceQuizChoice(answerChoice)),
                        new Explanation(explanation)
                )
        );
    }
}
