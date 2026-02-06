package iostreamscenariobased.ScenarioBased.eventtrackerapp;

import java.time.LocalDateTime;

public class AuditEvent {

    private String action;
    private String severity;
    private String methodName;
    private String timestamp;

    public AuditEvent(String action, String severity, String methodName) {
        this.action = action;
        this.severity = severity;
        this.methodName = methodName;
        this.timestamp = LocalDateTime.now().toString();
    }
}

