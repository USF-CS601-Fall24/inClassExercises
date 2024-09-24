package observerExercise;

import java.util.*;
/** Represents a transportation agency like Caltrain that runs the trains.
 * Implements the Subject interface. */
public class Caltrain  { // FILL IN CODE: must implement Subject
   // FILL IN CODE:
   // Add a hashmap where the key is the train #, and the value
   // is the delay in minutes for this train
   // FILL IN CODE: Add a list of observers

    // FILL IN CODE: implement methods from the Subject interface


    public void updateDelay(int trainNumber, int additionalDelay) {
        // Update the delay for a particular train, and notify all observers
    }

    // Return the delay in minutes for a given train number
    public Integer getDelayInfo(int trainNumber) {
        // FILL IN CODE:

        return 0;
    }

    // Return true if the given train is on time, false otherwise.
    public boolean isOnTime(int trainNumber) {
        // FILL IN CODE:

        return true;
    }
}

