import java.util.Date;

public class Account {

	// Data fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date date;
	
	// Constructor for default values;
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		date = new Date();
	}
	
	// Constructor for specified ID and given initial balance
	public Account(int specifiedId, double initialBalance) {
		id = specifiedId;
		balance = initialBalance;
		date = new Date();
	}
	
	// Mutator methods
	public void setId(int specifiedId) {
		id = specifiedId;
	}
	
	public void setBalance(double initialBalance) {
		balance = initialBalance; 
	}
	
	public void setAnnualInterestRate(double theAnnualInterestRate) {
		annualInterestRate = theAnnualInterestRate;
	}
	
	// Accessor methods
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDate() {
		return date.toString();
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMontlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	// This will decrease balance by the amount 
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// This will increase balance by the amount
	public void deposit(double amount) {
		balance -= amount;
	}
	
}
