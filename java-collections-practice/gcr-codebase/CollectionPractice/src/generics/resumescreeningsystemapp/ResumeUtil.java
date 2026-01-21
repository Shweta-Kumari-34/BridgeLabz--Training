package generics.resumescreeningsystemapp;

import java.util.*;

public class ResumeUtil {

	public static <T extends JobRole> Resume<T> generateResume(T role) {
		return new Resume<>(role);
	}

	public static void screenAll(List<? extends JobRole> candidates) {
		for (JobRole role : candidates) {
			Resume<JobRole> resume = new Resume<>(role);
			resume.screen();
		}
	}
}
