package com.oops.abs;

public class CastMain {

	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.makeSound();
		Dog dog=(Dog)animal;
		dog.play();
		animal=new Cat();
		Cat cat=(Cat)animal;
		cat.makeSound();
//		animal.makeSound();
	}

}
