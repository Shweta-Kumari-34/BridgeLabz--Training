package annotations.createAnnotationtomarkimportantmethods;

/**
 * Class demonstrating usage of @ImportantMethod
 */
public class TaskService {

    @ImportantMethod(level = "CRITICAL")
    public void launchTask() {
        System.out.println("Launching the task...");
    }

    @ImportantMethod // uses default level "HIGH"
    public void reviewTask() {
        System.out.println("Reviewing the task...");
    }

    public void normalTask() {
        System.out.println("Performing a normal task...");
    }
}

