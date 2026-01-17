package onlineExamReviewSystem;

public class Main {
	public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "B");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "B");

        exam.lastVisited();
        exam.submitExam();
    }
}
