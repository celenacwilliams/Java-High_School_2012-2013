//Celena

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Commission {
    public static void main (String [] args) {
        //declare class variables
        double dollars, answer;
        int empCode;

        //call methods
        dollars = getSales ();
        empCode = getCode ();
        answer = getComm (dollars,empCode);
        output (answer, dollars);
        finish ();
    }//END public static void main (String [] args)

    //The getSales () method asks user to input a dollar amount and validates it
    public static double getSales () {
        //declare method variables
        double sales = 0.0;
        boolean done = false;

        //loop while not done
        while (!done) {
            String answer = JOptionPane.showInputDialog (null,
                            "Enter the sales amount\n (do not use commas or " + 
                            "dollar signs)\n or click Cancel to exit:");

            if (answer == null)
                finish ();

            try {
                sales = Double.parseDouble (answer);
                if (sales <= 0) throw new NumberFormatException ();
                else done = true;
            }//END try
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog (null,
                                     "Your entry was not in the proper format.",
                                     "Error", JOptionPane.INFORMATION_MESSAGE);
            }//END catch (NumberFormatException e)
        }//END while (!done)
        return sales;
    }//END public static double getSales ()

    //The getCode () method retrives a code from the user and validates it
    public static int getCode () {
        //declare method variables
        int code = 0;
        boolean done = false;

        //loop while not done
        while (!done) {
            try {
                String message = "Enter the commission code:" +
                                 "\n\n1) Telephone Sales\n2) In-Store Sales" +  
                                 "\n3) Outside Sales\n\n";

                code = Integer.parseInt (JOptionPane.showInputDialog
                                        (null, message));

                //test for valid codes 1, 2, or 3
                if (code<1 || code>3) throw new NumberFormatException ();
                else done = true;
            }// END try
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog (null,
                                               "Please enter a 1, 2, or 3.",
                                               "Error",
                                               JOptionPane.INFORMATION_MESSAGE);
            }//END catch (NumberFormatException e)
        }//END while (!done)
        return code;
    }//END public static int getCode ()

    //The getComm () method accepts dollars and code and returns the commission
    public static double getComm (double employeeSales, int employeeCode) {
        double commission = 0.0;

        switch (employeeCode) {
            case 1:
                commission = .10 * employeeSales;
                break;

            case 2:
                commission = .14 * employeeSales;
                break;

            case 3:
                commission = .18 * employeeSales;
                break;
        }//END switch (employeeCode)
        return commission;
    }//END public static double getComm (double...employeeCode)

    //The output () method displays the commission and sales
    public static void output (double commission, double sales) {
        DecimalFormat twoDigits = new DecimalFormat ("$#,000.00");

        JOptionPane.showMessageDialog (null, "Your commission on sales of " 
                                     + twoDigits.format (sales) + " is " + 
                                       twoDigits.format (commission), 
                                       "Commission Totals", 
                                       JOptionPane.INFORMATION_MESSAGE);
    }//END public static void output (double commission, double sales)

    //The finish () method ends the program
    public static void finish () {
        System.exit (0);
    }//END public static void finish ()
}//END public class Commission