package application;

import entities.Account_2;
import entities.BusinessAccount_2;
import entities.SavingsAccount;

public class Program_2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Account_2 acc = new Account_2(1001, "Alex", 0.0);
		BusinessAccount_2 bacc = new BusinessAccount_2(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account_2 acc1 = bacc;
		Account_2 acc2 = new BusinessAccount_2(1003, "Bob", 0.0, 200.0);
		Account_2 acc3 = new BusinessAccount_2(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount_2 acc4 = (BusinessAccount_2)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
				if (acc3 instanceof BusinessAccount_2) {
					BusinessAccount_2 acc5 = (BusinessAccount_2)acc3;
					acc5.loan(200.0);
					System.out.println("Loan!");
				}
				
				if (acc3 instanceof SavingsAccount) {
					SavingsAccount acc5 = (SavingsAccount)acc3;
					acc5.updateBalance();
					System.out.println("Update!");
				}
	}

}
