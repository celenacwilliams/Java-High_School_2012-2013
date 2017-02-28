//Celena

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class DavidApplet extends Applet implements ActionListener {
    Label firstNameLabel = new Label ("First Name");
    Label lastNameLabel = new Label ("Last Name");
    Label addressLabel = new Label ("Address");
    Label cityLabel = new Label ("City");
    Label stateLabel = new Label ("State");

    TextField firstNameField = new TextField (20);
    TextField lastNameField = new TextField (20);
    TextField addressField = new TextField (20);
    TextField cityField = new TextField (20);
    TextField stateField = new TextField (20);

    Button submitButton = new Button ("Submit");

    Label vehicleLabel = new Label ("Select Vehicle Type");
    Label hookupsLabel = new Label ("Select Hookups");
    Label dateLabel = new Label ("Arrival Date");
    Label nightsLabel = new Label ("Number of Nights");
    Label zipLabel = new Label ("Zip");

    Button clearButton = new Button ("Clear");

    Choice vehicleChoice = new Choice ();
    Choice hookupsChoice = new Choice ();

    TextField dateField = new TextField (20);
    TextField nightsField = new TextField (20);
    TextField zipField = new TextField (20);

            public void init () {
                setBackground (Color.black);
                setForeground (Color.cyan);

                firstNameField.setBackground (Color.black);
                vehicleChoice.setBackground (Color.black);
                lastNameField.setBackground (Color.black);
                hookupsChoice.setBackground (Color.black);
                addressField.setBackground (Color.black);
                dateField.setBackground (Color.black);
                cityField.setBackground (Color.black);
                nightsField.setBackground (Color.black);
                stateField.setBackground (Color.black);
                zipField.setBackground (Color.black);
                submitButton.setBackground (Color.black);
                clearButton.setBackground (Color.black);

                setLayout (new GridLayout (4, 6));

                add (firstNameLabel);
                add (firstNameField);
                firstNameField.requestFocus ();
                add (vehicleLabel);
                add (vehicleChoice);
                    vehicleChoice.add ("Camping Vehicles");
                    vehicleChoice.add ("tent");
                    vehicleChoice.add ("pop-up");
                    vehicleChoice.add ("travel trailer");
                    vehicleChoice.add ("fifth-wheel");
                    vehicleChoice.add ("motor home");
                add (lastNameLabel);
                add (lastNameField);
                add (hookupsLabel);
                add (hookupsChoice);
                    hookupsChoice.add ("Hookups");
                    hookupsChoice.add ("water only");
                    hookupsChoice.add ("water and electricity");
                    hookupsChoice.add ("full hookups");
                    hookupsChoice.add ("no hookups");
                add (addressLabel);
                add (addressField);
                add (dateLabel);
                add (dateField);
                add (cityLabel);
                add (cityField);
                add (nightsLabel);
                add (nightsField);
                add (stateLabel);
                add (stateField);
                add (zipLabel);
                add (zipField);
                add (submitButton);
                submitButton.addActionListener (this);
                add (clearButton);
                clearButton.addActionListener (this);
            }//END public void init ()

            //Allows for choices to be choosen and cleared, but nothing more.
            public void actionPerformed (ActionEvent e) {
                String arg = e.getActionCommand ();
                try {
                    if (arg == "Submit") {
                    }//END if (arg == "Submit")
                }//END try
                catch (Exception x) {
                }//END catch (Exception x)

                if (arg == "Clear") {
                    firstNameField.setText ("");
                    lastNameField.setText ("");
                    dateField.setText ("");
                    cityField.setText ("");
                    nightsField.setText ("");
                    stateField.setText ("");
                    zipField.setText ("");
                    firstNameField.requestFocus ();
                    vehicleChoice.select (0);
                    hookupsChoice.select (0);
                }//END if (arg == "Clear")
            }//END public void actionPerformed (ActionEvent e)

            public static void main (String[]args) {
                DavidApplet f = new DavidApplet ();
                f.setBounds (20, 20, 200, 200);
                f.setVisible (true);
            }//END public static void main (String[]args)
}//END public class DavidApplet