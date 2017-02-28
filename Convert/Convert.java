//Celena

import java.awt.*;
import BreezyGUI.*;

public class Convert extends GBFrame {
    //Creates and adds content to the window.
    Label inputLabel = addLabel ("Enter a number:", 1, 1, 1, 1);
    IntegerField inputField = addIntegerField (0, 1, 2, 1, 1);
    Button absoluteButton = addButton ("Absolute Value", 2, 1, 1, 1);
    Button squareButton = addButton ("Square Root", 2, 2, 1, 1);
    Label absoluteLabel = addLabel ("Absolute Value", 3, 1, 1, 1);
    IntegerField absoluteField = addIntegerField (0, 3, 2, 1, 1);
    Label squareLabel = addLabel ("Square Root", 4, 1, 1, 1);
    DoubleField squareField = addDoubleField (0, 4, 2, 1, 1);

    int number, absoluteValue;
    double squareRoot;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        number = inputField.getNumber ();

        if (buttonObj == absoluteButton) {
            absoluteValue = Math.abs (number);
            absoluteField.setNumber (absoluteValue);
        }//END if (buttonObj == absoluteButton)
        else {
            squareRoot = Math.sqrt (number);
            squareField.setNumber (squareRoot);
        }//END else
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Convert ();
        frm.setSize (200, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Convert