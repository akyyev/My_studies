package day44_Inheritance;

public class MultiClass {

	public static void main(String[] args) {
		System.out.println("Main method in MultiClass class");
	}
}


//Class needs to default can't be public... 
//public class name must match with file name(one public class per file)
//so it needs to in separate file with same name.
//if there are multiple main methods within file, when running you need to select which one you want to run

class Book{  
	public static void main(String[] args) {
		System.out.println("Main method in Book class");
	}
}

class NoteBook{ // we can't make this one public and delete public keyword from MultiClass class, reason clasName must match fileName
	
	
}
