package study02.quiz_game.api;

import lombok.Getter;
import lombok.Setter;
import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;
import study02.quiz_game.domain.answer.CorrectAnswerJudgment;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.answer.ThreeChoiceQuizChoice;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemA;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemB;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemC;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemValue;
import study02.quiz_game.domain.question.Question;
import study02.quiz_game.domain.question.ThreeChoiceQuizQuestion;

public class ThreeChoiceQuestionRegistrationRequest {
    @Getter
    @Setter
    private String threeChoiceQuestion;
    @Getter
    @Setter
    private String threeChoiceSelectionItemA;
    @Getter
    @Setter
    private String threeChoiceSelectionItemB;
    @Getter
    @Setter
    private String threeChoiceSelectionItemC;
    @Getter
    @Setter
    private String answerChoiceSelectionItem;
    @Getter
    @Setter
    private String explanation;

    public ThreeChoiceQuestionInfomation create() {

        CorrectAnswerJudgment correctAnswerJudgementA = (threeChoiceSelectionItemA.equals(answerChoiceSelectionItem)) ? CorrectAnswerJudgment.CORRECT_ANSWER : CorrectAnswerJudgment.INCORRECT_ANSWER;
        CorrectAnswerJudgment correctAnswerJudgementB = (threeChoiceSelectionItemB.equals(answerChoiceSelectionItem)) ? CorrectAnswerJudgment.CORRECT_ANSWER : CorrectAnswerJudgment.INCORRECT_ANSWER;
        CorrectAnswerJudgment correctAnswerJudgementC = (threeChoiceSelectionItemC.equals(answerChoiceSelectionItem)) ? CorrectAnswerJudgment.CORRECT_ANSWER : CorrectAnswerJudgment.INCORRECT_ANSWER;

        return new ThreeChoiceQuestionInfomation(
                new ThreeChoiceQuizQuestion(
                        new Question(this.threeChoiceQuestion)
                ),
                new ThreeChoiceQuizAnswer(
                        new ThreeChoiceQuizChoice(
                                new ThreeChoiceQuizSelectionItemA(
                                        new ThreeChoiceQuizSelectionItemValue(threeChoiceSelectionItemA),
                                        correctAnswerJudgementA
                                ),
                                new ThreeChoiceQuizSelectionItemB(
                                        new ThreeChoiceQuizSelectionItemValue(threeChoiceSelectionItemB),
                                        correctAnswerJudgementB
                                ),
                                new ThreeChoiceQuizSelectionItemC(
                                        new ThreeChoiceQuizSelectionItemValue(threeChoiceSelectionItemC),
                                        correctAnswerJudgementC
                                )
                        ),
                        new Explanation(explanation)
                )
        );
    }
}
