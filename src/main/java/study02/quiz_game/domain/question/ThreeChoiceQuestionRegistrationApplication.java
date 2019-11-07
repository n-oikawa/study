package study02.quiz_game.domain.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;

@AllArgsConstructor
public class ThreeChoiceQuestionRegistrationApplication {
    @Getter
    private final ThreeChoiceQuizQuestion question;
    @Getter
    private final ThreeChoiceQuizAnswer answer;
}
