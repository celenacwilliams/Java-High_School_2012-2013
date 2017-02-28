//Celena

import java.awt.*;

public class ColorMeterModel {
    //Constants that define the three components of a color:
    //red, blue, green
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    private Color color;
    private ColorMeterView view;

    public ColorMeterModel (ColorMeterView vw, Color initialColor) {
            view = vw;
            color = initialColor;
    }//END public ColorMeterModel (ColorMeterView vw, Color initialColor)

    //Change one component of the color
    //componentToChange -- indicates which component to change
    //(red, blue, or blue)
    //componentValue -- indicates the new value of the component
    public void changeColor (int componentType, int componentValue) {
        //Get the current component color
        int redValue = color.getRed ();
        int greenValue = color.getGreen ();
        int blueValue = color.getBlue ();

        //Change the value of the indicated component
        switch  (componentType) {
            case RED:
                redValue = componentValue;
                break;
            case GREEN:
                greenValue = componentValue;
                break;
            case BLUE:
                blueValue = componentValue;
                break;
        }//END switch  (componentType)

        //Reset the meter's color
        color = new Color (redValue, greenValue, blueValue);

        //Update the view to reflect the change in color
        view.update (color);
    }//END public void changeColor (int componentType, int componentValue)
}//END public class ColorMeterModel