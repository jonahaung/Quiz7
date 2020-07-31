package com.example.uopeople;
import java.awt.event.*;
import javax.swing.*;

// a class that extends "JDialog" and implements "ActionListener"
public class QuestionDialog extends JDialog implements ActionListener {

    String answer;

    // this method uses its "ActionEvent" parameter to set the instance variable "answer" and then calls the inherited "dispose" method
    public void actionPerformed(ActionEvent e) {
        answer = e.getActionCommand();
        dispose();
    }

}
