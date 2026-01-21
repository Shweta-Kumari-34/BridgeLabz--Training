package generics.universitycoursemanagementsystem;

public class AssignmentCourse extends CourseType {

	public AssignmentCourse(String courseName, int credits) {
		super(courseName, credits);
	}

	@Override
	public void evaluate() {
		System.out.println(courseName + " evaluated using assignments");
	}
}
