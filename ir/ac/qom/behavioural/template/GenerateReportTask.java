package ir.ac.qom.behavioural.template;

public class GenerateReportTask {
    private AuditTrail _auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {_auditTrail = auditTrail;}

    public void execute() {
        _auditTrail.record();

        System.out.println("Generate Report");
    }
}
