/*
   Chapter 3     	Programming Assignment #3
   Programmer:		Celena Williams
   Date:			March 1, 2013
   Program Name:  	Coins.java
*/

import java.io.*;

public class Coins {
   public static void main (String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader
                                            (new InputStreamReader (System.in));

        //Declaring Variables
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int dollars;
        int totalCents;
        int cents;
        String strQuarters;
        String strDimes;
        String strNickels;
        String strPennies;

        //Assigning Values
        System.out.println ("Enter the number of quarters.");
             strQuarters = dataIn.readLine ();
        System.out.println ("Enter the number of dimes.");
             strDimes = dataIn.readLine ();
        System.out.println ("Enter the number of nickels.");
             strNickels = dataIn.readLine ();
        System.out.println ("Enter the number of pennies.");
             strPennies = dataIn.readLine ();

        //Conversions

        quarters = Integer.parseInt (strQuarters)*25;
        dimes = Integer.parseInt (strDimes)*10;
        nickels = Integer.parseInt (strNickels)*5;
        pennies = Integer.parseInt (strPennies)*1;
        totalCents = quarters + dimes + nickels + pennies;
        dollars = totalCents / 100;
        cents = totalCents % 100;

        //Output
        System.out.println ("Your change equaled " + dollars + " dollars and " +
                            cents + " cents");
   }//END public static void main (String[] args)
}//END public class Coins