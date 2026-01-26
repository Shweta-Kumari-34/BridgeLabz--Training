package annotations.annotationforloggingmethodexecutiontime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// custom annotation to log execution time
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
}

