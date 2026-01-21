package generics.resumescreeningsystemapp;

public class SoftwareEngineer extends JobRole {

	public SoftwareEngineer(String name, int experience) {
		super(name, experience);
	}

	@Override
	public boolean isQualified() {
		return experience >= 2;
	}
}
