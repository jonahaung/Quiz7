package com.example.uopeople;
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

    // Constructor
    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        // calls superclass constructor with first parameter
        super(query);

        // calls "addChoice" using next five parameters
        addChoice("A", a);
        addChoice("B", b);
        addChoice("C", c);
        addChoice("D", d);
        addChoice("E", e);

        // calls "initQuestionDialog"
        initQuestionDialog();

        // initializes the instance variable "correctAnswer" with its last parameter
        correctAnswer = answer.toUpperCase();
    }

    void addChoice(String name, String label) {
        // creates a panel with a border layout
        JPanel choice = new JPanel(new BorderLayout());
        // creates a button using first String parameter
        JButton button = new JButton(name);
        // adds the instance variable "question" as a listener for the button
        button.addActionListener(question);
        // adds the button to the left side of the panel
        choice.add(button,BorderLayout.WEST);
        // adds a label to the center of the panel using second String parameter
        choice.add(new JLabel(label + "    ", JLabel.LEFT), BorderLayout.CENTER);
        // adds the panel to the instance variable "question"
        question.add(choice);
    }
}