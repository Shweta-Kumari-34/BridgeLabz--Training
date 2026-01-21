package generics.resumescreeningsystemapp;

public abstract class JobRole {

	protected String candidateName;
	protected int experience; // years

	public JobRole(String candidateName, int experience) {
		this.candidateName = candidateName;
		this.experience = experience;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public int getExperience() {
		return experience;
	}

	public abstract boolean isQualified();
}
