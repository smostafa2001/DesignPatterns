package ir.ac.qom.behavioural.template;

public abstract class Task {
    private AuditTrail _auditTrail;

    public Task() {_auditTrail = new AuditTrail();}

    public Task(AuditTrail auditTrail) {_auditTrail = auditTrail;}

    public void execute() {
        _auditTrail.record();

        doExecute();
    }

    protected abstract void doExecute();
}
