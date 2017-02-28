//Celena

import java.awt.*;
import BreezyGUI.*;

public class Sketchpad1 extends GBFrame {
    public Sketchpad1 () {
        setTitle ("Pellet Drawing");
    }//END public Sketchpad1 ()

    //If the mouse is pressed, create a 5 pixel diameter circle at (x, y).
    public void mousePressed (int x, int y) {
        Graphics g = getGraphics ();
        g.fillOval (x, y, 5, 5);
    }//END public void mousePressed (int x, int y)

    public static void main (String [] args) {
        Frame frm = new Sketchpad1 ();
        frm.setSize (200, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Sketchpad1