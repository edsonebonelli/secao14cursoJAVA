package entities;

public class SavingsAccount_2 extends Account_3{
	
	private Double interestRate;

	public SavingsAccount_2(Double interestRate) {
		super();
	}

	public SavingsAccount_2(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
