package day38_oop_practice;



public class Bank_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Bank_Account b1 = new Bank_Account();
		Bank_Account b2 = new Bank_Account("Seyfo", 423912432421l, 800);
		Bank_Account b3 = new Bank_Account("Akiyev", 348731324254l, 25);
		
	
		
		b1.withdraw(45);
		b1.withdraw(30);
		
		
		
		
		b2.sendMoneyTo(b3, 800);
		b2.showBalance();
		
		b3.showBalance();
		
		b3.withdraw(825);
		b3.showBalance();
		

	}


}


