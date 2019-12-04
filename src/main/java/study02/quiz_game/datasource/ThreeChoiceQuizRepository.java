package study02.quiz_game.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;

@Repository
public class ThreeChoiceQuizRepository implements IThreeChoiceQuizRepository {

    @Autowired
    private ThreeChoiceQuizMapper threeChoiceQuizMapper;

    @Override
    public ThreeChoiceQuizNumber assignment() {
        // 番号払い出し
        threeChoiceQuizMapper.issue();
        return new ThreeChoiceQuizNumber(threeChoiceQuizMapper.find());
    }

    @Override
    public void register(ThreeChoiceQuiz threeChoiceQuiz) {
        // 永続化
        threeChoiceQuizMapper.insert(
                threeChoiceQuiz.getQuizNumber().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizQuestion()
                        .getQuestion()
                        .getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getThreeChoiceQuizChoice()
                        .getThreeChoiceQuizSelectionItemA()
                        .getThreeChoiceQuizSelectionItemValue()
                        .getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getThreeChoiceQuizChoice()
                        .getThreeChoiceQuizSelectionItemA()
                        .getCorrectAnswerJudgment()
                        .getCorrectAnswerJudgementValie(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getThreeChoiceQuizChoice()
                        .getThreeChoiceQuizSelectionItemB()
                        .getThreeChoiceQuizSelectionItemValue()
                        .getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getThreeChoiceQuizChoice()
                        .getThreeChoiceQuizSelectionItemB()
                        .getCorrectAnswerJudgment()
                        .getCorrectAnswerJudgementValie(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getThreeChoiceQuizChoice()
                        .getThreeChoiceQuizSelectionItemC()
                        .getThreeChoiceQuizSelectionItemValue()
                        .getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getThreeChoiceQuizChoice()
                        .getThreeChoiceQuizSelectionItemC()
                        .getCorrectAnswerJudgment()
                        .getCorrectAnswerJudgementValie(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation()
                        .getThreeChoiceQuizAnswer()
                        .getExplanation()
                        .getValue()
        );
    }

}
