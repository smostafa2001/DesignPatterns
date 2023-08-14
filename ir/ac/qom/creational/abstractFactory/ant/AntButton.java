package ir.ac.qom.creational.abstractFactory.ant;

import ir.ac.qom.creational.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {System.out.println("Ant button");}
}
