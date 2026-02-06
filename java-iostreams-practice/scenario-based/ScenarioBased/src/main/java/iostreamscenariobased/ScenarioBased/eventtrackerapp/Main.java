package iostreamscenariobased.ScenarioBased.eventtrackerapp;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<AuditEvent> events =
                AuditScanner.scan(UserActions.class);

        JsonAuditLogger.log(events);

        System.out.println("Audit log generated successfully!");
    }
}

