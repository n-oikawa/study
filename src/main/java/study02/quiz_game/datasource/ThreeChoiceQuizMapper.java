package study02.quiz_game.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ThreeChoiceQuizMapper {

    @Insert(
            "INSERT INTO three_choice_quiz_event (" +
                    "three_choice_quiz_number, " +
                    "question, " +
                    "three_choice_quiz_choice_a, " +
                    "three_choice_quiz_choice_b, " +
                    "three_choice_quiz_choice_c, " +
                    "connect_answer_choice, " +
                    "explanation, " +
                    "system_date" +
                    ") VALUES (" +
                    "#{threeChoiceQuizNumber}, " +
                    "#{question}, " +
                    "#{threeChoiceQuizChoiceA}, " +
                    "#{threeChoiceQuizChoiceB}, " +
                    "#{threeChoiceQuizChoiceC}, " +
                    "#{connectAnswerChoice}, " +
                    "#{explanation}, " +
                    "sysdate" +
                    ")"
    )
    void insert(
            @Param("threeChoiceQuizNumber") Integer threeChoiceQuizNumber,
            @Param("question") String question,
            @Param("threeChoiceQuizChoiceA") String threeChoiceQuizChoiceA,
            @Param("threeChoiceQuizChoiceB") String threeChoiceQuizChoiceB,
            @Param("threeChoiceQuizChoiceC") String threeChoiceQuizChoiceC,
            @Param("connectAnswerChoice") String connectAnswerChoice,
            @Param("explanation") String explanation
    );
}
