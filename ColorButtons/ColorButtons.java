//Celena

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class ColorButtons extends Frame implements ItemListener {
    static ColorButtons f = new ColorButtons ();

    CheckboxGroup colors = new CheckboxGroup ();
        Checkbox blue = new Checkbox ("Blue", false, colors);
        Checkbox red = new Checkbox ("Red", false, colors);
        Checkbox yellow = new Checkbox ("Yellow", false, colors);
        Checkbox pink = new Checkbox ("Pink", false, colors);
        Checkbox gray = new Checkbox ("Gray", false, colors);
        Checkbox hidden = new Checkbox ("", true, colors);

    public ColorButtons () {
        this.setLayout (new FlowLayout ());

        setBackground (Color.white);
        add (blue);
        blue.addItemListener  (this);
        add (red);
        red.addItemListener  (this);
        add (yellow);
        yellow.addItemListener  (this);
        add (pink);
        pink.addItemListener  (this);
        add (gray);
        gray.addItemListener  (this);

        addWindowListener (
            new WindowAdapter () {
                public void windowClosing  (WindowEvent e) {
                    System.exit (0);
                }//END public void windowClosing  (WindowEvent e)
            }//END new WindowAdapter ()
        );//END addWindowListener
    }//END public ColorButtons ()

    public static void main (String [] args) {
            ColorButtons f = new ColorButtons ();
            f.setBounds (200, 200, 600, 300);
            f.setTitle ("What's my color?");
            f.setVisible (true);
    }//END public static void main (String [] args)

    public void itemStateChanged (ItemEvent choice) {
        if (blue.getState ())
            setBackground (Color.blue);
        else
            if (red.getState ())
                setBackground (Color.red);
            else
                if (yellow.getState ())
                    setBackground (Color.yellow);
                else
                    if (pink.getState ())
                        setBackground (Color.pink);
                    else
                        if (gray.getState ())
                            setBackground (Color.gray);
    }//END public void itemStateChanged (ItemEvent choice)
}//END public class ColorButtons