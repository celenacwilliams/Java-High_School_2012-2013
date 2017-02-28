//Celena

import java.awt.*;
import BreezyGUI.*;

public class Numbers extends GBFrame {
    //Creates and adds content to the window.
    Label number1Label = addLabel ("Number 1", 1, 1, 1, 1);
    DoubleField number1Field = addDoubleField (0, 1, 2, 1, 1);
    Label number2Label = addLabel ("Number 2", 2, 1, 1, 1);
    DoubleField number2Field = addDoubleField (0, 2, 2, 1, 1);
    Button maxButton = addButton ("Max", 3, 1, 1, 1);
    Button minButton = addButton ("Min", 3, 2, 1, 1);
    Label maxLabel = addLabel ("Max", 4, 1, 1, 1);
    DoubleField maxField = addDoubleField (0, 4, 2, 1, 1);
    Label minLabel = addLabel ("Min", 5, 1, 1, 1);
    DoubleField minField = addDoubleField (0, 5, 2, 1, 1);

    double number1, number2, max, min;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        number1 = number1Field.getNumber ();
        number2 = number2Field.getNumber ();

        if (buttonObj == maxButton) {
            max = Math.max (number1, number2);
            maxField.setNumber (max);
        }//END if (buttonObj == maxButton)
        else {
            min = Math.min (number1, number2);
            minField.setNumber (min);
        }//END else
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Numbers ();
        frm.setSize (200, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Numbers