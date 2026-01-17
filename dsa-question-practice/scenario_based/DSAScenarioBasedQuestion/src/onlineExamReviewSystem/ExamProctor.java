package onlineExamReviewSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExamProctor {

	private Stack<Integer> navigationStack = new Stack<>();
	private Map<Integer, String> answerMap = new HashMap<>();
	private Map<Integer, String> correctAnswers = new HashMap<>();

	ExamProctor() {
		correctAnswers.put(1, "A");
		correctAnswers.put(2, "C");
		correctAnswers.put(3, "B");
	}

	void visitQuestion(int questionId) {
		navigationStack.push(questionId);
		System.out.println("Visited Question " + questionId);
	}

	void submitAnswer(int questionId, String answer) {
		answerMap.put(questionId, answer);
		System.out.println("Answer saved for Question " + questionId);
	}

	void lastVisited() {
		if (navigationStack.isEmpty()) {
			System.out.println("No questions visited yet");
			return;
		}
		System.out.println("Last visited question: " + navigationStack.peek());
	}

	int evaluateScore() {
		int score = 0;

		for (Map.Entry<Integer, String> entry : answerMap.entrySet()) {
			int qId = entry.getKey();
			String answer = entry.getValue();

			if (answer.equals(correctAnswers.get(qId))) {
				score++;
			}
		}
		return score;
	}

	void submitExam() {
		int finalScore = evaluateScore();
		System.out.println("Exam submitted");
		System.out.println("Final Score: " + finalScore);
	}
}
