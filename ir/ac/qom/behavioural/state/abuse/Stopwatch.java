package ir.ac.qom.behavioural.state.abuse;

public class Stopwatch {
    //private boolean isRunning;
    private State currentState = new StoppedState(this);

    public void click() {
        /*if (isRunning) {
            isRunning = false;
            System.out.println("Stopped");
        } else {
            isRunning = true;
            System.out.println("Running");
        }*/
        currentState.click();
    }

    public State getCurrentState() {return currentState;}

    public void setCurrentState(State currentState) {this.currentState = currentState;}
}
