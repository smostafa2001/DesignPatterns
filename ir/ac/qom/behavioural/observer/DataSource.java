package ir.ac.qom.behavioural.observer;

public class DataSource extends Subject {
    private int _value;

    public int getValue() {return _value;}

    public void setValue(int value) {
        _value = value;
        notifyObservers();
    }
}
