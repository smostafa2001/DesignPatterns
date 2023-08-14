package ir.ac.qom.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {super(device);}

    public void setChannel(int number) {_device.setChannel(number);}
}
