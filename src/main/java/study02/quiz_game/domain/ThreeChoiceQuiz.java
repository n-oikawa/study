package study02.quiz_game.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.question.ThreeChoiceQuizQuestion;

@AllArgsConstructor
public class ThreeChoiceQuiz {
    @Getter
    private final ThreeChoiceQuizNumber quizNumber;
    @Getter
    private final ThreeChoiceQuizQuestion question;
    @Getter
    private final ThreeChoiceQuizAnswer answer;
}
