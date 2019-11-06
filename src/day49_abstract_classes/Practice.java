package day49_abstract_classes;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal a1 = new Animal();
		Animal a1 = new Puppy();

		a1.move();
		a1.sleep();
		// a1.drinkMilk(); //drinkMilk() is not defined on Animal class
		// a1.itching();

		System.out.println("--------------------");

		Puppy a2 = new Puppy();
		a2.drinkMilk();

	}

}

abstract class Animal {

	abstract public void move();

	abstract public void sleep();

	public Animal() {
		System.out.println("I am an animal, can be anything");
	}

}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("I'm running, gonna bite Selcuk!!!!Grrrrr");
	}

	@Override
	public void sleep() {
		System.out.println("zzzzz....");
	}

	// not @Override
	public void itching() {
		System.out.println("My ears are itching.... Help me Selcuk!!!!");
	}

}

class Puppy extends Dog {

	/*
	 * All of them are inherited from super class
	 * 
	 * public void move() {
	 * System.out.println("I'm running, gonna bite Selcuk!!!!Grrrrr"); }
	 * 
	 * public void sleep() { System.out.println("zzzzz...."); }
	 * 
	 * public void itching() {
	 * System.out.println("My ears are itching.... Help me Selcuk!!!!"); }
	 * 
	 */

	public void drinkMilk() {
		System.out.println("I am so little, and wanna drink milk, can you give me some milk, Selcuk!");
	}

}