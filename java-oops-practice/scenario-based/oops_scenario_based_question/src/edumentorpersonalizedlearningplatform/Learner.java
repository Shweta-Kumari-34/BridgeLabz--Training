package edumentorpersonalizedlearningplatform;

class Learner extends User implements ICertifiable {
	private String courseType;

	Learner(String name, String email, int userId, String courseType) {
		super(name, email, userId);
		this.courseType = courseType;
	}

	@Override
	public void generateCertificate(double percentage) {
		System.out.println("\n--- Certificate ---");
		if (courseType.equalsIgnoreCase("short")) {
			System.out.println("Short Course Certificate Issued");
		} else {
			System.out.println("Full-Time Course Certificate Issued");
		}
		System.out.println("Final Score: " + percentage + "%");
	}

}
