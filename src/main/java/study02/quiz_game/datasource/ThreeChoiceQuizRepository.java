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
        return new ThreeChoiceQuizNumber(1);
    }

    @Override
    public void register(ThreeChoiceQuiz threeChoiceQuiz) {
        // 永続化
        threeChoiceQuizMapper.insert(
                threeChoiceQuiz.getQuizNumber().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getQuestion().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizChoiceA().getValue().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizChoiceB().getValue().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizChoiceC().getValue().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getAnswer().getValue().getValue(),
                threeChoiceQuiz.getThreeChoiceQuestionInfomation().getExplanation().getValue()
        );
    }

}
