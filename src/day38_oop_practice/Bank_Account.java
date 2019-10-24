package day38_oop_practice;

import java.util.Date;
import java.util.Scanner;



class Bank_Account {
	
	String accountHolder;
	long accountNumber;
	double balance;
	
	
	
	public Bank_Account() {
		accountHolder="N/A";
		accountNumber=100_000_000_000l;
		balance=0;
	}
	
	public Bank_Account(String aH, long aN, double Balance) {
		this.accountHolder=aH;
		this.accountNumber=aN;
		this.balance=Balance;
	}
	
	public void deposit(double num) {
		Date d1 = new Date();
		System.out.println("*****"+ d1 + "*****\n");
		System.out.println("\tDEPOSIT");
		String acct = (""+accountNumber).substring(8);
		System.out.println("Account Holder:\t"+ accountHolder);
		System.out.println("Account Number:\t********"+acct);
		System.out.println("Deposit Amount:\t$"+ num);
		
		System.out.println("Your balance:\t$"+balance);
		balance +=num;
		
		System.out.println("New balance:\t$"+balance);
		System.out.println("--------------------------------");
	}
	
	public void withdraw(double num) {
		Date d1 = new Date();
		System.out.println("***"+ d1 + "***\n");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tWITHDRAW");
		String acct = (""+accountNumber).substring(8);
		System.out.println("Account Holder:\t"+ accountHolder);
		System.out.println("Account Number:\t********"+acct);
		System.out.println("Your balance:\t$"+balance);
		
		if(balance<0) {
			System.out.println("You don't have enough balance to withdraw $"+num);
			System.out.println("--------------------------------");
			return;
		}
		
		if(balance>=num) {
			balance -=num;
			System.out.println("Withdraw amount:$"+ num);
			System.out.println("New balance:\t$"+balance);
		}
			
		
		
		else {
			System.out.print("\nYour withdrawal amount($"+num+") is more than your balance!\nTherefore there is $35 extra charge.\nDo you want to continue?(Y/N) ");
			
			String a = sc.nextLine();
			
			if(a.substring(0,1).equalsIgnoreCase("y")) {
				balance -=35;
				balance -=num;
				System.out.println("\nWithdraw amount:$"+ num);
				System.out.println("New balance:\t$"+balance);
			} else {
				System.out.println("\nYour balance:\t$"+balance);
			}
			
			
		}
		
		
		System.out.println("--------------------------------");

	}
	
	public void showBalance() {
		Date d1 = new Date();
		System.out.println("***"+ d1 + "***\n");
		String acct = (""+accountNumber).substring(8);
		System.out.println("Account Holder:\t"+ accountHolder);
		System.out.println("Account Number:\t********"+acct);
		System.out.println("Your balance:\t$"+balance);
		System.out.println("--------------------------------");
		
	}
	
	public void sendMoneyTo(Bank_Account to, double amount) {
		Date d1 = new Date();
		System.out.println("***"+ d1 + "***\n");
		this.balance -= amount;
		to.balance += amount;
		System.out.println("$"+amount+" is sent from "+this.accountHolder+ " to "+to.accountHolder);
		System.out.println("--------------------------------");
	}
	
	
	

}
