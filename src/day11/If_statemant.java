package day11;

public class If_statemant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// January=March=May=July=August=October=December=31, February = 29 -28
		// April=June=September=November=30
		// leap year has 366 days and February=29 day

		String[] $31day = { "January", "March", "May", "July", "August", "October", "December" };
		String[] $30day = { "April", "June", "September", "November" };


		

		
		String month = "March";
		int year = 2021;
		
		
		
		
		boolean leapYear = false;
		if (year % 4 == 0) {
			leapYear = true;
		}


		if (month == "February" && leapYear == true) System.out.println(month + " is 29 day month and \n" + year + " is leap year: " + leapYear);
		else if (leapYear == false)		System.out.println(month + " is 28 day month and \n" + year + " is leap year: " + leapYear);
		else {

			for (int i = 0; i < $31day.length; i++) {
				if ($31day[i] == month) System.out.println(month + " is 31 day month and \n" + year + " is leap year: " + leapYear);
			} 

			for (int i = 0; i < $30day.length; i++) {
				if ($30day[i] == month) System.out.println(month + " is 30 day month and \n" + year + " is leap year: " + leapYear);
			}
		}

	}

}
