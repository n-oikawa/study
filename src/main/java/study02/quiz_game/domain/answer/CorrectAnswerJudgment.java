package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CorrectAnswerJudgment {
    CORRECT_ANSWER("正解"),
    INCORRECT_ANSWER("不正解");

    @Getter
    private final String correctAnswerJudgementValie;
}
