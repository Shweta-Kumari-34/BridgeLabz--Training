package annotations.createrepeatableannotation;

import java.lang.reflect.Method;

/**
 * Reads and prints all @BugReport annotations from TaskHandler methods
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class<TaskHandler> clazz = TaskHandler.class;

            for (Method method : clazz.getDeclaredMethods()) {
                // check if method has BugReport annotation(s)
                if (method.isAnnotationPresent(BugReport.class)) {
                    System.out.println("Method: " + method.getName());

                    // get all BugReport annotations (repeatable)
                    BugReport[] reports = method.getAnnotationsByType(BugReport.class);
                    for (BugReport report : reports) {
                        System.out.println("Bug: " + report.description());
                    }
                    System.out.println("------------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

