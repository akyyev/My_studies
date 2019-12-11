package day09;

public class Task02_Time_Day {
	
	public static void main(String[] args) {
		
		int hour=17;
		int min=45, sec=6;
		String amOrPm = "AM";
		
		if(hour>12) {
			hour = hour - 12;
			amOrPm = "PM";
			
		} 
		
		
		
		System.out.printf("Time is: %02d:%02d:%02d %s", hour,min,sec, amOrPm);
		
							// % is for rules, 02 is for 2 digit number... d for int, byte, double, long and short. s for string
		
	}
}
