//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PracticeApplet extends Applet implements ActionListener {
    Label gradeLabel = new Label ("Grades");
    Label gradePromptLabel = new Label ("Enter Grade:");
            TextField gradePromptField = new TextField (5);
    Button enterButton = new Button ("Enter");
    Label outputLabel = new Label ("                              ");

    public void init () {
        add (gradeLabel);
        add (gradePromptLabel);
        add (gradePromptField);
        gradePromptField.requestFocus ();
        add (enterButton);
        enterButton.addActionListener (this);
        add (outputLabel);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        int grade = Integer.parseInt (gradePromptField.getText ());

        if (grade >= 70)
            outputLabel.setText ("You passed");
        else
            if (grade <= 69)
                outputLabel.setText ("You failed");
    }//END public void actionPerformed (ActionEvent e)
}//END public class PracticeApplet