package annotations.useoverridecorrectly;

public class Dog extends Animal  {
	// overriding parent class method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
