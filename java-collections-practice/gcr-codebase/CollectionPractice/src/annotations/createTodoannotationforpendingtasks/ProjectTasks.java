package annotations.createTodoannotationforpendingtasks;

/*
 * Class containing project tasks
 */
public class ProjectTasks {

    @Todo(task = "Implement login feature", assignedTo = "Shweta", priority = "HIGH")
    public void login() {
        // pending implementation
    }

    @Todo(task = "Add payment gateway", assignedTo = "Amit")
    public void payment() {
        // pending implementation
    }

    @Todo(task = "Optimize database queries", assignedTo = "Neha", priority = "CRITICAL")
    public void optimizeDatabase() {
        // pending implementation
    }

    public void completedTask() {
        // not a pending task
    }
}

