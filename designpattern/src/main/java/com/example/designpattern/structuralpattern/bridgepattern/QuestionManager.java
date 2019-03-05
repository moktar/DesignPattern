package com.example.designpattern.structuralpattern.bridgepattern;

import android.util.Log;

public class QuestionManager {

    public Question q;
    public String catalog;
    public QuestionManager(String catalog) {
        this.catalog=catalog;
    }

    public void next() {
        q.nextQuestion();
    }
    public void previous() {
        q.previousQuestion();
    }
    public void newOne(String quest) {
        q.newQuestion(quest);
    }
    public void delete(String quest) {
        q.deleteQuestion(quest);
    }
    public void display() {
        q.displayQuestion();
    }
    public void displayAll() {
        Log.i("Question: ","Question Paper: " + catalog);
        q.displayAllQuestions();
    }
}
