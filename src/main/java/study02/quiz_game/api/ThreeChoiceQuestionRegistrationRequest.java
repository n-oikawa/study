package study02.quiz_game.api;

import lombok.Getter;
import lombok.Setter;
import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;
import study02.quiz_game.domain.ThreeChoiceQuizChoice;
import study02.quiz_game.domain.answer.CorrectAnswerChoice;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.question.*;

import java.util.ArrayList;
import java.util.List;

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

        List<ThreeChoiceQuizChoice> list = new ArrayList<>();
        list.add(new ThreeChoiceQuizChoice(threeChoiceA));
        list.add(new ThreeChoiceQuizChoice(threeChoiceB));
        list.add(new ThreeChoiceQuizChoice(threeChoiceC));

        return new ThreeChoiceQuestionInfomation(
                        new ThreeChoiceQuizQuestion(
                                new Question(this.threeChoiceQuestion),
                                list
                        ),
                        new ThreeChoiceQuizAnswer(
                                new ThreeChoiceQuizChoice(answerChoice),
                                new Explanation(explanation)
                        )
        );
    }
}
