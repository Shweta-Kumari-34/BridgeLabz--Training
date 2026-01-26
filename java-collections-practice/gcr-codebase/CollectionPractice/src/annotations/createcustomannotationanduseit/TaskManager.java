package annotations.createcustomannotationanduseit;

/**
 * TaskManager class with methods annotated using @TaskInfo
 */
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Dipali")
    public void completeTask() {
        System.out.println("Completing the task...");
    }

    @TaskInfo(priority = "Medium", assignedTo = "PriyaKumari")
    public void reviewTask() {
        System.out.println("Reviewing the task...");
    }

    @TaskInfo(priority = "Low", assignedTo = "ShwetaKumari")
    public void planTask() {
        System.out.println("Planning the task...");
    }
}
