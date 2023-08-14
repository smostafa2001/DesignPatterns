package ir.ac.qom.behavioural.state.abuse;

public class RunningState implements State {
    private Stopwatch _stopwatch;

    public RunningState(Stopwatch stopwatch) {_stopwatch = stopwatch;}

    @Override
    public void click() {
        _stopwatch.setCurrentState(new StoppedState(_stopwatch));
        System.out.println("Stopped");
    }
}
