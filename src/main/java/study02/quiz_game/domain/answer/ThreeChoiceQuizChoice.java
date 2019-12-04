package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuizChoice {
    @Getter
    private final ThreeChoiceQuizSelectionItemA threeChoiceQuizSelectionItemA;
    @Getter
    private final ThreeChoiceQuizSelectionItemB threeChoiceQuizSelectionItemB;
    @Getter
    private final ThreeChoiceQuizSelectionItemC threeChoiceQuizSelectionItemC;
}
