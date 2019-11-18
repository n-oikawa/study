package study02.quiz_game.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;
import study02.quiz_game.domain.question.ThreeChoiceQuestionInfomation;

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
    public void register(
            ThreeChoiceQuizNumber threeChoiceQuizNumber,
            ThreeChoiceQuestionInfomation threeChoiceQuestionInfomation) {
        // 永続化
        threeChoiceQuizMapper.insert(
                threeChoiceQuizNumber.getValue(),
                threeChoiceQuestionInfomation.getQuestion().getValue(),
                threeChoiceQuestionInfomation.getThreeChoiceQuizChoiceA().getValue().getValue(),
                threeChoiceQuestionInfomation.getThreeChoiceQuizChoiceB().getValue().getValue(),
                threeChoiceQuestionInfomation.getThreeChoiceQuizChoiceC().getValue().getValue(),
                threeChoiceQuestionInfomation.getAnswer().getValue().getValue(),
                threeChoiceQuestionInfomation.getExplanation().getValue()
        );
    }

}
