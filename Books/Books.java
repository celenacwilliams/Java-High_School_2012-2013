//Celena

import java.awt.*;
import BreezyGUI.*;

public class Books extends GBFrame {
    //Creates and adds content to the window.
    Label priceLabel = addLabel ("Sales Price of Book ($)", 1, 1, 1, 1);
    DoubleField priceField = addDoubleField (0, 1, 2, 1, 1);
    Button calculateButton = addButton ("Calculate", 3, 1, 1, 1);
    Label markupLabel = addLabel ("Markup of Book ($)", 4, 1, 1, 1);
    DoubleField markupField = addDoubleField (0, 4, 2, 1, 1);
    Label wholeSaleLabel = addLabel ("Whole Sale of Book ($)", 5, 1, 1, 1);
    DoubleField wholeSaleField = addDoubleField (0, 5, 2, 1, 1);
    Label salesPriceLabel = addLabel
                             ("Total Sales Price of all books ($)", 6, 1, 1, 1);
    DoubleField salesPriceField = addDoubleField (0, 6, 2, 1, 1);
    Label totalMarkupLabel = addLabel
                                  ("Total Markup of all books ($)", 7, 1, 1, 1);
    DoubleField totalMarkupField = addDoubleField (0, 7, 2, 1, 1);

    double price, markup, wholesale, salesPrice, totalMarkup;

    public void buttonClicked (Button buttonObj) {
        //Does the necessary calculations.
        price = priceField.getNumber();
        markup = price / 10;
        wholesale = price + markup;
        salesPrice = salesPrice + price;
        totalMarkup = totalMarkup + markup;

        markupField.setNumber (markup);
        wholeSaleField.setNumber (wholesale);
        salesPriceField.setNumber (salesPrice);
        totalMarkupField.setNumber (totalMarkup);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new Books();
        frm.setSize(300, 400);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Books