package annotations.usedeprecatedtomarkoldmethod;

public class LegacyAPI {
	// old method that should not be used anymore
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature (deprecated)");
    }

    // new recommended method
    public void newFeature() {
        System.out.println("This is the new feature");
    }
}
