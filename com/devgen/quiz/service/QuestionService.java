package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

import java.util.Scanner;

public class QuestionService {
    //maintaining questions =(CRUD management)

    private Question[] questions = new Question[5];// for now we dont know database so we storing in memory


    public QuestionService() {
        questions[0] = new Question(1, "size of short datatype?", "2", "4", "1", "8", "2");
        questions[1] = new Question(2, "size of int datatype?", "2", "4", "1", "8", "4");
        questions[2] = new Question(3, "size of float datatype?", "2", "4", "1", "8", "4");
        questions[3] = new Question(4, "size of double datatype?", "2", "4", "1", "8", "8");
        questions[4] = new Question(5, "size of char datatype?", "2", "4", "1", "8", "2");
    }

    // CRUP OPERSTION OR MANAGEMENT
    public String addQuetion(Question question) {
        return "Quetions add succefully";
    }

    public String updateQuetion(Question question) {
        return "Quetions updated succefully";
    }

    public String deletQuetion(int id) {
        return "Quetions deleted  succefully";
    }

    public Question[] getAllQuetion() {
        return questions;
    }
}


