//Celena

import java.awt.*;
import BreezyGUI.*;

public class Telephone extends GBFrame {
    //Creates and adds content to the window.
    Label lengthLabel = addLabel ("Length of Call", 1, 1, 1, 1);
    DoubleField lengthField = addDoubleField (0, 1, 2, 1, 1);
    Button calculateButton = addButton ("Calculate", 2, 1, 1, 1);
    Label costLabel = addLabel ("Cost of call", 3, 1, 1, 1);
    DoubleField costField = addDoubleField (0, 3, 2, 1, 1);

    double time, cost, overTime;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        time = lengthField.getNumber();
        overTime = (time - 2) * .5;

        if (time > 2)
            cost = 1.15 + overTime;
        else
           cost = 1.15;

        costField.setNumber(cost);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args){
        Frame frm = new Telephone();
        frm.setSize (200, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Telephone