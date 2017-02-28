//Celena

import java.awt.*;
import BreezyGUI.*;

public class CircleAreaAndRadius extends GBFrame {
    //Creates and adds content to the window.
    Label radiusLabel = addLabel ("Radius", 1, 1, 1, 1);
    DoubleField radiusField = addDoubleField(0, 1, 2, 1, 1);
    Label areaLabel = addLabel ("Area", 2, 1, 1, 1);
    DoubleField areaField = addDoubleField (0, 2, 2, 1, 1);
    Button radiusButton = addButton ("Compute Radius", 3, 1, 1, 1);
    Button areaButton = addButton ("Compute Area", 3, 2, 1, 1);

    double radius, area;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        if (buttonObj == areaButton) {
            radius = radiusField.getNumber();
            area = Math.PI * radius * radius;
            areaField.setNumber (area);
        }//END if (buttonObj == areaButton)
        else {
            area = areaField.getNumber();
            if (area >= 0) {
                radius = Math.sqrt (area / Math.PI);
                radiusField.setNumber (radius);
            }//END if (area >= 0)
            else
                messageBox ("Error: The area must not be \na negative number.");
        }//END else
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
            Frame frm = new CircleAreaAndRadius();
            frm.setSize(200, 150);
            frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class CircleAreaAndRadius