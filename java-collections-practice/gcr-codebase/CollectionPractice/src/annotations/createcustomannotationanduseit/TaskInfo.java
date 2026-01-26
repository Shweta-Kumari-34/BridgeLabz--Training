package annotations.createcustomannotationanduseit;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Custom annotation to mark tasks with priority and assigned person.
 */
@Retention(RetentionPolicy.RUNTIME) // annotation available at runtime
@Target(ElementType.METHOD)         // annotation can be applied to methods only
public @interface TaskInfo {
    String priority();
    String assignedTo();
}
