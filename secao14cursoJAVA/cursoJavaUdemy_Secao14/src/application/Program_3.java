package application;

import entities.Account_3;
import entities.BusinessAccount_3;
import entities.SavingsAccount_2;

public class Program_3 {

	public static void main(String[] args) {
		
		Account_3 acc1 = new Account_3(1001, "Alex", 1000.0);
		acc1.withdraw(0);
		System.out.println(acc1.getBalance());
		
		Account_3 acc2 = new SavingsAccount_2(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(0);
		System.out.println(acc2.getBalance());
		
		Account_3 acc3 = new BusinessAccount_3(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(0);
		System.out.println(acc3.getBalance());
	}

}
