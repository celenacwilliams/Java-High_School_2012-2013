//Celena Williams

import java.awt.*;
import java.applet.*;

public class RickApplet extends Applet {
    public void paint (Graphics g) {
        g.drawString ("Rick's Riding Rodeo", 250, 50);
        g.drawString ("RideWithRick@rodeo.com", 250, 70);
        setBackground (Color.cyan);
        Image horse;
        horse = getImage (getDocumentBase (),"horse.jpeg");
        g.drawImage (horse,5,5,this);
    }//END public void paint (Graphics g)
}//END public class RickApplet