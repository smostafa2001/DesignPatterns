package ir.ac.qom.creational.abstractFactory.material;

import ir.ac.qom.creational.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {System.out.println("Material button");}
}
