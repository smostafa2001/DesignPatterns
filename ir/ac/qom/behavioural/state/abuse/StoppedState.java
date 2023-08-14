package ir.ac.qom.behavioural.state.abuse;

public class StoppedState implements State {
    private Stopwatch _stopwatch;

    public StoppedState(Stopwatch stopwatch) {_stopwatch = stopwatch;}

    @Override
    public void click() {
        _stopwatch.setCurrentState(new RunningState(_stopwatch));
        System.out.println("Running");
    }
}
