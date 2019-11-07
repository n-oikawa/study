package study02.quiz_game.domain.question;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreeChoiceQuizQuestion {
    private final Question question;
    private final ThreeChoiceQuizChoiceA threeChoiceQuizChoiceA;
    private final ThreeChoiceQuizChoiceB threeChoiceQuizChoiceB;
    private final ThreeChoiceQuizChoiceC threeChoiceQuizChoiceC;
}
