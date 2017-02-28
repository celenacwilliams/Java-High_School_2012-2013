//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OhmsLawApplet extends Applet implements ActionListener {
    Label welcome = new Label ("The Ohm's Law Calculator");
    Label voltageLabel = new Label ("What is the voltage? ");
            TextField voltageField = new TextField (5);
    Label resistanceLabel = new Label ("What is the resistance? ");
            TextField resistanceField = new TextField (5);
    Button calcButton = new Button ("Calculate");
    Label outputLabel = new Label
                        ("Click the Calculate button to display your current.");

    public void init () {
        add (welcome);
        add (voltageLabel);
        add (voltageField);
        add (resistanceLabel);
        add (resistanceField);
        add (calcButton);
        calcButton.addActionListener (this);
        add (outputLabel);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        int voltage = Integer.parseInt (voltageField.getText ());
        int resistance = Integer.parseInt (resistanceField.getText ());
        double current = voltage / resistance;
        outputLabel.setText ("The current is " + current + "." );
    }//END public void actionPerformed (ActionEvent e)
}//END public class OhmsLawApplet