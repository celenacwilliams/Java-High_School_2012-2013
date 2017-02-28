/*
	Chapter 2:	Welcome to My Day
	Programmer:	C.Williams
	Date:		February 12, 2013
	Filename: 	WelcomeApplet.java
	Purpose:	This project displays a welcome message, the user's
			name, and the system date in a console application.
*/

import java.util.Date;
import java.awt.*;
import java.applet.*;

public class WelcomeApplet extends Applet {
    public void paint (Graphics g) {
        Date currentDate = new Date (); //Date constructed
        g.drawString ("Welcome to my day!", 200, 70);
        g.drawString ("Daily planner for Linda Nunez", 200, 100);
        g.drawString (currentDate.toString (), 200, 130);
        Image smile; //declare an Image object
        smile = getImage (getDocumentBase (), "Smile.gif");
        g.drawImage (smile, 10, 10, this);
        setBackground (Color.cyan);
    }//END public void paint (Graphics g)
}//END public class WelcomeApplet