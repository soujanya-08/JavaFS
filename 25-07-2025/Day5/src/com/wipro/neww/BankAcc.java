package com.wipro.neww;
//Anonymous class: doesnt have name
public class BankAcc {

	public static void main(String[] args) {
		
		BankOps curr = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println("Current acc" + amount);
				
			}
			
		};
		curr.deposit(2.3);
		BankOps savings = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println("Savings acc" +amount);
				
			}
			
		};
		savings.deposit(3.3);
	}

}
