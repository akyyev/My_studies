package day11;


public class Fibonacci {
	
	public static int fib(int n){
		if (n <= 1) return n;
		return fib(n - 1) + fib(n - 2);
	}

	
}

class Tester{
	
	public static void main(String[] args) {
		
		System.out.println(Fibonacci.fib(9));
		
	}
}