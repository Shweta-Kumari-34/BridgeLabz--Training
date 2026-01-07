package virtualpetcareapp;

import java.util.Random;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // encapsulated
    private int energy;   // encapsulated
    private String mood;  // internal status

    // Constructor with random default values
    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 30;   // 30–80
        this.energy = r.nextInt(50) + 30;
        updateMood();
    }

    // Feed pet
    public void feed() {
        hunger -= 10;
        energy += 5;
        normalize();
        updateMood();
        System.out.println(name + " has been fed.");
    }

    // Play with pet
    public void play() {
        hunger += 10;
        energy -= 15;
        normalize();
        updateMood();
        System.out.println(name + " enjoyed playing.");
    }

    // Pet sleeps
    public void sleep() {
        energy += 20;
        hunger += 5;
        normalize();
        updateMood();
        System.out.println(name + " is sleeping.");
    }

    // Ensure values remain in range
    private void normalize() {
        if (hunger < 0) hunger = 0;
        if (hunger > 100) hunger = 100;
        if (energy < 0) energy = 0;
        if (energy > 100) energy = 100;
    }

    // Mood updated internally only
    private void updateMood() {
        if (energy > 60 && hunger < 40)
            mood = "Happy";
        else if (energy < 30)
            mood = "Tired";
        else if (hunger > 70)
            mood = "Hungry";
        else
            mood = "Normal";
    }

    // Display pet status
    public void showStatus() {
        System.out.println("\n--- Pet Status ---");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy);
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
    }

    // Polymorphic behavior
    abstract void makeSound();
}

	

	
	

