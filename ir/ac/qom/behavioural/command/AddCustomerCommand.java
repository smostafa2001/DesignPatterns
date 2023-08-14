package ir.ac.qom.behavioural.command;

import ir.ac.qom.behavioural.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService _service;

    public AddCustomerCommand(CustomerService service) {_service = service;}

    @Override
    public void execute() {_service.addCustomer();}
}
