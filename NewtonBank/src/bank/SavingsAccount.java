package bank;

public class SavingsAccount {
	private double balance;
	private double interest;
	private String accountType;
	private static int COUNT = 1001;
	private int accountId;

	public SavingsAccount() {
		balance = 0;
		interest = 0.01;
		accountType = "Savings Account";
		setAccountId();
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId() {
		accountId = COUNT++;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance <= 0)
			return;
		this.balance = balance;
	}
	
	public double getInterest() {
		return interest;
	}

	public void deposit(double amount) {
		if(amount < 0)
			return;
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < 0)
			return;
		if(balance < amount)
			throw new IllegalArgumentException("Withdraw amount is too big!");
		balance -= amount;
	}
	
	/**
	 * Calculate interest rate
	 * @return interest rate
	 */
	public double calculateInterest(double balance, double interest) {
		double interestRate = (balance * interest) / 100;
		return interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interest=" + interest + ", accountType=" + accountType
				+ ", accountNumber=" + accountId + "]";
	}

}
