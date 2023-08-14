package ir.ac.qom.structural.bridge;

public class RemoteControl {
    protected Device _device;

    public RemoteControl(Device device) {_device = device;}

    public void turnOn() {_device.turnOn();}

    public void turnOff() {_device.turnOff();}
}
