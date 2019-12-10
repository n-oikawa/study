package study02.quiz_game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizList;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;

@Service
public class ThreeChoiceQuizReferService {

    @Autowired
    private IThreeChoiceQuizRepository iThreeChoiceQuizRepository;

    public ThreeChoiceQuizNumber refer() {

        // 三択クイズ番号払い出し
        ThreeChoiceQuizList threeChoiceQuizList = iThreeChoiceQuizRepository.refer();

        return threeChoiceQuizList.getRand().getQuizNumber();
    }
}
