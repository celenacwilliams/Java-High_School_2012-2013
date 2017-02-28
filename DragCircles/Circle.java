import java.awt.*;

public class Circle {
   private int centerX, centerY, radius;
   private Color color;

   //When a circle is created, the x and y coordinates are sent and stored,
   //along with the radius and color of the circle.
   public Circle (int x, int y, int r, Color c) {
      centerX = x;
      centerY = y;
      radius = r;
      color = c;
   }//END public Circle (int x, int y, int r, Color c)

   //Returns the x value;
   public int getCenterX () {
      return centerX;
   }//END public int getCenterX ()

   //Returns the y value.
   public int getCenterY () {
      return centerY;
   }//END public int getCenterY ()

   //Returns the radius.
   public int getRadius () {
      return radius;
   }//END public int getRadius ()

   //Returns the color.
   public Color getColor () {
      return color;
   }//END public Color getColor ()

   //Sets a new x value.
   public void setCenterX (int x) {
      centerX = x;
   }//END public void setCenterX (int x)

   //Sets a new y value.
   public void setCenterY (int y) {
      centerY = y;
   }//END public void setCenterY (int y)

   //Sets a new radius.
   public void setRadius (int r) {
      radius = r;
   }//END public void setRadius (int r)

   //Sets a new color.
   public void setColor (Color c) {
      color = c;
   }//END public void setColor (Color c)

   //Draws the circle on the screen.
   public void draw (Graphics g) {
      Color oldColor = g.getColor ();
      g.setColor (color);
      // Translates circle's center to rectangle's origin for drawing.
      g.fillOval (centerX - radius, centerY - radius, radius * 2, radius * 2);
      g.setColor (oldColor);
   }//END public void draw (Graphics g)

   //If the circle contains the point the mouse is at, return true.
   public boolean containsPoint (int x, int y) {
      int xSquared = (x - centerX) * (x - centerX);
      int ySquared = (y - centerY) * (y - centerY);
      int radiusSquared = radius * radius;
      return xSquared + ySquared - radiusSquared < 0;
   }//END public boolean containsPoint (int x, int y)

   //Moves the circle from (x, y) to (x+a, y+b).
   public void move (int xAmount, int yAmount) {
      centerX = centerX + xAmount;
      centerY = centerY + yAmount;
   }//END public void move (int xAmount, int yAmount)
}//END public class Circle



