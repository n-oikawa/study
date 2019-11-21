package study02.quiz_game.domain;

public interface IThreeChoiceQuizRepository {

    public ThreeChoiceQuizNumber assignment();

    void register(ThreeChoiceQuiz threeChoiceQuiz);
}