//Celena

import javax.swing.JOptionPane;

public class circumferenceOfCircles {
    public static void main (String [] args) {
        //declare and contruct variables
        String radius;
        double length, doubleCircumference;

        //print prompts and get input
        System.out.println ("CIRCLE CIRCUMFERENCE CALCULATOR");
        radius = JOptionPane.showInputDialog (null, "Enter the radius: ");
            length = Double.parseDouble (radius);

        //calculations
        doubleCircumference = 2 * Math.PI * length;

        //output
        JOptionPane.showMessageDialog (null, "THE CIRCUMFERENCE IS " +
                                       doubleCircumference + ".");

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class circle