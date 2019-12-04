package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuizSelectionItemC implements ThreeChoiceQuizSelectionItem {
    @Getter
    private final ThreeChoiceQuizSelectionItemValue threeChoiceQuizSelectionItemValue;
    @Getter
    private final CorrectAnswerJudgment correctAnswerJudgment;
}
