package bank;

import java.util.ArrayList;

/**
 * 
 * @author Lidiya
 *
 */
public class Customer {
	private String name;
	private long pNr;
	private ArrayList<SavingsAccount> accounts;

	public Customer(String name, long pNr) {
		this.name = name;
		this.pNr = pNr;
		accounts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null)
			throw new NullPointerException();
		this.name = name;
	}

	public long getpNr() {
		return pNr;
	}

	public ArrayList<SavingsAccount> getAccounts() {
		return accounts;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "  PersonID: " + getpNr();
	}

}
