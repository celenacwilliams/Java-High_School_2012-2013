//Celena

import java.awt.*;
import BreezyGUI.*;

public class Sketchpad2 extends GBFrame {
    private static int MAX_POINTS = 500;
    private int numPoints;
    private int xArray[];
    private int yArray[];

    public Sketchpad2 () {
        setTitle ("Pellet Drawing");
        numPoints = 0;
        xArray = new int [MAX_POINTS];
        yArray = new int [MAX_POINTS];
    }//END public Sketchpad2 ()

    //Paints the graphics on the screen.
    public void paint (Graphics g) {
        displayPoints (g);
    }//END public void paint (Graphics g)

    //If the mouse is pressed, create a 5 pixel radius circle at (x,y)
    //and save the values of x and y.
    public void mousePressed (int x, int y) {
        if (numPoints < xArray.length) {
            Graphics g = getGraphics();
            g.fillOval (x, y, 5, 5);
            savePoint (x, y);
        }//END if (numPoints < xArray.length)
        else {
            messageBox ("Sorry: cannot draw another pellet.");
        }//END else
    }//END public void mousePressed (int x, int y)

    //Displays all the points at all the x and y values clicked.
    private void displayPoints (Graphics g) {
        int i;
        for (i = 0; i < numPoints; i++) {
            g.fillOval (xArray [i], yArray [i], 5, 5);
        }//END for (i = 0; i < numPoints; i++)
    }//END private void displayPoints (Graphics g)

    //Saves the x and y values.
    private void savePoint (int x, int y) {
        xArray [numPoints] = x;
        yArray [numPoints] = y;
        numPoints++;
    }//END private void savePoint (int x, int y)

    public static void main (String [] args) {
        Frame frm = new Sketchpad2();
        frm.setSize (200, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}