package study02.quiz_game.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class ThreeChoiceQuizList {
    private final List<ThreeChoiceQuiz> threeChoiceQuizList;

    public ThreeChoiceQuiz getRand() {
        return threeChoiceQuizList.get(new Random().nextInt(threeChoiceQuizList.size()));
    }
}
