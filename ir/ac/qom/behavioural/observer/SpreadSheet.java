package ir.ac.qom.behavioural.observer;

public class SpreadSheet implements Observer{
    private DataSource _dataSource;

    public SpreadSheet(DataSource dataSource) {_dataSource = dataSource;}

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: " + _dataSource.getValue());
    }
}
