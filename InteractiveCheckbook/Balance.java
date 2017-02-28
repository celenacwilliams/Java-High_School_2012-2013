//Celena

import java.io.*;

public class Balance {
    public static void main (String [] args) throws IOException {
        BufferedReader dataIn = new BufferedReader 
                                            (new InputStreamReader (System.in));

        //declares and contructs variables
        float endingBalance, begBalance, totDeposits,  totChecks, totFees;
        String strBeginningBalance, strTotalDeposits, strTotalChecks;
        String strTotalFees;

        //prints prompts and outputs
        System.out.println ("BALANCING YOUR CHECBOOK");
        System.out.println ();
        System.out.print ("\tWhat is the balance from your last statement? ");
            strBeginningBalance = dataIn.readLine ();
        System.out.println ();
        System.out.print ("\tWhat is the total amount of all deposits? ");
            strTotalDeposits = dataIn.readLine ();
        System.out.println ();
        System.out.print ("\tWhat is the total amount of all checks? ");
            strTotalChecks = dataIn.readLine ();
        System.out.println ();
        System.out.print
                       ("\tWhat is the total amount of all transaction fees? ");
            strTotalFees = dataIn.readLine ();
        System.out.println ();

        //conversions
        begBalance = Float.parseFloat (strBeginningBalance);
        totDeposits = Float.parseFloat (strTotalDeposits);
        totChecks = Float.parseFloat (strTotalChecks);
        totFees = Float.parseFloat (strTotalFees);

        //calculations
        endingBalance = begBalance + totDeposits - totChecks - totFees;

        //outputs
        System.out.println ("Your new balance is $" + endingBalance + ".");
    }//END public static void main (String [] args)
}//END public class Balance