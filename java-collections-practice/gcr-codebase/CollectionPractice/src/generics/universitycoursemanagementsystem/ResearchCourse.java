package generics.universitycoursemanagementsystem;

public class ResearchCourse extends CourseType {

	public ResearchCourse(String courseName, int credits) {
		super(courseName, credits);
	}

	@Override
	public void evaluate() {
		System.out.println(courseName + " evaluated using research paper");
	}
}
