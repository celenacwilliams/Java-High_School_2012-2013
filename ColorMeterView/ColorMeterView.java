//Celena

import java.awt.*;

public class ColorMeterView extends Frame {
	//Declare variable for the window objects
	private Label			redLabel;
	private Label			greenLabel;
	private Label			blueLabel;
	private Scrollbar		redBar;
	private Scrollbar		greenBar;
	private Scrollbar		blueBar;
	private Label			redValue;
	private Label			greenValue;
	private Label			blueValue;
	private Canvas			colorCanvas;

	//Declare a variable for the model
	private ColorMeterModel model;

	//Constructor
	public ColorMeterView () {
            //Set the title
            setTitle ("Color colorCanvas");

            //Instantiate the model
            model = new ColorMeterModel (this, new Color (255, 0, 0));

            //Instantiate the window objects
            redLabel	= new Label ("Red");
            greenLabel	= new Label ("Green");
            blueLabel	= new Label ("Blue");
            redBar	= new Scrollbar (Scrollbar.HORIZONTAL, 0, 50, 0, 305);
            greenBar	= new Scrollbar (Scrollbar.HORIZONTAL, 0, 50, 0, 305);
            blueBar	= new Scrollbar (Scrollbar.HORIZONTAL, 0, 50, 0, 305);
            redValue	= new Label ("    ");
            greenValue	= new Label ("    ");
            blueValue	= new Label ("    ");
            colorCanvas	= (new Canvas ());
            colorCanvas.setSize (100, 50);

            //Instantiate and set a greid bad layout
            GridBagLayout layout = new GridBagLayout ();
            setLayout (layout);

            //Add the window objects to the layout
            addComponent (layout, redLabel	, 0, 0, 1, 1);
            addComponent (layout, greenLabel, 1, 0, 1, 1);
            addComponent (layout, blueLabel	, 2, 0, 1, 1);
            addComponent (layout, redBar	, 0, 1, 1, 1);
            addComponent (layout, greenBar	, 1, 1, 1, 1);
            addComponent (layout, blueBar	, 2, 1, 1, 1);
            addComponent (layout, redValue	, 0, 2, 1, 1);
            addComponent (layout, greenValue, 1, 2, 1, 1);
            addComponent (layout, blueValue	, 2, 2, 1, 1);
            addComponent (layout, colorCanvas, 3, 0, 3, 1);

            //Initialize the appearance of the view to match the model
            redBar.setValue (255);
            greenBar.setValue (0);
            blueBar.setValue (0);
            update (new Color (255, 0, 0));

            //Add listeners to three scrollbars
            redBar.addAdjustmentListener
                    (new BarListener (model, ColorMeterModel.RED));
            greenBar.addAdjustmentListener
                    (new BarListener (model, ColorMeterModel.GREEN));
            blueBar.addAdjustmentListener
                    (new BarListener (model, ColorMeterModel.BLUE));

            //Add a listener to the window
            addWindowListener (new GenericWindowListener ());
	}//END public ColorMeterView ()

	//Add a component to the layout in the indicated row and colum
	//with the indicated height and width
	private void addComponent (GridBagLayout layout, Component component,
                                   int row, int col, int width, int height) {
            GridBagConstraints constraints = new GridBagConstraints ();

            constraints.insets.bottom	 = 2;
            constraints.insets.top	 = 2;
            constraints.insets.left	 = 2;
            constraints.insets.right	 = 2;

            constraints.gridx = col;
            constraints.gridy = row;
            constraints.gridwidth = width;
            constraints.gridheight = height;
            layout.setConstraints (component, constraints);
            add (component);
	}//END private void addComponent (GridBagLayout...height)

        //The model calls this method whener the model wants
        //to update the view. It updates the number to the right of
        //each scrollbar and repaints the canvas in the current color
        public void update (Color color) {
            redValue.setText ("" + color.getRed ());
            greenValue.setText ("" + color.getGreen ());
            blueValue.setText ("" + color.getBlue ());
            colorCanvas.setBackground (color);
            colorCanvas.repaint ();
        }//END public void update (Color color)

        public static void main (String [] args) {
            Frame frm = new ColorMeterView ();
            frm.setSize (300, 300);
            frm.setVisible (true);
        }//END public static void main (String [] args)
}//END public class ColorMeterView