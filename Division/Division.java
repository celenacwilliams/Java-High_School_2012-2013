//Celena

import java.awt.*;
import BreezyGUI.*;

public class Division extends GBFrame {
    //Creates and adds content to the window.
    Label numberOneLabel = addLabel ("First Number", 1, 1, 1, 1);
    IntegerField numberOneField = addIntegerField (0, 1, 2, 1, 1);
    Label numberTwoLabel = addLabel ("Second Number", 2, 1, 1, 1);
    IntegerField numberTwoField = addIntegerField (0, 2, 2, 1, 1);
    Button calculateButton = addButton ("Calculate", 3, 1, 1, 1);
    Label quotientLabel = addLabel ("Quotient", 4, 1, 1, 1);
    IntegerField quotientField = addIntegerField (0, 4, 2, 1, 1);
    Label remainderLabel = addLabel ("Remainder", 5, 1, 1, 1);
    IntegerField remainderField = addIntegerField(0, 5, 2, 1, 1);

    int first, second, quotient, remainder;
    String one, two;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        one = numberOneField.getText();
        two = numberTwoField.getText();
        first = Integer.parseInt(one);
        second = Integer.parseInt(two);

        if (first > second) {
            quotient = first / second;
            remainder = first % second;
        }//END (first > second)
        else
            if (first < second) {
                quotient = second / first;
                remainder = second % first;
            }//END if (first < second)
        quotientField.setNumber (quotient);
        remainderField.setNumber (remainder);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Division();
        frm.setSize(200, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Division