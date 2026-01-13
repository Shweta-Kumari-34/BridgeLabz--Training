package compartmentNavigationSystem;

public class CompartmentNode {
	String name;
    boolean hasPantry;
    boolean hasWifi;

    CompartmentNode prev;
    CompartmentNode next;

    CompartmentNode(String name, boolean hasPantry, boolean hasWifi) {
        this.name = name;
        this.hasPantry = hasPantry;
        this.hasWifi = hasWifi;
    }
}
