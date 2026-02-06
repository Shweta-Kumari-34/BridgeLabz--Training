package iostreamscenariobased.ScenarioBased.eventtrackerapp;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuditTrail {
    String action();
    String severity() default "INFO";
}

