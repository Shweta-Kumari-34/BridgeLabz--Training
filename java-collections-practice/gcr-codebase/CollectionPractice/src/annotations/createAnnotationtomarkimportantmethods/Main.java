package annotations.createAnnotationtomarkimportantmethods;

import java.lang.reflect.Method;

/**
 * Reads and prints all methods annotated with @ImportantMethod
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class<TaskService> clazz = TaskService.class;

            for (Method method : clazz.getDeclaredMethods()) {
                // check if method has @ImportantMethod annotation
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Importance Level: " + annotation.level());
                    System.out.println("------------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

