package edumentorpersonalizedlearningplatform;

public class Quiz {
	private String[] questions;
	private int[] correctAnswers; 
	private int score;

	Quiz(String difficulty) {
		if (difficulty.equalsIgnoreCase("easy")) {
			questions = new String[] { "Java is platform independent? (1.Yes 2.No)",
					"JVM stands for Java Virtual Machine? (1.Yes 2.No)" };
			correctAnswers = new int[] { 1, 1 };
		} else {
			questions = new String[] { "Which keyword is used for inheritance? (1.extends 2.implements)",
					"Which is not an OOP concept? (1.Inheritance 2.Compiling)" };
			correctAnswers = new int[] { 1, 2 };
		}
	}

	void startQuiz(java.util.Scanner sc) {
		score = 0;

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			int ans = sc.nextInt();
			if (ans == correctAnswers[i]) {
				score++; // operator usage
			}
		}
	}

	double calculatePercentage() {
		return (score * 100.0) / questions.length;
	}
}
