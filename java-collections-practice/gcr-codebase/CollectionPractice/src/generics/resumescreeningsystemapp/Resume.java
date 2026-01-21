package generics.resumescreeningsystemapp;

public class Resume<T extends JobRole> {

	private T jobRole;

	public Resume(T jobRole) {
		this.jobRole = jobRole;
	}

	public T getJobRole() {
		return jobRole;
	}

	public void screen() {
		if (jobRole.isQualified()) {
			System.out.println(jobRole.getCandidateName() + " is shortlisted");
		} else {
			System.out.println(jobRole.getCandidateName() + " is rejected");
		}
	}
}
