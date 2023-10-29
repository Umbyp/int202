package com.example.quiz.session.mvc.model;

import com.example.quiz.session.mvc.utils.CSVLoader;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@Setter
@Getter
@ToString
public class QuizSession {
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int  correctAnswerCount = 0;


    public void fetchQuestion(){
        questions = CSVLoader.getQuestions();
    }

    public void moveToNextQuestion(){
            currentQuestionIndex++;
        }



    public boolean isQuizEnded(){
        return currentQuestionIndex==questions.size();
    }

    public void checkCorrectQuestion(int selectedIndex){
          if(questions.get(currentQuestionIndex).checkAnswer(selectedIndex)){
              correctAnswerCount++;
          }

    }

    public void resetQuiz(){
        currentQuestionIndex=0;
        correctAnswerCount=0;
    }
}
