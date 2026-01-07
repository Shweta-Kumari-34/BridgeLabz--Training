package virtualpetcareapp;

class Dog extends Pet {

    Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
