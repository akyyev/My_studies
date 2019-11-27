package day55_Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{
	public String name, jobTitle;
	public double salary;
	
	public abstract void dailyStandUp();
	public abstract void demo();
	public abstract String toString();
}

class Testers extends ScrumTeam{

	
	public Testers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	
	public void findBug() {
		System.out.println("Tester "+name+ " found a bug...");
	}
	
	@Override
	public void dailyStandUp() {
		System.out.println("Tester "+name+ " is talking");
	}

	@Override
	public void demo() {
		System.out.println("Tester "+name+" is doing demo");
	}
	
	@Override
	public String toString() {
		return "--------------------\nTester: " + name +"\nJob title: "+jobTitle+"\nSalary: $"+salary;
	}
	
	
}

class Developers extends ScrumTeam{

	public Developers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public void fixBug() {
		System.out.println("Developer "+name+" is fixing the bug");
	}
	
	@Override
	public void dailyStandUp() {
		System.out.println("Developer "+name+ " is talking");
	}

	@Override
	public void demo() {
		System.out.println("Developer "+name+ " is doing demo");
	}
	
	@Override
	public String toString() {
		return "--------------------\nDeveloper: " + name +"\nJob title: "+jobTitle+"\nSalary: $"+salary;
	}
	
}

public class BOA {

	public static void main(String[] args) {
		ScrumTeam t1 = new Testers("John", "Manual tester", 70_000);
		ScrumTeam t2 = new Testers("Khan", "Automation Tester", 130_000);
		ScrumTeam t3 = new Testers("Merry", "Sdet", 90_000);
		ScrumTeam t4 = new Testers("Sam", "Scrum Master", 120_000);
	
		ScrumTeam d1 = new Developers("Akiyev", "Junior Dev", 150_000);
		ScrumTeam d2 = new Developers("Jonah", "Senior Dev", 190_000);
		ScrumTeam d3 = new Developers("Aynur", "Junior Dev", 160_000);
		ScrumTeam d4 = new Developers("Aishe", "Junior Dev", 140_000);
		
		
		ArrayList<ScrumTeam> list = new ArrayList<ScrumTeam>(Arrays.asList(t1,t2,t3,t4,d1,d2,d3,d4));
		
		for(ScrumTeam each : list) {
			System.out.println(each);
		}
		
	}
}










