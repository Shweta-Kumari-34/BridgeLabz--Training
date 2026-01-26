package annotations.annotationforloggingmethodexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void execute(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            // check if annotation is present
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();

                // invoking method
                method.invoke(obj);

                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;

                System.out.println(
                    method.getName() + " executed in " + executionTime + " nanoseconds"
                );
            }
        }
    }
}
