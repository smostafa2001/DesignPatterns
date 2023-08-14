package ir.ac.qom.behavioural.observer;

public class Chart implements Observer{
    private DataSource _dataSource;

    public Chart(DataSource dataSource) {_dataSource = dataSource;}

    @Override
    public void update() {
        System.out.println("Chart got updated: " + _dataSource.getValue());
    }
}
