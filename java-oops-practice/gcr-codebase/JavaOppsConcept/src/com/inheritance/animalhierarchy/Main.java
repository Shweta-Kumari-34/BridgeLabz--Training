package com.inheritance.animalhierarchy;

public class Main {
	 
	    public static void main(String[] args) {
	        
	        Animal dog = new Dog("Tommy", 3);
	        Animal cat = new Cat("Kitty", 2);
	        Animal bird = new Bird("Tweety", 1);

	       
	        dog.makeSound();
	        cat.makeSound();
	        bird.makeSound();
	    }
	}

