//Celena

import java.io.*;
import java.text.DecimalFormat;

public class Tuition {
    public static void main (String [] args) throws IOException {
        int hours;
        double fees, rate, tuition;

        displayWelcome ();
        hours = getHours ();
        rate = getRate (hours);
        tuition = calcTuition (hours, rate);
        fees = calcFees (tuition);
        displayTotal (tuition + fees);
    }//END public static void main (String [] args)

    public static void displayWelcome () {
        System.out.println ("Welcome!");
    }//END public static void displayWelcome ()

    public static int getHours () throws IOException {
        String strHours;
        int hours;
        hours = 0;

        BufferedReader dataIn = new BufferedReader
                                            (new InputStreamReader (System.in));

        System.out.println ("What is the number of hours?");
            strHours = dataIn.readLine ();
            hours = Integer.parseInt (strHours);

        return hours;
    }//END public static int getHours ()

    public static double getRate (int hours) {
        double rate;

        if (hours > 15)
            rate = 44.50;
        else
            rate = 50;

        return rate;
    }//END  public static double getRate (int hours)

    public static double calcTuition (int hours, double rate) {
        double tuition = hours * rate;

        return tuition;
    }//END public static double calcTuition (int hours, double rate)

    public static double calcFees (double tuition) {
        double fees;
        fees = tuition * .08;

        return fees;
    }//END public static double calcFees (double tuition)

    public static void displayTotal (double total) {
        DecimalFormat twoDigits = new DecimalFormat ("$#,000.00");

        System.out.println ("The total tuition is " + twoDigits.format (total));
    }//END public static void displayTotal (double total)
}//END public class Tuition