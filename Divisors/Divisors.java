//Celena

import java.awt.*;
import BreezyGUI.*;

public class Divisors extends GBFrame {
    //Creates and adds content to the window.
    Label numberLabel = addLabel ("Number", 1, 1, 1, 1);
    IntegerField numberField = addIntegerField(0, 1, 2, 1, 1);
    Label divisorsLabel = addLabel ("Count of divisors", 2, 1, 1, 1);
    IntegerField countField = addIntegerField (0, 2, 2, 1, 1);
    Button countButton = addButton ("Count", 3, 1, 1, 1);

    int number;			//The number entered by the user
    int count;			//A count of the divisors
    int trialDivisor;           //A trial divisor
    int limit;			//The limit for the while loop

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        number = numberField.getNumber();

        if (number < 0)
            number = -number;

        count = 0;
        trialDivisor = 2;
        limit = number / 2 + 1;

        while (trialDivisor < limit) {
            if (number % trialDivisor == 0)
                count = count + 1;

            trialDivisor = trialDivisor + 1;
        }//END while (trialDivisor < limit)
        countField.setNumber (count);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Divisors();
        frm.setSize(200, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Divisors
