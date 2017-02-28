//Celena

import java.awt.*;
import BreezyGUI.*;

public class TicTacToe extends GBApplet {
    Button buttons [] [];
    Button resetButton;
    private String userMark;
    private String computerMark;

    public void init () {
        //Initialize grid of buttons
        buttons = new Button [3] [3];
        Button button;
        int row, col;

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                button = addButton ("", row + 1, col + 1, 1, 1);
                buttons [row] [col] = button;
            }//END for (col = 0; col < 3; col++)
        }//END for (row = 0; row < 3; row++)

        //Set up the Reset button
        resetButton = addButton ("Reset", 4, 1, 3, 1);

        //Choose button labels for user and computer
        if (randomInt (1, 2) == 1) {
            userMark = "X";
            computerMark = "O";
        }//END if (randomInt (1, 2) == 1)
        else {
            userMark = "O";
            computerMark = "X";
        }//END else
    }//END  public void init ()

    public void buttonClicked (Button buttonObj) {
            if (buttonObj == resetButton) {
                clearAndEnableButtons ();
            }//END if (buttonObj == resetButton)
            else
                if (buttonObj.getLabel().equals ("")) {
                    buttonObj.setLabel (userMark);
                    if (playerWins (userMark)) {
                        messageBox ("You Win!");
                        disableButtons ();
                    }//END if (playerWins (userMark))
                    else {
                        clickForComputer ();
                        if (playerWins (computerMark)) {
                            messageBox ("I Win!");
                            disableButtons ();
                        }//END if (playerWins (computerMark))
                    }//END else
                }//END if (buttonObj.getLabel().equals (""))
    }//END public void buttonClicked (Button buttonObj)

    //Make all the butttons empty and enable them
    private void clearAndEnableButtons () {
        int row, col;
        Button button;

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                button = buttons [row] [col];
                button.setLabel ("");
                button.setEnabled (true);
            }//END for (col = 0; col < 3; col++)
        }//END for (row = 0; row < 3; row++)
    }//END private void clearAndEnableButtons ()

    //Disable all the buttons
    private void disableButtons () {
        int row, col;
        Button button;

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                button = buttons [row] [col];
                button.setEnabled (false);
            }//END for (col = 0; col < 3; col++)
        }//END for (row = 0; row < 3; row++)
    }//END private void disableButtons ()

    //Selects the first available empty button
    private void clickForComputer () {
        Button button;
        int row, col;

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                button = buttons [row] [col];
                if (button.getLabel().equals("")) {
                    button.setLabel (computerMark);
                    return;
                }//END if (button.getLabel().equals(""))
            }//ENd for (col = 0; col < 3; col++)
        }//END for (row = 0; row < 3; row++)
    }//END private void clickForComputer ()

    private boolean playerWins (String playerMark) {
            return
            (buttons [0] [0].getLabel().equals (playerMark) &&
             buttons [0] [1].getLabel().equals (playerMark) &&
             buttons [0] [2].getLabel().equals (playerMark)) ||

            (buttons [1] [0].getLabel().equals (playerMark) &&
             buttons [1] [1].getLabel().equals (playerMark) &&
             buttons [1] [2].getLabel().equals (playerMark)) ||

            (buttons [2] [0].getLabel().equals (playerMark) &&
             buttons [2] [1].getLabel().equals (playerMark) &&
             buttons [2] [2].getLabel().equals (playerMark)) ||

            (buttons [0] [0].getLabel().equals (playerMark) &&
             buttons [1] [0].getLabel().equals (playerMark) &&
             buttons [2] [0].getLabel().equals (playerMark)) ||

            (buttons [0] [1].getLabel().equals (playerMark) &&
             buttons [1] [1].getLabel().equals (playerMark) &&
             buttons [2] [1].getLabel().equals (playerMark)) ||

            (buttons [0] [2].getLabel().equals (playerMark) &&
             buttons [1] [2].getLabel().equals (playerMark) &&
             buttons [2] [2].getLabel().equals (playerMark)) ||

            (buttons [0] [0].getLabel().equals (playerMark) &&
             buttons [1] [1].getLabel().equals (playerMark) &&
             buttons [2] [2].getLabel().equals (playerMark)) ||

            (buttons [2] [0].getLabel().equals (playerMark) &&
             buttons [1] [1].getLabel().equals (playerMark) &&
             buttons [0] [2].getLabel().equals (playerMark));
    }//END private boolean playerWins (String playerMark)

    int randomInt (int low, int high) {
        return low + (int) (Math.random () * (high - low + 1));
    }//END int randomInt (int low, int high)
}//END public class TicTacToe