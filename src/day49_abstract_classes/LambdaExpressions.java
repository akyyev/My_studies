package day49_abstract_classes;

public class LambdaExpressions{



	public static void main(String[] args) {

		
		MyLambda greeting = i -> System.out.println("Hello "+i);
		
		MyAdd addFunction = (a,b) -> a+b;
		
		greeting.foo(5);
		System.out.println(addFunction.add(5, 6));
	 
	}

}


interface MyLambda{
	void foo(int i);
}
interface MyAdd{
	int add(int a, int b);
}






