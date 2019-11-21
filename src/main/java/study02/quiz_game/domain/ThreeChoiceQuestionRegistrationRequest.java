package study02.quiz_game.domain;

import lombok.Getter;
import lombok.Setter;
import study02.quiz_game.domain.answer.CorrectAnswerChoice;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.question.*;

public class ThreeChoiceQuestionRegistrationRequest {
    @Getter
    @Setter
    private String threeChoiceQuestion;
    @Getter
    @Setter
    private String threeChoiceA;
    @Getter
    @Setter
    private String threeChoiceB;
    @Getter
    @Setter
    private String threeChoiceC;
    @Getter
    @Setter
    private String answerChoice;
    @Getter
    @Setter
    private String explanation;

    public ThreeChoiceQuestionInfomation create() {
        return new ThreeChoiceQuestionInfomation(
                        new ThreeChoiceQuizQuestion(
                                new Question(this.threeChoiceQuestion),
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
