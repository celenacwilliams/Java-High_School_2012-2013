//Celena

import java.awt.*;
import BreezyGUI.*;

public class FibonacciNumbers extends GBFrame {
    //Creates and adds content to the window.
    Label nLabel = addLabel ("Value of N", 1, 1, 1, 1);
    IntegerField nField = addIntegerField(0, 1, 2, 1, 1);
    Label nthFibLabel = addLabel ("Nth Fibonacci", 2, 1, 1, 1);
    IntegerField nthFibField = addIntegerField (0, 2, 2, 1, 1);
    Button computeButton = addButton ("Compute", 3, 1, 1, 1);

    int n, fib, a, b, count;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        n = nField.getNumber();
        if (n <= 0)
            n = 1;

        if (n == 1)
            fib = 1;

        if (n == 2)
            fib = 1;

        if (n > 2) {
            a = 1;
            b = 1;
            count = 3;
            while (count <= n) {
                fib = a + b;
                a = b;
                b = fib;
                count = count + 1;
            }//END while (count <= n)
        }//END if (n > 2)
        nthFibField.setNumber (fib);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new FibonacciNumbers();
        frm.setSize(200, 150);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class FibonacciNumbers
