package day41_static_initializer_block;

public class InstanceBlockPractice {

	public String name = "Yunus";
	
	
	//instance block-1
	{
		System.out.println("First decleration of name: "+name); //Yunus
		name = "Gulshat";
	}
	
	//instance block-2
	{
		System.out.println("After first instance block, name: "+name); // Gulshat
		name = "Bagtyyar";
	}
	
	
	//constructor
	public InstanceBlockPractice() {
		name = "Isgenderow";
	}
	//constructor overload
	public InstanceBlockPractice(int a) {
		name = "Akyyev";
	}
	
	

	public static void main(String[] args) {
		
		//System.out.println(name); --> compile error, reason: instance variable needs class obj.
		
		InstanceBlockPractice obj1 = new InstanceBlockPractice();
		System.out.println(obj1.name); // --> name: 1-Yunus, 2-Gulshat, 3-Bagtyyar, then constructor 4-Isgenderow
		
		
		InstanceBlockPractice obj2 = new InstanceBlockPractice(1);
		System.out.println(obj2.name); // --> name: 1-Yunus, 2-Gulshat, 3-Bagtyyar, then constructor 4-Akyyev
		
	}
	
}
