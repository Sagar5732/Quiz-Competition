package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

import java.util.Scanner;

public class QuizService {

    private String[] userSelectedAnswers = new String[5];// to store user selected anser

    // for the two mwthoda playquiz and printfinalscore need quetion service object for quetions
    private Question[] questions;// questions array

    // to play quiz we need quetion
    public QuizService() {
        // calling questionservice object through quizservice constructor
        QuestionService questionService = new QuestionService();
        questions = questionService.getAllQuetion();// giving all quetion by question service store in quetions array
    }

    public void playQuiz() {


        //no need multiple scanner class so we declare it here for optimization
        Scanner scan = new Scanner(System.in);
        // using quetions from quetion array to play quiz and printfinalscore methods
        for (int i = 0; i < questions.length; i++) {

            System.out.println("Quetion: " + questions[i].getId());
            System.out.println(questions[i].getQuetion());
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());


            userSelectedAnswers[i] = scan.next();// here user selected answer will be stored in array
        }
        // to avoid scanner class leaking we have to close it
        scan.close();

    }

    public void printFinalScore() {
        // comparing user selected ans are correct or not
        int corretAnswer = 0;
        for (int i = 0; i < userSelectedAnswers.length; i++) {
            if (questions[i].getAnswer().equals(userSelectedAnswers[i])) {
                corretAnswer++;
            }
        }
        // for remaining incorrect answer
        int incorrectAnswer = questions.length - corretAnswer;
        double percentage = (corretAnswer * 100.0) / questions.length;

        //printing final answer with corrected, incorrect and percenage
        System.out.println("correct answer = " + corretAnswer);
        System.out.println("incorrect answer = " + incorrectAnswer);
        System.out.println("percentage = " + percentage);
    }
}
