package day43_RevievStaticInstance_Date_YEAR_DAY;


public class MyDateTester{
	


	public static void main(String[] args) {
		
		
		boolean url = "aaabbbccc".contains("ab");
		System.out.println(url);
		
		MyDate d0 = new MyDate();
		d0.setDate(5, 1, 1990);
		
		MyDate d1 = new MyDate(6,1,2371);
		MyDate d2 = new MyDate(10, 25, 2019);
		MyDate d3 = new MyDate(10, 31, 2019);
		
		
		System.out.println(MyDate.isLeapYear(2021));
		System.out.println(MyDate.isValidDate(2, 28, 2021));
		System.out.println(MyDate.getDayOfWeek(1, 10, 2020));
		
		System.out.println("---------------------------");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("Yesterday: \t"+d3.yesterday());
		
		
		System.out.println("Today: \t\t"+d3);
		System.out.println("Tomorrow: \t"+d3.nextDay());
		System.out.println("Next month: \t"+d3.nextMonth());
		
		System.out.println(d0.yesterday());


	}
}