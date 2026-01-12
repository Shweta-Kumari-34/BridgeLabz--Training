package online_learning_portal;

public class Main {

	    public static void main(String[] args) {

	        Instructor instructor = new Instructor("Rahul", "rahul@skillforge.com");

	        Course javaBasics = new BeginnerCourse("Java Basics", instructor);
	        Course springBoot = new AdvancedCourse(
	                "Spring Boot Mastery",
	                instructor,
	                new String[]{"Core Spring", "REST APIs", "Microservices"}
	        );

	        Student student = new Student("Anita", "anita@gmail.com");
	        student.updateProgress(3, 3);

	        System.out.println("Progress: " + student.getProgressPercentage() + "%");
	        System.out.println(javaBasics.generateCertificate());
	        System.out.println();
	        System.out.println(springBoot.generateCertificate());
	    }
	}


