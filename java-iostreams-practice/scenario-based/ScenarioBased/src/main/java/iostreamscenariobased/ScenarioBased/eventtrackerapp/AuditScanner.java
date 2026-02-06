package iostreamscenariobased.ScenarioBased.eventtrackerapp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AuditScanner {

    public static List<AuditEvent> scan(Class<?> targetClass) {

        List<AuditEvent> events = new ArrayList<>();

        for (Method method : targetClass.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                events.add(new AuditEvent(
                        audit.action(),
                        audit.severity(),
                        method.getName()
                ));
            }
        }
        return events;
    }
}

