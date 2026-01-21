package generics.universitycoursemanagementsystem;

public class ExamCourse extends CourseType {

	public ExamCourse(String courseName, int credits) {
		super(courseName, credits);
	}

	@Override
	public void evaluate() {
		System.out.println(courseName + " evaluated using final exam");
	}
}
