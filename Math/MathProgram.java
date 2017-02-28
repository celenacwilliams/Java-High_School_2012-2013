/*
	Programmer: 	Celena Williams
	Date:			February 28, 2013

*/

import javax.swing.JOptionPane;

public class MathProgram {
    public static void main (String arg []) {
        // declare variables
        String numone, numtwo;
        double numOne, numTwo, sum, difference, product, quotient;

        //get first of two integers
        numone = JOptionPane.showInputDialog (null, "Please enter first number: ");
        numOne = Double.parseDouble (numone);

        numtwo = JOptionPane.showInputDialog(null, "Please enter the second number");
        numTwo = Double.parseDouble (numtwo);

        sum = numOne + numTwo;
        difference = numOne - numTwo;
        product = numOne * numTwo;
        quotient = numOne / numTwo;

        JOptionPane.showMessageDialog (null, numone, "First Number",
                                                 JOptionPane.OK_CANCEL_OPTION );
        JOptionPane.showMessageDialog (null, numtwo, "Second Number",
                                                 JOptionPane.OK_CANCEL_OPTION );

        JOptionPane.showMessageDialog (null, "Sum equals " + sum,
                                       "Sum of the numbers",
                                       JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog (null, "Difference equals " + difference,
                                       "Difference of two Numbers",
                                       JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog (null, "Product equals " + product,
                                       "Integer Product",
                                       JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog (null, "Quotient equals " + quotient,
                                       "Integer Division",
                                       JOptionPane.OK_CANCEL_OPTION);

        System.exit(0);
    }//END public static void main (String arg [])
}//END public class MathProgram