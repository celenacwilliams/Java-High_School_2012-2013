//Celena

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Reservations extends Frame implements ActionListener {
    Color lightRed = new Color (255, 90, 90);
    Color lightGreen = new Color (140, 215, 40);

    Rooms room = new Rooms (5, 3);

    Panel roomPanel = new Panel ();
        TextArea roomDisplay[] = new TextArea[9];

    Panel buttonPanel = new Panel ();
        Button bookButton = new Button ("Book Room");

    Panel inputPanel = new Panel ();
        Label custNameLabel = new Label ("Name:");
            TextField nameField = new TextField (15);
        Label custPhoneLabel = new Label ("Phone Number:");
            TextField phoneField = new TextField (15);
        Label numLabel = new Label ("Number in party:");
        Choice numberOfGuests = new Choice ();
        CheckboxGroup options = new CheckboxGroup ();
            Checkbox nonSmoking = new Checkbox ("Nonsmoking", false, options);
            Checkbox smoking = new Checkbox ("Smoking", false, options);
            Checkbox hidden = new Checkbox ("", true, options);

    public Reservations () {
        //set Layouts for frame and three panels
        this.setLayout (new BorderLayout ());
            roomPanel.setLayout (new GridLayout (2, 4, 10, 10));
            buttonPanel.setLayout (new FlowLayout ());
            inputPanel.setLayout (new FlowLayout ());

        //add components to room panel
        for (int i = 1; i < 9; i++) {
            roomDisplay[i] = new TextArea (null, 3, 5, 3);
            if (i < 6)
                roomDisplay[i].setText ("Room " + i + " Nonsmoking");
            else
                roomDisplay[i].setText ("Room " + i +" Smoking");
            roomDisplay[i].setEditable (false);
            roomDisplay[i].setBackground (lightGreen);
            roomPanel.add (roomDisplay[i]);
        }//END for (int i = 1; i < 9; i++)

        //add components to button panel
        buttonPanel.add (bookButton);

        //add components to input panel
        inputPanel.add (custNameLabel);
        inputPanel.add (nameField);
        inputPanel.add (custPhoneLabel);
        inputPanel.add (phoneField);
        inputPanel.add (numLabel);
        inputPanel.add (numberOfGuests);
        
            for (int i = 8; i <= 20; i++)
                numberOfGuests.add (String.valueOf (i));
            
        inputPanel.add (nonSmoking);
        inputPanel.add (smoking);

        //add panels to frame
        add (buttonPanel, BorderLayout.SOUTH);
        add (inputPanel, BorderLayout.CENTER);
        add (roomPanel, BorderLayout.NORTH);

        bookButton.addActionListener (this);

        addWindowListener (
            new WindowAdapter () {
                public void windowClosing (WindowEvent e) {
                    System.exit (0);
                }//END public void windowClosing (WindowEvent e)
            }//END new WindowAdapter ()
        );//END addWindowListener
    }//END public Reservations ()

    public static void main (String [] args) {
        Reservations f = new Reservations ();
        f.setBounds (200, 200, 600, 300);
        f.setTitle ("Reserve a Party Room");
        f.setVisible (true);
    }//END public static void main (String [] args)

    public void actionPerformed (ActionEvent e) {
        if (hidden.getState ())
                JOptionPane.showMessageDialog (null,
                                       "You must select Nonsmoking of Smoking.",
                                       "Error", JOptionPane.ERROR_MESSAGE);
        else {
            int available = room.bookRoom (smoking.getState ());

            if (available > 0) {//room is available 
                roomDisplay [available].setBackground (lightRed);
                roomDisplay [available].setText
                                           (roomDisplay [available].getText () +
                                           "\n" + nameField.getText () +  " " +
                                           phoneField.getText () + "\nparty of "
                                         + numberOfGuests.getSelectedItem ());
                clearFields ();
            }
            else { //room is not available
                if (smoking.getState ())
                    JOptionPane.showMessageDialog (null, "Smoking is full.", 
                                      "Error", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog (null, "Nonsmoking is full.", 
                                      "Error", JOptionPane.INFORMATION_MESSAGE);
                hidden.setState (true);
            }//END else
        }//END else
    } //END public void actionPerformed (ActionEvent e)

    void clearFields () {
        nameField.setText ("");
        phoneField.setText ("");
        numberOfGuests.select (0);
        nameField.requestFocus ();
        hidden.setState (true);
    }//END void clearFields ()
}//END public class Reservations