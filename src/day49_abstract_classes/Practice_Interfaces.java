package day49_abstract_classes;

public class Practice_Interfaces extends Super implements Test, Test3{

	public Practice_Interfaces(int x) {
		super(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super obj = new Super(3);
		Practice_Interfaces obj2= new Practice_Interfaces(100);
		
		
		System.out.println(Test.pi);
		// pi=5; cannot change value, because it's final by default from Interface
		
		obj2.methodWithoutBody();
		
	}

	@Override
	public void method1() {
		System.out.println("Learning Interfaces");
		
	}

	@Override
	public void method2() {
		System.out.println("Learnign Details");
		
	}

	@Override
	public void method200(int x) {
		System.out.println("Argument is "+x);
		
	}

	@Override
	public void methodWithoutBody() {
		// TODO Auto-generated method stub
		System.out.println("--------");
	}

}

class Super{
	
	public Super(int x) {
		System.out.println("This is super class and value of argument is "+x);
	}
}

interface Test extends Test2{
	
	abstract public void method1();
	void method2();

}

interface Test2{
	
	//double pi; //gives compile error it needs to be initialized
	double pi = Math.PI;
	
	void method200(int x);
	
	 public void methodWithoutBody();
	
}


interface Test3{
	
	double pi = 3.14;
	void method200(int x);
}