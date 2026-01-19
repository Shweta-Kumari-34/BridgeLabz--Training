package birdsanctuaryapp;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(int id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying short distances.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the pond.");
    }
}

