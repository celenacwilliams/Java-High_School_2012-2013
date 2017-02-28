//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Freddie extends Applet implements ItemListener {
    Label sandwichPromptLabel = new Label
                                      ("What kind of sandwich would you like?");
        TextField sandwichInputField = new TextField (20);
    Label sizePromptLabel = new Label ("Sizes:");

        Checkbox catsupBox = new Checkbox ("Catsup");
        Checkbox mustardBox = new Checkbox ("Mustard");
        Checkbox picklesBox = new Checkbox ("Pickles");

    CheckboxGroup sizeGroup = new CheckboxGroup ();
        Checkbox smallBox = new Checkbox ("Small", true, sizeGroup);
        Checkbox mediumBox = new Checkbox ("Medium", false, sizeGroup);
        Checkbox largeBox = new Checkbox ("Large", false, sizeGroup);

    public void init () {
        setBackground (Color.red);
        add (sandwichPromptLabel);
        add (sandwichInputField);
        add (catsupBox);
        catsupBox.addItemListener (this);
        add (mustardBox);
        mustardBox.addItemListener (this);
        add (picklesBox);
        picklesBox.addItemListener (this);
        add (sizePromptLabel);
        add (smallBox);
        smallBox.addItemListener (this);
        add (mediumBox);
        mediumBox.addItemListener (this);
        add (largeBox);;
        largeBox.addItemListener (this);
    }//END public void init ()

    public void itemStateChanged (ItemEvent choice) {
    }//END public void itemStateChanged (ItemEvent choice)
}//END public class Freddie