package study02.quiz_game.datasource;

import org.springframework.stereotype.Repository;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;

@Repository
public class ThreeChoiceQuizRepository implements IThreeChoiceQuizRepository {

    @Override
    public ThreeChoiceQuizNumber assignment() {
        return new ThreeChoiceQuizNumber(1);
    }

    @Override
    public void register(ThreeChoiceQuiz threeChoiceQuiz) {
        // 永続化
    }

}
