package online_learning_portal;

public class Student extends User {

    private int completedModules;
    private int totalModules;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completed, int total) {
        this.completedModules = completed;
        this.totalModules = total;
    }

    public double getProgressPercentage() {
        return (completedModules * 100.0) / totalModules; // operators
    }
}
