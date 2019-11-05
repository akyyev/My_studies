package day45_SuperKeyword;

public class Test {

	int x, y;
	
	public Test(int x, int y) {
		init(x,y);
	}
	
	public void init(int x, int y) {
		this.x = x*x;
		this.y = y*y;
		System.out.println(this.x);
		System.out.println(this.y);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=3, y=5;
		
		Test obj = new Test(x,y);
		
		System.out.println(x+" "+y);
	}

}
