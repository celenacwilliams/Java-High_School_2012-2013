//Celena

import java.awt.*;
import java.awt.event.*;

public class BarListener implements AdjustmentListener {
    private ColorMeterModel model;
    private int colorOfBar;

    public BarListener (ColorMeterModel cmmdl, int color) {
        model = cmmdl;
        colorOfBar = color;
    }//END public BarListener (ColorMeterModel cmmdl, int color)

    public void adjustmentValueChanged (AdjustmentEvent e) {
        Scrollbar bar = (Scrollbar) e.getSource ();
        int value = Math.min (255, e.getValue ());
        bar.setValue (value);
        model.changeColor (colorOfBar, value);
    }//END public void adjustmentValueChanged (AdjustmentEvent e)
}//END public class BarListener