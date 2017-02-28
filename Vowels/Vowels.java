//Celena

import java.awt.*;
import BreezyGUI.*;

public class Vowels extends GBFrame {
    //Creates and adds content to the window.
    Label enterLabel = addLabel ("Enter a Word", 1, 1, 1, 1);
    TextField enterField = addTextField ("", 1, 2, 1, 1);
    Label vowelsLabel = addLabel ("Number of Vowels", 3, 1, 1, 1);
    IntegerField vowelsField = addIntegerField (0, 3, 2, 1, 1);
    Button countButton = addButton ("Count", 4, 1, 1, 1);

    public void buttonClicked (Button buttonObj) {
        //Checks to see how many vowels the entered word has.
        String word;
        char letter;
        int vowels = 0;

        word = enterField.getText ();
        word = word.toLowerCase ();

        for (int i = 0 ; i <= word.length () - 1; i++) {
            letter = word.charAt (i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
             || letter == 'u')
                    vowels++;
        }//END for (int i = 0 ; i <= word.length () - 1; i++)
        vowelsField.setNumber (vowels);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Vowels ();
        frm.setSize (300, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Vowels