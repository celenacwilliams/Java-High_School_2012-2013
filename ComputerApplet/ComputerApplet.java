//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ComputerApplet extends Applet implements ItemListener {
    Label priceLabel = new Label ("Basic computer system: $575");
    Label devicesPromptLabel = new Label
                               ("Select which devices you would like to add: ");

    Checkbox printerBox = new Checkbox ("Printer");
    Checkbox monitorBox = new Checkbox ("Monitor");
    Checkbox modemBox = new Checkbox ("Modem");
    Checkbox hiddenBox = new Checkbox ("");

    Label outputLabel = new Label ("Your price is 575.0.");

    public void init () {
        add (priceLabel);
        add (devicesPromptLabel);
        add (printerBox);
        printerBox.addItemListener (this);
        add (monitorBox);
        monitorBox.addItemListener (this);
        add (modemBox);
        modemBox.addItemListener (this);
        add (outputLabel);
    }//END public void init ()

    public void itemStateChanged (ItemEvent choice) {
        double price = 575;

        if (printerBox.getState ())
            price = price + 100;

            if (monitorBox.getState ())
                price = price + 200;

                if (modemBox.getState ())
                    price = price + 50;

        outputLabel.setText ("Your price is " + price + ".");
    }//END public void itemStateChanged (ItemEvent choice)
}//END public class ComputerApplet