//Celena

import java.awt.*;
import BreezyGUI.*;

public class FahrenheitToCentigrade extends GBApplet {
    //Creates and adds content to the window.
    Label degreesFahrenheitLabel = addLabel ("Degrees Fahrenheit", 1, 1, 1, 1);
    DoubleField degreesFahrenheitField = addDoubleField (0, 1, 2, 1, 1);
    Label degreesCentigradeLabel = addLabel ("Degrees Centigrade", 2, 1, 1, 1);
    DoubleField degreesCentigradeField = addDoubleField (0, 2, 2, 1, 1);
    Button convertButton = addButton ("convert", 3, 1, 2, 1);

    double fahrenheit, centigrade;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        fahrenheit = degreesFahrenheitField.getNumber ();
        centigrade = (fahrenheit - 32) * 5 / 9;
        degreesCentigradeField.setNumber (centigrade);
    }//END public void buttonClicked (Button buttonObj)
}//END public class FahrenheitToCentigrade