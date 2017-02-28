//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CandleApplet extends Applet implements ItemListener {
    double price, shipping;
    int empCode;

    Label headLabel = new Label ("CandleLine--Candles Online");
    Label promptLabel = new Label
                        ("Please enter the total dollar amount of your order.");
        TextField totalField = new TextField (20);

    Label codeLabel = new Label ("Please choose your method of shipping:");

    CheckboxGroup codeGroup= new CheckboxGroup ();
        Checkbox priorityBox = new Checkbox ("Priority (Overnight)", false,
                                             codeGroup);
        Checkbox expressBox = new Checkbox ("Express (2 business days)", false,
                                            codeGroup);
        Checkbox standardBox = new Checkbox ("Standard (3 to 7 business days)",
                                             false, codeGroup);
        Checkbox hiddenBox= new Checkbox ("", true, codeGroup);

    Label outputLabel = new Label
                         ("We guarantee on time delivery, or your money back.");

    public void init () {
        setBackground (Color.cyan);
        add (headLabel);
        add (promptLabel);
        add (totalField);
        totalField.requestFocus ();
        add (codeLabel);
        add (priorityBox);
        priorityBox.addItemListener (this);
        add (expressBox);
        expressBox.addItemListener (this);
        add (standardBox);
        standardBox.addItemListener (this);
        add (outputLabel);
    }//END public void init ()

    public void itemStateChanged (ItemEvent choice) {
        try {
            price = getSales ();
            empCode = getCode ();
            shipping = getComm (price, empCode);
            output (shipping, price);
        }//END try

        catch (NumberFormatException e) {
            outputLabel.setText
                          ("You must enter a dollar amount greater than zero.");
            hiddenBox.setState (true);
            totalField.setText ("");
            totalField.requestFocus ();
        }//END catch (NumberFormatException e)
    }//END public void itemStateChanged (ItemEvent choice)

    public double getSales () {
        double sales = Double.parseDouble (totalField.getText ());

        if (sales <= 0)
            throw new NumberFormatException ();

        return sales;
    }//END public double getSales ()

    public int getCode () {
        int code = 0;
        if (priorityBox.getState ())
            code = 1;
        else
            if (expressBox.getState ())
                code = 2;
            else
                if (standardBox.getState ())
                    code = 3;
                else
                    if (standardBox.getState ())
                        code = 4;

        return code;
    }//END public int getCode ()

    public double getComm (double sales, int code) {
        double commission = 0.0;
        switch (code) {
            case 1:
                commission = 16.95;
                break;
            case 2:
                commission = 13.95;
                break;
            case 3:
                commission = 7.95;
                break;
            case 4:
                commission = 0.00;
                break;
        }//END switch (code)
        return commission;
    }//END public double getComm (double sales, int code)

    public void output (double commission, double sales) {
        DecimalFormat twoDigits = new DecimalFormat ("$#,000.00");
        outputLabel.setText ("Your shipping charge is " + 
                             twoDigits.format (sales + shipping));
    }//END public void output (double commission, double sales)
}//END public class CandleApplet