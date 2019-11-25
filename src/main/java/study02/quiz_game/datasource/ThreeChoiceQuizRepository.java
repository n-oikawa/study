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
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizQuestion().getQuestion().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizQuestion().getThreeChoiceQuizChoices().get(0).getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizQuestion().getThreeChoiceQuizChoices().get(1).getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizQuestion().getThreeChoiceQuizChoices().get(2).getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizAnswer().getThreeChoiceQuizChoice().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizAnswer().getExplanation().getValue()
        );
    }

}
