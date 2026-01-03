package universitycourseenrollmentsystem;


	public class Main {
	    public static void main(String[] args) {

	        Student s1 = new Undergraduate(101, "Rahul");
	        Student s2 = new Postgraduate(102, "Anita");

	        Course c1 = new Course("CS101", "Data Structures");

	        Faculty f1 = new Faculty("Dr. Mehta");

	        Enrollment e1 = new Enrollment(s1, c1, "LETTER");
	        Enrollment e2 = new Enrollment(s2, c1, "PASSFAIL");

	        s1.displayInfo();
	        s2.displayInfo();
	        c1.displayCourse();
	        f1.displayFaculty();

	        e1.assignGrade(85);
	        e2.assignGrade(45);

	        System.out.println("Rahul GPA: " + s1.getTranscript());
	        System.out.println("Anita GPA: " + s2.getTranscript());
	    }
	}


