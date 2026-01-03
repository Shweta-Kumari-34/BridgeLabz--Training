package universitycourseenrollmentsystem;


public 	abstract class Student {
	    protected int studentId;
	    protected String name;
	    protected String program;
	    private double gpa;

	    public Student(int studentId, String name, String program) {
	        this.studentId = studentId;
	        this.name = name;
	        this.program = program;
	    }

	    public Student(int studentId, String name, String program, String elective) {
	        this(studentId, name, program);
	        System.out.println("Elective Chosen: " + elective);
	    }

	    protected void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    public double getTranscript() {
	        return gpa;
	    }

	    public void displayInfo() {
	        System.out.println("Student: " + name + ", Program: " + program);
	    }
	}


