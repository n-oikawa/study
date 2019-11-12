package study02.quiz_game.domain.question;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuizQuestion {
    @Getter
    private final Question question;
    @Getter
    private final ThreeChoiceQuizChoiceA threeChoiceQuizChoiceA;
    @Getter
    private final ThreeChoiceQuizChoiceB threeChoiceQuizChoiceB;
    @Getter
    private final ThreeChoiceQuizChoiceC threeChoiceQuizChoiceC;
}
