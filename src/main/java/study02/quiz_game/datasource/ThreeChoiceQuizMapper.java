package study02.quiz_game.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ThreeChoiceQuizMapper {

    @Insert("UPDATE three_choice_quiz_sequence SET id = (id + 1)")
    void issue();

    @Select("SELECT id FROM three_choice_quiz_sequence")
    int find();

    @Insert(
            "INSERT INTO three_choice_quiz_event (" +
                    "three_choice_quiz_number, " +
                    "question, " +
                    "three_choice_quiz_choice_a, " +
                    "correct_answer_judgement_a, " +
                    "three_choice_quiz_choice_b, " +
                    "correct_answer_judgement_b, " +
                    "three_choice_quiz_choice_c, " +
                    "correct_answer_judgement_C, " +
                    "explanation, " +
                    "system_date" +
                    ") VALUES (" +
                    "#{threeChoiceQuizNumber}, " +
                    "#{question}, " +
                    "#{threeChoiceQuizChoiceA}, " +
                    "#{correctAnswerJudgementA}, " +
                    "#{threeChoiceQuizChoiceB}, " +
                    "#{correctAnswerJudgementB}, " +
                    "#{threeChoiceQuizChoiceC}, " +
                    "#{correctAnswerJudgementC}, " +
                    "#{explanation}, " +
                    "sysdate" +
                    ")"
    )
    void insert(
            @Param("threeChoiceQuizNumber") Integer threeChoiceQuizNumber,
            @Param("question") String question,
            @Param("threeChoiceQuizChoiceA") String threeChoiceQuizChoiceA,
            @Param("correctAnswerJudgementA") String correctAnswerJudgementA,
            @Param("threeChoiceQuizChoiceB") String threeChoiceQuizChoiceB,
            @Param("correctAnswerJudgementB") String correctAnswerJudgementB,
            @Param("threeChoiceQuizChoiceC") String threeChoiceQuizChoiceC,
            @Param("correctAnswerJudgementC") String correctAnswerJudgementC,
            @Param("explanation") String explanation
    );
}
