/*

    Chapter 2:	My Color Applet
    Programmer:	C.Williams
    Date:		February 20, 2013
    Filename: 	MyColorApplet.java
    Purpose:	This project displays a colored background and black text.
*/

import java.awt.*;
import java.applet.*;

public class MyColorApplet extends Applet {
    public void paint (Graphics g) {
        g.drawString ("This is a color test.", 25, 30);
        setBackground (Color.orange);
    }//END public void paint (Graphics g)
}//END public class MyColorApplet