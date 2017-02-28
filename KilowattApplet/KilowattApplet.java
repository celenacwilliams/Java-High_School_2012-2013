//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KilowattApplet extends Applet implements ActionListener {
    Label welcome = new Label ("Welcome to the Appliance Energy Calculator");
    Label costKwhrLabel = new Label
                         ("Please enter the cost per kilowatt-hour in cents: ");
        TextField costKwhrField = new TextField (5);
    Label hoursPerYearLabel = new Label
                                 ("Please enter the kilowatt-hours consumed: ");
        TextField hoursPerYearField = new TextField (5);
    Button calcButton = new Button ("Calculate");
    Label outputLabel = new Label
              ("Click the Calculate button to display the average every cost.");

    public void init () {
        setBackground (Color.magenta);
        add (welcome);
        add (costKwhrLabel);
        add (costKwhrField);
        add (hoursPerYearLabel);
        add (hoursPerYearField);
        add (calcButton);
        calcButton.addActionListener (this);
        add (outputLabel);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        double costKwhr = Double.parseDouble (costKwhrField.getText ());
        double KwHours = Double.parseDouble (hoursPerYearField.getText ());
        double average = costKwhr * KwHours;
        outputLabel.setText ("The average annual cost to operate this " + 
                         "appliance is $" + Math.round (average  * 100) / 100D);
    }//END public void actionPerformed (ActionEvent e)
}//END public class KilowattApplet