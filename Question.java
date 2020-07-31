package com.example.uopeople;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    QuestionDialog question;

    String correctAnswer;

    // a constructor that initializes instance variable "question"
    Question(String question){
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1)); // single-column grid layout
        this.question.add(new JLabel("    "+question+"    ",JLabel.CENTER)); // adds a text label using the constructor's String parameter
    }

    void initQuestionDialog() {
        this.question.setModal(true); // // makes instance variable "question" modal
        this.question.pack(); // sets its size with "pack"
        this.question.setLocationRelativeTo(null); // position in the center of the screen
    }

    String ask() {
        question.setVisible(true); // makes the instance variable "question" visible
        return question.answer; // returns the value "question.answer"
    }

    void check() {
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
    }
}