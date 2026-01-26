package annotations.createrepeatableannotation;

/**
 * Class demonstrating repeatable BugReport annotations
 */
public class TaskHandler {

    @BugReport(description = "NullPointerException on startTask")
    @BugReport(description = "Incorrect status update")
    public void startTask() {
        System.out.println("Starting task...");
    }

    @BugReport(description = "Task completion message not displayed")
    public void completeTask() {
        System.out.println("Completing task...");
    }
}
