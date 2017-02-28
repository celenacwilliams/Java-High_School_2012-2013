//Celena

import java.awt.*;
import BreezyGUI.*;

public class SalesTable extends GBFrame {
    //Format the header of the table
    String header = Format.justify ('l', "NAME", 12) +
                                    Format.justify ('r', "SALES", 15) +
                                    Format.justify ('r', "COMMISION", 15) +"\n";

    Label nameLabel = addLabel ("Name", 1, 1, 1, 1);
    Label salesLabel = addLabel ("Sales amount $", 2, 1, 1, 1);
    TextField nameField = addTextField ("", 1, 2, 1, 1);
    DoubleField salesField = addDoubleField (0.0, 2, 2, 1, 1);
    Button acceptButton = addButton ("Accept", 3, 1, 2, 1);
    TextArea output = addTextArea (header, 4, 1, 3, 4);

    String name;
    double sales, commission;
    String nameOutput, salesOutput, commissionOutput;

    public void buttonClicked (Button buttonObj) {
        //Get the user input
        name = nameField.getText();
        sales = salesField.getNumber();

        //Calculate the commission
        commission = sales * 0.10;

        //Format the output data
        nameOutput = Format.justify ('l', name, 12);
        salesOutput = Format.justify('r', sales, 15, 2);
        commissionOutput = Format.justify('r', commission, 15, 2);

        //Output a line of data
        output.append (nameOutput + salesOutput + commissionOutput + "\n");
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new SalesTable();
        frm.setSize (350, 300);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class SalesTable