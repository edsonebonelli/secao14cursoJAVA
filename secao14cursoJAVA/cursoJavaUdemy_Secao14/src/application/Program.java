package application;

/*
 * OBSERVAÇÃO:
 * Neste primeiro exemplo temos um uso mais simples de herança, onde encontramos 2 contas
 * a primeira conta é uma conta corrente normal e a segunda é uma BusinessAccount a BusinessAccount herda da conta comum
 * a grande maioria do funcionamento acrescentando somente a questão dos empréstimos liberado a ela.
 */

import entities.BusinessAccount;

public class Program {
	
	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account.getBalance());
	}

}

