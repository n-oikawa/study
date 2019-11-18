package study02.quiz_game.domain;

import study02.quiz_game.domain.question.ThreeChoiceQuestionInfomation;

public interface IThreeChoiceQuizRepository {

    public ThreeChoiceQuizNumber assignment();

    void register(ThreeChoiceQuiz threeChoiceQuiz);
}