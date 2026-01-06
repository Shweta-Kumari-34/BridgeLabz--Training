package edumentorpersonalizedlearningplatform;

public class Instructor extends User {
	Instructor(String name, String email, int userId) {
		super(name, email, userId);
	}

	void createQuiz() {
		System.out.println("Instructor created a quiz");
	}
}
