package birdsanctuaryapp;

public class Penguin extends Bird implements Swimmable {

    public Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming swiftly.");
    }
}

