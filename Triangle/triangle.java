//Celena

import java.awt.*;
import BreezyGUI.*;

public class triangle extends GBFrame {
    //Creates and adds content to the window.
    Label sideOneLabel = addLabel ("Side One", 1, 1, 1, 1);
    IntegerField sideOneField = addIntegerField (0, 1, 2, 1, 1);
    Label sideTwoLabel = addLabel ("Side Two", 2, 1, 1, 1);
    IntegerField sideTwoField = addIntegerField (0, 2, 2, 1, 1);
    Label sideThreeLabel = addLabel ("Side Three (longest)", 3, 1, 1, 1);
    IntegerField sideThreeField = addIntegerField (0, 3, 2, 1, 1);
    Button countButton = addButton ("Count", 3, 1, 1, 1);

    int ab, c, one, two, three, total;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        one = sideOneField.getNumber();
        two = sideTwoField.getNumber();
        three = sideThreeField.getNumber();

        ab = (one * one) + (two * two);
        c = three * three;

        total = (ab) = c;


        if (total > 0)
            messageBox ("Right Triangle");
        else
            messageBox ("Error: Numbers cannot not be a negative number.");
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new triangle();
        frm.setSize(200, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class triangle
