//Celena

import java.awt.*;
import BreezyGUI.*;

public class Dice extends GBFrame {
    //Creates and adds content to the window.
    Label dice1Label = addLabel ("Dice1", 1, 1, 1, 1);
    IntegerField dice1Field = addIntegerField (0, 1, 2, 1, 1);
    Label average1Label = addLabel ("Average1", 1, 3, 1, 1);
    DoubleField average1Field = addDoubleField (0, 1, 4, 1, 1);
    Label dice2Label = addLabel ("Dice2", 2, 1, 1, 1);
    IntegerField dice2Field = addIntegerField (0, 2, 2, 1, 1);
    Label average2Label = addLabel ("Average2", 2, 3, 1, 1);
    DoubleField average2Field = addDoubleField (0, 2, 4, 1, 1);
    Button rollButton = addButton ("Roll", 3, 1, 1, 1);
    Label rollsLabel = addLabel ("Rolls", 3, 3, 1, 1);
    IntegerField rollsField = addIntegerField (0, 3, 4, 1, 1);

    int numberOfRolls = 0;
    int dice1, dice2;
    double dice1Total = 0;
    double dice2Total = 0;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        numberOfRolls = numberOfRolls + 1;
        dice1 = (int) (1 + Math.random () * 6);
        dice2 = (int) (1 + Math.random () * 6);
        dice1Total = dice1Total + dice1;
        dice2Total = dice2Total + dice2;

        dice1Field.setNumber (dice1);
        dice2Field.setNumber (dice2);
        average1Field.setNumber (dice1Total / numberOfRolls);
        average2Field.setNumber (dice2Total / numberOfRolls);
        rollsField.setNumber (numberOfRolls);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Dice ();
        frm.setSize (400, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Dice