package study02.quiz_game.domain;

public interface IThreeChoiceQuizRepository {

    public ThreeChoiceQuizNumber assignment();

    public void register(ThreeChoiceQuiz threeChoiceQuiz);
}