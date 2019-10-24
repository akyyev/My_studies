package day9;

public class if_statement {
	public static void main(String[] args) {
		
		byte userAge;
		boolean isEligable = false;
		
		userAge = 20;
		
		if(userAge>=18) {
			isEligable = true;
			System.out.println("User is eligable to vote " + isEligable);
		}
		
		
	}
}
