package ir.ac.qom.behavioural.command;

import ir.ac.qom.behavioural.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
