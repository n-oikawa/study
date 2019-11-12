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
        return new ThreeChoiceQuizNumber(1);
    }

    @Override
    public void register(ThreeChoiceQuiz threeChoiceQuiz) {
        // 永続化
        threeChoiceQuizMapper.insert(
                threeChoiceQuiz.getQuizNumber().getValue(),
                threeChoiceQuiz.getQuestion().getQuestion().getValue(),
                threeChoiceQuiz.getQuestion().getThreeChoiceQuizChoiceA().getValue().getValue(),
                threeChoiceQuiz.getQuestion().getThreeChoiceQuizChoiceB().getValue().getValue(),
                threeChoiceQuiz.getQuestion().getThreeChoiceQuizChoiceC().getValue().getValue(),
                threeChoiceQuiz.getAnswer().getCorrectAnswerChoice().getValue().getValue(),
                threeChoiceQuiz.getAnswer().getExplanation().getValue()
        );
    }

}
