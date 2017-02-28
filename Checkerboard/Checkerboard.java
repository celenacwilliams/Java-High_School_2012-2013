//Celena

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Checkerboard extends Frame implements ActionListener {
    Panel arrayPanel = new Panel ();
        TextField textArray [] = new TextField [16];
        int start, stop, step;

    Panel fieldPanel = new Panel ();
        TextField startField;
        TextField stopField;
        TextField stepField;
        Label startLabel = new Label ("Start");
        Label stopLabel = new Label ("Stop");
        Label stepLabel = new Label ("Step");

    Panel buttonPanel = new Panel ();
        Button goButton = new Button ("Go");
        Button clearButton = new Button ("Clear");

    public Checkerboard () {
        setBackground (Color.gray);

        startField = new TextField (10);
        stopField = new TextField (10);
        stepField = new TextField (10);
        start = 0;
        stop = 0;
        step = 0;

        for (int i = 0; i < textArray.length; i++) {
            textArray [i] = new TextField ();
            textArray [i].setEditable (false);
            textArray [i].setText (String.valueOf (i));
            textArray [i].setBackground (Color.white);
        }//END for (int i = 0; i < textArray.length; i++)

        this.setLayout (new BorderLayout (2, 2));
            arrayPanel.setLayout (new GridLayout (4, 4, 20, 20));
            fieldPanel.setLayout (new GridLayout (2, 3, 20, 20));
            buttonPanel.setLayout (new GridLayout (1, 2, 20, 0));

        for (int j = 0; j < textArray.length; j++)
            arrayPanel.add (textArray [j]);

        fieldPanel.add (startField);
        startField.addActionListener (this);
        fieldPanel.add (stopField);
        stopField.addActionListener (this);
        fieldPanel.add (stepField);
        stepField.addActionListener (this);
        fieldPanel.add (startLabel);
        fieldPanel.add (stopLabel);
        fieldPanel.add (stepLabel);

        buttonPanel.add (goButton);
        goButton.addActionListener (this);
        buttonPanel.add (clearButton);
        clearButton.addActionListener (this);

        setVisible (true);
        startField.requestFocus ();

        add (arrayPanel, BorderLayout.NORTH);
        add (fieldPanel, BorderLayout.CENTER);
        add (buttonPanel, BorderLayout.SOUTH);
    }//END public Checkerboard ()

    public void actionPerformed (ActionEvent e) {
        String arg = e.getActionCommand ();
        try {
            if (arg == "Go") {
                start = Integer.parseInt (startField.getText ());
                stop = Integer.parseInt (stopField.getText ());
                step = Integer.parseInt (stepField.getText ());

                for (int i = 0; i < textArray.length; i++)
                    textArray [i].setBackground (Color.black);

                for (int i = start; i < textArray.length; i += step)
                    textArray [i].setBackground (Color.cyan);
            }//END if (arg == "Go")
        }//END try
        catch (Exception x) {
            JOptionPane.showMessageDialog (null, "Data Entry Error", "Error", 
                                           JOptionPane.INFORMATION_MESSAGE);
            arg = "Clear";
        }//END catch (Exception x)

        if (arg == "Clear") {
            startField.setText ("");
            stopField.setText ("");
            stepField.setText ("");

            for (int i = 0; i < textArray.length; i++)
                textArray [i].setBackground (Color.white);
        }//END if (arg == "Clear")
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String []args) {
        Checkerboard f = new Checkerboard ();
        f.setBounds (50, 100, 300, 300);
        f.setTitle ("Checkerboard Array");
        f.setVisible (true);
    }//END public static void main (String []args)
}//END public class Checkerboard