//Celena

import javax.swing.JOptionPane;

public class DebtRatio {
    public static void main (String [] args) {
        //declares variables
        String strMonthlyIncome, strMortage, strAutoLoan, strOtherDebt;
        double monthlyIncome, mortage, autoLoan, otherDebt, ratio;

        //input
        System.out.println ("EMPLOYEES' CREDIT UNION");
        strMonthlyIncome = JOptionPane.showInputDialog (null,
                                                 "Enter your monthly income: ");
        strMortage = JOptionPane.showInputDialog (null, "Enter your mortage: ");
        strAutoLoan = JOptionPane.showInputDialog (null,
                                                      "Enter your auto loan: ");
        strOtherDebt = JOptionPane.showInputDialog (null,
                                                     "Enter your other debt: ");

        //conversions
        monthlyIncome = Double.parseDouble (strMonthlyIncome);
        mortage = Double.parseDouble (strMortage);
        autoLoan = Double.parseDouble (strAutoLoan);
        otherDebt = Double.parseDouble (strOtherDebt);

        //calculations
        ratio = (mortage + autoLoan + otherDebt) / monthlyIncome;

        //output
        JOptionPane.showMessageDialog (null,
                                           "Your debt ratio is " + ratio + ".");

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class DebtRatio