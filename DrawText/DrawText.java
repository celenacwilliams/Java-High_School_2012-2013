//Celena

import java.awt.*;
import BreezyGUI.*;

public class DrawText extends GBFrame {
    MenuItem drawItem = addMenuItem ("Command", "Draw");
    MenuItem clearItem = addMenuItem ("Command", "Clear");
    Label textLabel = addLabel ("Text", 1, 1, 1, 1);
    TextField textField = addTextField ("", 1, 2, 1, 1);
    Label xLabel = addLabel ("x", 1, 3, 1, 1);
    IntegerField xField = addIntegerField (0, 1, 4, 1, 1);
    Label yLabel = addLabel ("y", 1, 5, 1, 1);
    IntegerField yField = addIntegerField (0, 1, 6, 1, 1);

    public DrawText () {
        setTitle ("Drawing Text");
    }//END public DrawText ()

    public void menuItemSelected (MenuItem mi) {
        if (mi == drawItem)
            draw();
        else
            if (mi == clearItem)
                repaint();
    }//END public void menuItemSelected (MenuItem mi)

    //Draws the text on the screen at the x and y values.
    private void draw () {
        String text = textField.getText();
        int x = xField.getNumber();
        int y = yField.getNumber();
        Graphics g = getGraphics();
        g.drawString (text, x, y);
    }//END private void draw ()

    public static void main (String [] args) {
        Frame frm = new DrawText();
        frm.setSize (350, 200);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class DrawText