package annotations.createAnnotationtomarkimportantmethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Custom annotation to mark important methods.
 */
@Retention(RetentionPolicy.RUNTIME) // annotation available at runtime
@Target(ElementType.METHOD)         // can be applied to methods only
public @interface ImportantMethod {
    String level() default "HIGH"; // optional parameter with default value
}

