package observerExercise;

public class Passenger { // FILL IN CODE: must implement Observer
    public final static int MAX_WAIT = 10; // Max time willing to wait  -  10 mins
    private String name;
    private int myTrainNumber;
    private Subject trainManager;

    public Passenger(String name, int myTrainNumber, Subject trainManager) {
        this.name = name;
        this.myTrainNumber = myTrainNumber;
        this.trainManager = trainManager;
    }

    public void update() {
       // FILL IN CODE: if the delay for their train is > MAX_WAIT, then print
       // "Bummer, that's too long, I have to take Uber instead."

        // If there is a delay, but it is less than MAX_WAIT time, then print
        // I will wait - the train should be here soon;

        // If there is no delay, print "Glad to know my train is still on time"
    }

}
