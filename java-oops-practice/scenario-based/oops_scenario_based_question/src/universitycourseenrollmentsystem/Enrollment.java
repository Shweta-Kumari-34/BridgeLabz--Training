package universitycourseenrollmentsystem;


public 	class Enrollment implements Graded {
	    private Student student;
	    private Course course;
	    private String gradeType; 

	    public Enrollment(Student student, Course course, String gradeType) {
	        this.student = student;
	        this.course = course;
	        this.gradeType = gradeType;
	    }

	    public void assignGrade(double marks) {

	        if (gradeType.equalsIgnoreCase("LETTER")) {
	            double gpa = (marks / 100) * 4; 
	            student.setGpa(gpa);
	        } 
	        else {
	            if (marks >= 50) {
	                student.setGpa(4.0);
	            } else {
	                student.setGpa(0.0);
	            }
	        }
	    }
	}


