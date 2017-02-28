//Celena

import java.awt.*;
import BreezyGUI.*;

public class Palindrome extends GBFrame {
    //Creates and adds content to the window.
    Label stringLabel = addLabel ("String", 1, 1, 2, 1);
    TextField stringField = addTextField ("", 2, 1, 2, 1);
    Button testButton = addButton ("Test", 3, 1, 2, 1);

    public void buttonClicked (Button buttonObj) {
        //Gets the word and sends it to isPalindrome ()
        String aString = stringField.getText ();
        aString = aString.toUpperCase ();
        if (isPalindrome (aString))
            messageBox ("Yes, you entered a palindrome.");
        else
           messageBox ("No, you did not enter a palindrome.");
    }//END public void buttonClicked (Button buttonObj)

    private boolean isPalindrome (String s) {
        //Checks to see if the word entered is a palindrome.
        int lastPosition = s.length () - 1;
        int forward = 0;
        int backward = lastPosition;

        while (forward < backward) {
            if (s.charAt (forward) != s.charAt (backward))
                return false;
            forward++;
            backward--;
        }//END while (forward < backward)
        return true;
    }//END private boolean isPalindrome (String s)

    public static void main (String [] args) {
        Frame frm = new Palindrome ();
        frm.setSize (300, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Palindrome