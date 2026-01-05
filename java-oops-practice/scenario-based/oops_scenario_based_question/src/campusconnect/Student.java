package campusconnect;

class Student extends Person implements ICourseActions {

    private int[] grades;   
    private double gpa;

    public Student(int id, String name, String email, int[] grades) {
        super(id, name, email);
        this.grades = grades;
        calculateGPA();
    }

    private void calculateGPA() {
        int sum = 0;
        for (int g : grades) { 
        }
        gpa = (double) sum / grades.length;
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void dropCourse(Course course) {
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    public void printDetails() {     // polymorphism
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + gpa);
    }
}

