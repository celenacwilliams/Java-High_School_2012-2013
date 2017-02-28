import java.awt.*;
import BreezyGUI.*;

public class nuclearBindingEnergyPerNucleon extends GBFrame {
    //Creates and adds content to the screen.
    IntegerField protonsField = addIntegerField (0, 1, 1, 1, 1);
    Label protonsLabel = addLabel (" protons", 1, 2, 1, 1);
    Label protonWeightLabel = addLabel ("X 1.007 276 amu = ", 1, 3, 1, 1);
    DoubleField protonWeightField = addDoubleField (0, 1, 4, 1, 10);
    Label amu1Label = addLabel ("amu", 1, 5, 1, 1);

    IntegerField neutronsField = addIntegerField (0, 2, 1, 1, 1);
    Label neutronsLabel = addLabel (" neutrons", 2, 2, 1, 1);
    Label neutronWeightLabel = addLabel ("X 1.008 665 amu = ", 2, 3, 1, 1);
    DoubleField neutronWeightField = addDoubleField (0, 2, 4, 1, 10);
    Label amu2Label = addLabel ("amu", 2, 5, 1, 1);

    IntegerField electronsField = addIntegerField (0, 3, 1, 1, 1);
    Label electronsLabel = addLabel (" electrons", 3, 2, 1, 1);
    Label electronWeightLabel = addLabel
                                       ("X 0.000 548 6 amu = ", 3, 3, 1, 1);
    DoubleField electronWeightField = addDoubleField (0, 3, 4, 1, 10);
    Label amu3Label = addLabel ("amu", 3, 5, 1, 1);

    Label measuredMassLabel = addLabel ("Measured Mass", 4, 1, 1, 1);
    DoubleField measuredMassField = addDoubleField (0, 4, 2, 1, 10);
    Label amu4Label = addLabel ("amu", 4, 3, 1, 1);

    Button calculateButton = addButton ("Calculate", 5, 3, 1, 1);

    Label totalCombinedMassLabel = addLabel
                                        ("Total Combined Mass", 6, 3, 1, 1);
    DoubleField totalCombinedMassField = addDoubleField (0, 6, 4, 1, 10);
    Label amu5Label = addLabel ("amu", 6, 5, 1, 1);

    Label massDefectLabel = addLabel ("Mass Defect", 7, 1, 1, 1);
    DoubleField massDefectField = addDoubleField (0, 7, 2, 1, 10);
    Label amu6Label = addLabel ("amu", 7, 3, 1, 1);

    Label kiloLabel = addLabel ("Converted to kilograms", 8, 1, 1, 1);
    Label formula1Label = addLabel
                    (" X (1.660 5 X 10^-27 kg) / 1 amu = ", 8, 2, 1, 1);
    DoubleField kiloField = addDoubleField (0, 8, 3, 1, 10);
    Label kilogramsLabel = addLabel ("kg", 8, 4, 1, 1);

    Label energyLabel = addLabel
                              ("Converted to energy: E = mc^2", 9, 1, 1, 1);
    Label formula2Label = addLabel (" (3.00 X 10^8 m/s)^2 = ", 9, 2, 1, 1);
    DoubleField energyField = addDoubleField (0, 9, 3, 1, 15);
    Label joulesLabel = addLabel ("J", 9, 4, 1, 1);

    int p, n, e;
    double m, pWeight, nWeight, eWeight, defect, totalWeight, kilograms, c;
    double E, en;

    public void buttonClicked (Button buttonObj) {
        //Gets information.
        p = protonsField.getNumber();
        n = neutronsField.getNumber();
        e = electronsField.getNumber();
        m = measuredMassField.getNumber();

        //Does the necessary calculations.
        pWeight = p * 1.007276;
        nWeight = n * 1.008665;
        eWeight = e * 0.0005486;
        totalWeight = pWeight + nWeight + eWeight;
        defect = totalWeight - m;
        en = Math.pow (10, -27);
        kilograms = defect * (1.6605 * en);
        c = 3.00 * (Math.pow (10, 8));
        E = kilograms * (Math.pow (c, 2));

        //Sets the correct fields.
        protonWeightField.setNumber (pWeight);
        neutronWeightField.setNumber (nWeight);
        electronWeightField.setNumber (eWeight);
        totalCombinedMassField.setNumber (totalWeight);
        massDefectField.setNumber (defect);
        kiloField.setNumber (kilograms);
        energyField.setNumber (E);
    }//END public void buttonClicked (Button buttonObj)

    public static void main (String [] args) {
        Frame frm = new nuclearBindingEnergyPerNucleon();
        frm.setSize (600, 600);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class nuclearBindingEnergyPerNucleon