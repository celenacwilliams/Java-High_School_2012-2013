 //Celena

public class Rooms {
    //declare class variables
    int numSmoking, numNonSmoking;
    boolean occupied [];

    public Rooms (int non, int sm) {
        //construct an array of boolean values equal to the total number of rooms
        occupied = new boolean [sm + non];
        
        for (int i = 0; i < (sm + non); i++)
            occupied [i] = false;//set each occupied room to false or empty
        
        //intialize the number of smoking and non smoking
        numSmoking = sm;
        numNonSmoking = non;
    }//END public Rooms (int non, int sm)

    public int bookRoom (boolean smoking) {
        int begin, end, roomNumber = 0;

        if (!smoking) {
            begin = 0;
            end = numNonSmoking;
        }//END if (!smoking)
        else {
            begin = numNonSmoking;
            end = numSmoking + numNonSmoking;
        }//END else

        for (int i = begin; i < end; ++i) {
            if (!occupied [i]) { //if room is not occupied
                occupied [i] = true;
                roomNumber = i + 1;
                i = end;//to exit loop
            }//END if (!occupied [i])
        }//END for (int i = begin; i < end; ++i)
        return roomNumber;
    }//END public int bookRoom (boolean smoking)
}//END public class Rooms