package birdsanctuaryapp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class Sanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void removeBirdById(int id) {
        Iterator<Bird> it = birds.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Bird removed.");
                return;
            }
        }
        System.out.println("Bird not found.");
    }

    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayInfo();
            showAbilities(b);
        }
    }

    public void displayFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.displayInfo();
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.displayInfo();
                ((Swimmable) b).swim();
            }
        }
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    // Reflection usage
    public void showDeveloperInfo() {
        try {
            Class<?> cls = Bird.class;
            if (cls.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
                System.out.println("Developed by: " + info.developer());
                System.out.println("Version: " + info.version());
            }

            System.out.println("Available Bird Methods:");
            for (Method m : cls.getDeclaredMethods()) {
                System.out.println(m.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showAbilities(Bird b) {
        if (b instanceof Flyable) {
            ((Flyable) b).fly();
        }
        if (b instanceof Swimmable) {
            ((Swimmable) b).swim();
        }
        b.eat();
    }
}

