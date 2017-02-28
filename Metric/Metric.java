//Celena

import java.awt.*;
import BreezyGUI.*;

public class Metric extends GBFrame {
    //Creates and adds content to the window.
    Label metersLabel = addLabel ("Meters", 1, 1, 1, 1);
    DoubleField metersField = addDoubleField (0, 1, 3, 1, 1);
    Label yardsLabel = addLabel ("Yards", 2, 1, 1, 1);
    DoubleField yardsField = addDoubleField (0, 2, 3, 1, 1);
    Label feetLabel = addLabel ("Feet", 3, 1, 1, 1);
    DoubleField feetField = addDoubleField (0, 3, 3, 1, 1);
    Label inchesLabel = addLabel ("Inches", 4, 1, 1, 1);
    DoubleField inchesField = addDoubleField (0, 4, 3, 1, 1);
    Button convertButton = addButton ("Convert", 5, 2, 1, 1);

    final double CENTIMETERS_PER_INCH = 2.540005;
    double meters, inchesLeft;
    int yards, feet;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        meters = metersField.getNumber ();

        inchesLeft = meters * 100 / CENTIMETERS_PER_INCH;
        yards = (int) inchesLeft / 36;
        inchesLeft = inchesLeft % 36;
        feet = (int) inchesLeft / 12;
        inchesLeft = inchesLeft %12;

        yardsField.setNumber (yards);
        feetField.setNumber (feet);
        inchesField.setNumber (inchesLeft);
        inchesField.setPrecision (6);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Metric ();
        frm.setSize (300, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Metric