//Celena

import java.awt.*;
import BreezyGUI.*;

public class Taxi extends GBFrame {
    Button drawButton = addButton ("Draw", 1, 1, 1, 1);

    //Creates a picture of a taxi when the button is clicked.
    public void buttonClicked (Button buttonObj) {
        Graphics g = getGraphics();

        g.setColor (Color.red);
        g.fillRect (200, 100, 100, 25);

        g.setColor (Color.yellow);
        g.fillRect (150, 125, 200, 50);

        g.setColor (Color.yellow);
        g.fillRect (100, 175, 300, 75);

        g.setColor (Color.black);
        g.drawString ("Taxi", 230, 220);

        g.setColor (Color.red);
        g.drawLine (227, 225, 255, 225);

        g.setColor (Color.black);
        g.fillOval (100, 250, 100, 100);

        g.setColor (Color.black);
        g.fillOval (300, 250, 100, 100);

        g.setColor (Color.gray);
        g.fillOval (125, 275, 50, 50);

        g.setColor (Color.gray);
        g.fillOval (325, 275, 50, 50);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Taxi ();
        frm.setSize (500, 500);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Taxi
