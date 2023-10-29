package com.example.quiz.session.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Question {
    private String title;
    private List<String> options;
    private int correctAnswerIndex;
    public boolean checkAnswer(int selectedIndex){
        return selectedIndex==correctAnswerIndex ;
    }
}
