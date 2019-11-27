package day53_Polymorphism;

public class PolymorphismPractice {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		
		Dog a2 = new Husky();
		a2.eat();
		
		Husky a3 = new Husky();
		a3.eat();
		a3.hunt();
		
		
		
	}
}


abstract class Animal{
	abstract void eat();
}

class Dog extends Animal{

	@Override
	void eat() {
		System.out.println("eating");
	}
	
}

class Husky extends Dog{
	void hunt() {
		System.out.println("hunting");
	}
}