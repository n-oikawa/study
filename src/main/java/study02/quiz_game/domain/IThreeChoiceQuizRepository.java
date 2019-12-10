package study02.quiz_game.domain;

public interface IThreeChoiceQuizRepository {

    public ThreeChoiceQuizNumber assignment();

    public ThreeChoiceQuizList refer();

    void register(ThreeChoiceQuiz threeChoiceQuiz);
}