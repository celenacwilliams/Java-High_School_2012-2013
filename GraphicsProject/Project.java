//Celena Williams

import java.awt.*;
import BreezyGUI.*;

public class Project extends GBFrame {
    MenuItem drawItem = addMenuItem ("Commands", "Draw");
    MenuItem invertColorsItem = addMenuItem ("Commands", "Invert Colors");
    MenuItem clearItem = addMenuItem ("Commands", "Clear");

    Color brightLightBlue = new Color (0, 255, 255);//OPPOSITE BRIGHT RED
    Color darkBlue = new Color (0, 0, 204);//OPPOSITE BRIGHT BLUE
    Color brightRed = new Color (255, 0, 0);//OPPOSITE BRIGHT LIGHT BLUE
    Color brightYellow = new Color (255, 255, 102);//OPPOSITE DARK BLUE
    Color lightBrown = new Color (244, 164, 96);//OPPOSITE BRIGHT BLUE
    Color brown = new Color (139, 69, 19);//OPPOSITE LIGHT BLUE
    Color lightBlue = new Color (159, 182, 205);//OPPOSITE BROWN
    Color brightBlue = new Color (24, 116, 205);//OPPOSITE LIGHT BROWN
    Color darkDarkGray = new Color (96, 96, 96);//OPPOSITE LIGHT LIGHT GRAY
    Color grassGreen = new Color (51, 102, 0);//OPPOSITE LIGHT LAVENDER
    Color burntOrange = new Color (204, 102, 0);//OPPOSITE PALE BLUE
    Color burntRed = new Color (153, 0, 0);//OPPOSITE LIGHT CYAN
    Color lightLightGray = new Color (160, 160, 160);//OPPOSITE DARK DARK GRAY
    Color lightLavender = new Color (204, 153, 255);//OPPOSITE GRASS GREEN
    Color paleBlue = new Color (51, 153, 255);// OPPOSITE BURNT ORANGE
    Color lightCyan = new Color (153, 255, 255);//OPPOSITE BURNT RED

    public void menuItemSelected (MenuItem mi) {
            if (mi == drawItem) {
                drawTheImages (brightLightBlue,  darkBlue,  lightBrown, brown, 
                               Color.white,  Color.black, darkDarkGray,  
                               lightLightGray,  grassGreen, burntOrange,
                               burntRed, brightRed, brightYellow);
            }//END if (mi == drawItem)
            else
                if (mi == invertColorsItem) {
                    drawTheImages (brightRed,  brightYellow,  brightBlue,
                                   lightBlue, Color.black,  Color.white,
                                   lightLightGray, darkDarkGray,  lightLavender,
                                   paleBlue, lightCyan, brightLightBlue,
                                   darkBlue);
                }//END if (mi == invertColorsItem)
                else
                    if (mi == clearItem)
                        repaint ();
    }//END public void menuItemSelected (MenuItem mi)
    
