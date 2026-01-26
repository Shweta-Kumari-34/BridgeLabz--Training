package annotations.createTodoannotationforpendingtasks;

import java.lang.reflect.Method;

/*
 * Reads and displays all @Todo annotations
 */
public class Main {

    public static void main(String[] args) {

        Class<ProjectTasks> clazz = ProjectTasks.class;

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method Name : " + method.getName());
                System.out.println("Task        : " + todo.task());
                System.out.println("Assigned To : " + todo.assignedTo());
                System.out.println("Priority    : " + todo.priority());
                System.out.println("--------------------------------");
            }
        }
    }
}

