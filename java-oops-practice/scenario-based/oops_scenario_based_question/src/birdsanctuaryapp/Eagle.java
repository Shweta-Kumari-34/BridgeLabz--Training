package birdsanctuaryapp;

public class Eagle extends Bird implements Flyable {

    public Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is soaring high in the sky.");
    }
}

