package annotations.createTodoannotationforpendingtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/*
 * @Todo annotation
 * Used to mark pending tasks in a project
 */
@Retention(RetentionPolicy.RUNTIME) // available at runtime
@Target(ElementType.METHOD) // applicable to methods
public @interface Todo {

	String task(); // description of the task

	String assignedTo(); // developer responsible

	String priority() default "MEDIUM"; // default priority
}
