package generics.resumescreeningsystemapp;

public class ProductManager extends JobRole {

	public ProductManager(String name, int experience) {
		super(name, experience);
	}

	@Override
	public boolean isQualified() {
		return experience >= 4;
	}
}
