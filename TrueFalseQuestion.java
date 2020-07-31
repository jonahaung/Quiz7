package com.example.uopeople;
import javax.swing.*;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer) {

        // constructor that calls superclass constructor with first String parameter
        super(question);

        JPanel buttons = new JPanel();

        // calls "addButton" to add "TRUE" and "FALSE" buttons to a panel
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");

        // adds the panel to the instance variable "question"
        this.question.add(buttons);

        // calls "initQuestionDialog"
        initQuestionDialog();

        // initializes the instance variable "correctAnswer" with second String parameter called "answer"
        correctAnswer = answer.toUpperCase();

        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
        if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label); // constructs a button using String parameter called "label"
        button.addActionListener(question); // adds the instance variable "question" as a listener for the button
        buttons.add(button); // adds the button to "JPanel" parameter
    }
}