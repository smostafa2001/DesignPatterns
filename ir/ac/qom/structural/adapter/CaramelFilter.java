package ir.ac.qom.structural.adapter;

import ir.ac.qom.structural.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel _caramel;

    public CaramelFilter(Caramel caramel) {_caramel = caramel;}

    @Override
    public void apply(Image image) {
        _caramel.init();
        _caramel.render(image);
    }
}
