package day42_encapsulation;

public class AccessModifiers {

	
	/*
	 class:
        data/attribute ==> instance variables
 
        Actions     ==>  instance method
instance variable: belongs to the object. each object has its own copy of instance variable

Encapsulation: to hide the instance variable (hiding the data)
            1. hiding the data by giving private access modifier
            2. grants other classes get access to the private data using public getter and setter
    
    getter (Read only): an instance method that returns the private data, does not pass any parameter
                the return of the method MUST match with the data-type of the instance variable
                access modifier needs to be public 
    Setter(Modify): 

private: if the feature is private, the feature is only visible within the class
        codes outside the class cannot access to the data
        not accessible to any other class
	 
	 */
	
	private static int testing = 0;
	
	public static int getTesting() {
		return testing;
	}

	public static void setTesting(int testing) {
		AccessModifiers.testing = testing;
	}

	private String lastName;
	private String name ="Jonah";
	private int age = 2;
	public int height = 85;
	public static int testing2=10;
	
	//getter to read private field
	public String getName() {
		return name;
	}
	
	//setter to modify data on private field
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0) this.age = age;
	}
	
	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
