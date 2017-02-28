//Celena

import java.awt.*;
import BreezyGUI.*;

public class Game extends GBFrame {
    //Creates and adds the content to the window.
    TextArea output = addTextArea ("I'm thinking of a number", 1, 1, 5, 5);
    Label guessLabel = addLabel ("Your guess ", 6, 4, 1, 1);
    IntegerField guessField = addIntegerField (0, 6, 5, 1, 1);
    Button guessButton = addButton ("Guess", 7, 3, 1, 1);

    int total;
    int number = (int) (Math.random () * (1000 - 1 + 1));

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        int guess;

        guess = guessField.getNumber ();
        total = total + 1;

        if (guess < number)
            output.setText ("Too low");
        else
            if (guess > number)
                output.setText ("Too high");
            else
                if (guess == number)
                    output.setText ("You've got it! "+" Total tries: " + total);

    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Game ();
        frm.setSize (400, 500);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Game