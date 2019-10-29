package day43_RevievStaticInstance;

public class MyDate {

	public int year;
	public int month;
	public int day;
	private static String[] strMonths =  {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String[] strDays =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private static int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

	
	// constructor
	public MyDate(int month, int day, int year) {
		if (MyDate.isValidDate(month, day, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			System.out.println("Invalid year, month, or day!");
		}
	}
	
	public MyDate() {
		
	}
	
	
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(isValidDate(this.month, day, this.year)) this.day = day;
		else System.out.println("Invalid Day");
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>12 || month<0) System.out.println("Invalid Month!");
		else this.month = month;
	}	
	public int getYear() {
		return year;
	}	
	public void setYear(int year) {
		if(year>9999 || year<0) System.out.println("Invalid Year!");
		else this.year = year;
	}

	
	public void setDate(int month, int day, int year) {
		
		if(MyDate.isValidDate(month, day, year)){
		this.day = day;
		this.month = month;
		this.year = year;
		} else {
			System.out.println("Invalid year, month, or day!");
		}
	}
	
	public static boolean isLeapYear(int year) {
		if(( year%4==0 && year%100!=0 ) || year%400==0) {
			return true;
		} else return false;
	}
	// 2-28-2021
	public static boolean isValidDate(int month, int day, int year) {
		if(year>9999 || year<=0) return false;
		if(month<=0 || month>12) return false;
		
		int m = daysInMonths[month-1];
		
		if(month!=2) {
			if(day>0 && day<=m) return true;
			else return false;
		} else {
			if(isLeapYear(year) && day<=29 && day>0) return true; 
			else if(day<=28 && day>0) return true;
			else return false;
		}
	}
	 
	
	public static int getDayOfWeek(int month, int day, int year) {
		int num=0;
		
		//step-1 Find century and add nums based on table
		//https://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html#dateutil
		int century = year/10/10;
		
		if(century%4==1) num +=4;
		if(century%4==2) num +=2;
		if(century%4==3) num +=0;
		else num+=6;
		
		
		//step-2 Get the last two digit and add to num;
		num +=year%100;
		
		//step-3 Add to "the last two digit of the year divide by 4, truncate the fractional part".
		num +=year%100/4;
		
		//step-4 Add to the number obtained from the following month table:
		int monthTableNonLeapYear[] = {0,3,3,6,1,4,6,2,5,0,3,5};
		int monthTableLeapYear[] = 	  {6,2,3,6,1,4,6,2,5,0,3,5};
		
		if(isLeapYear(year)) num += monthTableLeapYear[month-1];
		else num += monthTableNonLeapYear[month-1];
		
		
		//step-5 Add the day
		num +=day;
		
		//step-6 Take the module
		
		num = (num-1)%7;

		return num;
	}
	
	
	public String toString() {	
		return strMonths[month-1]+" "+getDay()+" "+year + "  "+ strDays[getDayOfWeek(month, day, year)];	
	}
	
	
	public MyDate nextDay() {
		if(isValidDate(month, day+1, year)) return new MyDate(this.month, this.day+1, this.year);
		else if(isValidDate(month+1, 1 , year)) return new MyDate(this.month+1, 1, this.year);
		else return new MyDate(1, 1, this.year+1);
	}

	public MyDate nextMonth() {
		if(isValidDate(month+1, day, year)) return new MyDate(this.month+1, this.day, this.year);
		else return new MyDate(1, this.day, this.year+1);
	}
	
	public MyDate nextYear() {
		return new MyDate(this.month, this.day, this.year+1);
	}
	
	//   3/1/2021   --> 2/28/2021
	public MyDate yesterday() {
		if(isValidDate(month, day-1, year)) return new MyDate(this.month, this.day-1, this.year);
		else if(isValidDate(month-1, 31 , year)) return new MyDate(this.month-1, 31, this.year);
		else if(isValidDate(month-1, 30 , year)) return new MyDate(this.month-1, 30, this.year);
		else if(isValidDate(month-1, 29 , year)) return new MyDate(this.month-1, 29, this.year);
		else if(isValidDate(month-1, 28 , year)) return new MyDate(this.month-1, 28, this.year);
		else if(isValidDate(12, 31 , year-1)) return new MyDate(12, 31, this.year-1);
		else if(isValidDate(12, 30 , year-1)) return new MyDate(12, 30, this.year-1);
		else if(isValidDate(12, 29 , year-1)) return new MyDate(12, 29, this.year-1);
		else return new MyDate(12, 28, this.year-1);


	}
}