    //Added 2/27/2017 to shorten the code.
    private void drawTheImages (Color color1,  Color color2,  Color color3,
                                Color color4,  Color color5,  Color color6,
                                Color color7,  Color color8,  Color color9,
                                Color color10, Color color11, Color color12,
                                Color color13) {
        Graphics g = getGraphics ();
        
        g.setColor (color1);
        g.fillRect (0, 0, 500, 365);//fills a rectangle in color1
        g.setColor (color2);
        //sets the lines for poem number one
        g.drawString ("And the cold wind blows.", 15, 65);
        g.drawString ("And the frigid air surrounds me,", 15, 80);
        g.drawString ("Trapping me in an abyss of ice", 15, 95);
        g.drawString ("That not even warming thoughts can break.", 15, 110);
        g.drawString ("In this void, there is no light, no hope, no love.",
                      15, 125);
        g.drawString ("I feel the usual numbness overtake me.", 15, 140);
        g.drawString ("The chill reaches and stays with my bones,", 15, 155);
        g.drawString ("An everlasting feeling that rarely leaves.", 15, 170);
        g.drawString ("An image of the blazing sun flashes through my mind,",
                      15, 185);
        g.drawString ("But that isn’t even enough", 15, 200);
        g.drawString ("To bring me from the freezing depths of misery.",
                      15, 215);
        g.drawString ("My body uncontrollably shakes violently with shivers",
                      15, 230);
        g.drawString ("As I clutch what I can to stay warm.", 15, 245);
        g.drawString ("With much defeat, I give in to the spiteful weather",
                      15, 260);
        g.drawString ("And collapse into a lifeless heap on the ground",
                      15, 275);
        g.drawString ("Surrounded by lightly falling snow.", 15, 290);
        g.drawString ("And I shudder once.", 15, 305);
        g.drawString ("Then, as if upon cue,", 15, 320);
        g.drawString ("Death kisses my lips and embraces me in his midnight " + 
                      "cloak.", 15, 335);
        g.drawString ("--The Cold, Celena Williams. December 2011", 15, 350);
        /***********************************************************************
        ************************************************************************
        ***********************************************************************/
        g.setColor (color3);
        g.fillRect (500, 0, 500, 365);//fills a rectangle in color3
        g.setColor (color4);
        //sets the lines for poem number two
        g.drawString ("I close my eyes and smile.", 515, 65);
        g.drawString ("The clean scent of autumn fills my nose.", 515, 80);
        g.drawString ("The leaves rustle lightly in the wind.", 515, 95);
        g.drawString ("I open my eyes and smile wider.", 515, 110);
        g.drawString ("The leaves dance in the wind.", 515, 125);
        g.drawString ("Goosebumps form on my arms at the slight chill.",
                      515, 140);
        g.drawString ("I gaze down the street, smiling on the inside, too.",
                      515, 155);
        g.drawString ("The street posed as a stage for various hues of fire.",
                      515, 170);
        g.drawString ("Trees lined the street, shedding their bright tears.",
                      515, 185);
        g.drawString ("I have always wondered about this time of year.",
                      515, 200);
        g.drawString ("That beautiful time in between heat and cold.",
                      515, 215);
        g.drawString ("The season of maturity and simplicity.", 515, 230);
        g.drawString ("I close my eyes and smile.", 515, 245);
        g.drawString ("Autumn.", 515, 260);
        g.drawString ("--Autumn, Celena Williams. September 2012", 515, 275);
        /***********************************************************************
        ************************************************************************
        ***********************************************************************/
        g.setColor (color5);
        g.fillRect (0, 365, 500, 365);//creates the snow storm

        g.setColor (color6);
        g.drawLine (0, 480, 500, 480); //creates the horizon in the snow storm
        g.fillOval (250, 490, 15, 8);//creates the head of the person
        g.fillRect (232, 489, 20, 10);//creates the body of the person
        g.fillRect (214, 490, 20, 3);//creates the left leg of the person
        g.fillRect (214, 494, 20, 3);//creates the right leg of the person

        g.fillOval (40, 440, 30, 40);//creates the hood of Death
        g.fillRect (41, 465, 29, 50);//creates the cloak of Death

        g.setColor (color7);
        g.fillRect (70, 440, 5, 75);//creates the pole of the sife

        g.setColor (color8);
        g.fillArc (30, 440, 90, 20, 90, -90);//creates the blade of the sife
        /***********************************************************************
        ************************************************************************
        ***********************************************************************/
        g.setColor (color7);
        int x [] = {500, 730, 770, 1000};//defines x coordinates for the road
        int y [] = {730, 365, 365, 730};//defines y coordinates for the road
        g.fillPolygon(x, y, 4);//creates the road

        g.setColor (color8);
        int w [] = {500, 710, 730, 500};//defines x coordinates for sidewalk
        int v [] = {625, 365, 365, 730};//defines y coordinates for sidewalk
        g.fillPolygon (w, v, 4);//creates the left sidewalk
        int a [] = {1000, 770, 790, 1000};//defines x coordinates for sidewalk
        int b [] = {730, 365, 365, 625};//defines y coordinates for sidwalk
        g.fillPolygon (a, b, 4);//creates the right sidewalk

        g.setColor (color9);
        int c [] = {500, 500, 710};//defines x coordinates for left grass
        int d [] = {625, 365, 365};//defines y coordinates for left grass
        g.fillPolygon (c, d, 3);//creates the left grass
        int e [] = {1000, 1000, 790};//defines x coordinates for right grass
        int f [] = {625, 365, 365};//defines y coordinates for right grass
        g.fillPolygon (e, f, 3);//creates the right grass

        g.setColor (color8);
        int o [] = {500, 550, 635, 610, 500};//defines x's for driveway
        int h [] = {365, 365, 460, 500, 395};//defines y's for the driveway
        g.fillPolygon (o, h, 5);//creates the driveway
        int i [] = {1000, 1000, 880, 830};//defines x's for driveway
        int j [] = {365, 400, 480, 450};//define y's for driveway
        g.fillPolygon (i, j, 4);//creates the top right driveway
        int k [] = {1000, 1000, 930};//defines x's for driveway
        int l [] = {550, 615, 615};//defines y's for driveway
        g.fillPolygon (k, l, 3);//creates the bottom right driveway

        g.setColor (color10);
        //defines coordinates for a leaf
        int m [] = {750, 755, 752, 757, 754, 759, 744, 747, 742, 745, 743, 750};
        int n [] = {600, 605, 605, 610, 610, 615, 610, 610, 605, 605, 600, 600};
        g.fillPolygon (m, n, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int p [] = {650, 655, 652, 657, 654, 659, 644, 647, 642, 645, 643, 650};
        int q [] = {500, 505, 505, 510, 510, 515, 510, 510, 505, 505, 500, 500};
        g.fillPolygon (p, q, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int am[] = {725, 720, 727, 732, 729, 734, 719, 722, 717, 720, 717, 725};
        int an[] = {650, 655, 655, 660, 660, 665, 660, 660, 655, 655, 650, 650};
        g.fillPolygon (am, an, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int ao[] = {645, 650, 647, 652, 649, 654, 639, 642, 637, 640, 638, 645};
        int ap[] = {400, 405, 405, 410, 410, 415, 410, 410, 405, 405, 400, 400};
        g.fillPolygon (ao, ap, 12);//creates a leaf

        g.setColor (color11);
        //defines coordinates for a leaf
        int r[] = {550, 555, 552, 557, 554, 559, 544, 547, 542, 545, 543, 550};
        int s[] = {400, 405, 405, 410, 410, 415, 410, 410, 405, 405, 400, 400};
        g.fillPolygon (r, s, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int ac[] = {850, 855, 852, 857, 854, 859, 844, 847, 842, 845, 843, 850};
        int ad[] = {600, 605, 605, 610, 610, 615, 610, 610, 605, 605, 600, 600};
        g.fillPolygon (ac, ad, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int aq[] = {600, 605, 602, 607, 604, 609, 594, 597, 592, 595, 593, 600};
        int ar[] = {700, 705, 705, 710, 710, 715, 710, 710, 705, 705, 700, 700};
        g.fillPolygon (aq, ar, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int as [] = {1000, 1005, 1002, 1007, 994, 999, 994, 997, 992, 995, 993,
                     1000};
        int at[] = {400, 405, 405, 410, 410, 415, 410, 410, 405, 405, 400, 400};
        g.fillPolygon (as, at, 12);//creates a leaf

        g.setColor (color12);
        //defines coordinates for a leaf
        int t [] = {750, 755, 752, 757, 754, 759, 744, 747, 742, 745, 743, 750};
        int u [] = {400, 405, 405, 410, 410, 415, 410, 410, 405, 405, 400, 400};
        g.fillPolygon (t, u, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int ae[] = {950, 955, 952, 957, 954, 959, 944, 947, 942, 945, 943, 950};
        int af[] = {400, 405, 405, 410, 410, 415, 410, 410, 405, 405, 400, 400};
        g.fillPolygon (ae, af, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int ai[] = {800, 805, 802, 807, 804, 809, 794, 797, 792, 795, 793, 800};
        int aj[] = {550, 555, 555, 560, 560, 565, 560, 560, 555, 555, 550, 550};
        g.fillPolygon (ai, aj, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int ak[]= {675, 680, 677, 682 , 679, 684, 669, 672, 667, 670, 668, 675};
        int al[] = {500, 505, 505, 510, 510, 515, 510, 510, 505, 505, 500, 500};
        g.fillPolygon (ak, al, 12);//creates a leaf

        g.setColor (color13);
        //defines coordinates for a leaf
        int aa[] = {750, 755, 752, 757, 754, 759, 744, 747, 742, 745, 743, 750};
        int ab[] = {700, 705, 705, 710, 710, 715, 710, 710, 705, 705, 700, 700};
        g.fillPolygon (aa, ab, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int ag[] = {550, 555, 552, 557, 554, 559, 544, 547, 542, 545, 543, 550};
        int ah[] = {700, 705, 705, 710, 710, 715, 710, 710, 705, 705, 700, 700};
        g.fillPolygon (ag, ah, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int au[] = {650, 655, 652, 657, 654, 659, 644, 647, 642, 645, 643, 650};
        int av[] = {600, 605, 605, 610, 610, 615, 610, 610, 605, 605, 600, 600};
        g.fillPolygon (au, av, 12);//creates a leaf
        
        //defines coordinates for a leaf
        int aw[] = {850, 855, 852, 857, 854, 859, 844, 847, 842, 845, 843, 850};
        int ax[] = {500, 505, 505, 510, 510, 515, 510, 510, 505, 505, 500, 500};
        g.fillPolygon (aw, ax, 12);//creates a leaf
    }//END private void drawTheImages (Color color1-13)

    public Project () {
        setTitle ("My favorite seasons: Winter and Autumn");
    }//END public Project ()

    public static void main (String [] args) {
        Frame frm = new Project ();
        frm.setSize (1000, 730);
        frm.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Project