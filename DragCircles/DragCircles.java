//Celena

import java.awt.*;
import BreezyGUI.*;

public class DragCircles extends GBFrame {
    private final static int MAX_CIRCLES = 5;
    private final static int MIN_CENTER_X = 50;
    private final static int MAX_CENTER_X = 150;
    private final static int MIN_CENTER_Y = 50;
    private final static int MAX_CENTER_Y = 150;
    private final static int MIN_RADIUS = 10;
    private final static int MAX_RADIUS = 50;

    private int mouseX = 0, mouseY = 0;
    private boolean circleHasBeenSelected = true;
    private int currentX = 0;
    private int currentY = 0;
    private Circle selectedCircle;
    private Circle circles[] = new Circle[MAX_CIRCLES];

    public DragCircles () {
        int i;
        for (i = 0; i < MAX_CIRCLES; i++) {
            int centerX = randomInt (MIN_CENTER_X, MAX_CENTER_X);
            int centerY = randomInt (MIN_CENTER_Y, MAX_CENTER_Y);
            int radius = randomInt (MIN_RADIUS, MAX_RADIUS);
            Color color = randomColor();
            Circle circle = new Circle (centerX, centerY, radius, color);
            circles[i] = circle;
        }//END for (i = 0; i < MAX_CIRCLES; i++)
        setTitle ("Dragging Circles");
    }//END public DragCircles ()

    //Method for the action in Graphics.
    public void paint (Graphics g) {
        int i;
        for (i = 0; i < MAX_CIRCLES; i++) {
            circles[i].draw(g);
        }//END for (i = 0; i < MAX_CIRCLES; i++)
    }//END public void paint (Graphics g)

    //If the mouse button has been pressed, send the x and y values.
    //Checks if a circle has been selected.
    public void mousePressed (int x, int y) {
        currentX = x;
        currentY = y;
        circleHasBeenSelected = findCircle();
    }//END public void mousePressed (int x, int y)

    //If the mouse button has been released, a circle is not selected.
    public void mouseReleased (int x, int y) {
        circleHasBeenSelected = false;
    }//END public void mouseReleased (int x, int y)

    //If the mouse is dragged, move the circle to new mouse position and
    //repaint the images on screen.
    public void mouseDragged (int x, int y) {
        if (circleHasBeenSelected) {
            selectedCircle.move (x - currentX, y - currentY);
            repaint();
            currentX = x;
            currentY = y;
        }//END if (circleHasBeenSelected)
    }//END public void mouseDragged (int x, int y)

    //If there is a circle under the mouse cursor, return true.
    private boolean findCircle () {
        int i;
        for (i = MAX_CIRCLES - 1; i >= 0; i--) {
            if (circles[i].containsPoint (currentX, currentY)) {
                selectedCircle = circles[i];
                return true;
            }//END if (circles[i].containsPoint (currentX, currentY))
        }//END for (i = MAX_CIRCLES - 1; i >= 0; i--)
        return false;
    }//END private boolean findCircle ()

    //Creates a random number.
    private int randomInt (int low, int high) {
        return (int) (low + Math.random() * (high - low + 1));
    }//END private int randomInt (int low, int high)

    //Selects a random color.
    private Color randomColor () {
        Color color;
        int number = randomInt (1, 5);
        
        switch (number) {
            case 1:
                color = Color.red;
                break;
            case 2:
                color = Color.blue;
                break;
            case 3:
                color = Color.green;
                break;
            case 4:
                color = Color.magenta;
                break;
            case 5:
                color = Color.cyan;
                break;
            default:
                color = Color.orange;
        }//END switch (number)
        
        return color;
    }//END private Color randomColor ()

    public static void main (String [] args) {
        Frame frm = new DragCircles();
        frm.setSize (300, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class DragCircles