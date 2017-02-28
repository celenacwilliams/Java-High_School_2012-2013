//Celena

import javax.swing.JOptionPane;

public class BodyMassSwing {
    public static void main (String [] args) {
        //declare and contruct variables
        String height, weight;
        int inches, pounds;
        double kilograms, meters, index;

        //print prompts and get input
        System.out.println 
                        ("\tTHE SUN FITNESS CENTER BODY MASS INDEX CALCULATOR");
        height = JOptionPane.showInputDialog (null,
                                 "\t\tEnter your height to the nearest inch: ");
            inches = Integer.parseInt (height);
        weight = JOptionPane.showInputDialog (null,
                                "\t\tEnter your weight to the nearest pound: ");
            pounds = Integer.parseInt (weight);

        //calculations
        meters = inches / 39.36;
        kilograms = pounds / 2.2;
        index = kilograms / Math.pow (meters, 2);

        //output
        JOptionPane.showMessageDialog (null, "\tYOUR BODY MASS INDEX IS " + 
                                       Math.round(index) + ".");

        System.exit(0);
    }//END public static void main (String [] args)
}//END public class BodyMassSwing