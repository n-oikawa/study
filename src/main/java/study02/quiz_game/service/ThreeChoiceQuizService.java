package study02.quiz_game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;
import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;

@Service
public class ThreeChoiceQuizService {

    @Autowired
    private IThreeChoiceQuizRepository iThreeChoiceQuizRepository;

    public ThreeChoiceQuizNumber regsiter(ThreeChoiceQuestionInfomation infomation) {

        // 三択クイズ番号払い出し
        ThreeChoiceQuizNumber threeChoiceQuizNumber = iThreeChoiceQuizRepository.assignment();

        // 登録
        iThreeChoiceQuizRepository.register(
                ThreeChoiceQuiz.create(threeChoiceQuizNumber, infomation));
        return threeChoiceQuizNumber;
    }
}
