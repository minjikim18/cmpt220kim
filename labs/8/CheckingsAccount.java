
public class CheckingsAccount extends Account {

	private double overdraftLimit;
	
	public CheckingsAccount() {
		super();
		overdraftLimit = -50;
	}
	
	public CheckingsAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void setOverdraftLimit() {
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error, Your amount exceeds the overdraft limit.");
	}
	
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + getOverdraftLimit();
	}
}
