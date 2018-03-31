
public class AccountExercise {

	public static void main(String[] args) {
		// Create an Account, Savings Account and a Checkings Account
		Account account = new Account(1, 100000);
		SavingsAccount savingsAccount = new SavingsAccount(2, 100000);
		CheckingsAccount checkingsAccount = new CheckingsAccount(3, 100000, -50);
		
		// Withdraw 1000
		account.withdraw(1000);
		savingsAccount.withdraw(1000);
		checkingsAccount.withdraw(1000);
		
		// Deposit 2000
		account.deposit(2000);
		savingsAccount.deposit(2000);
		checkingsAccount.deposit(2000);
		
		// to string methods
		System.out.print(account.toString());
		System.out.println(savingsAccount.toString());
		System.out.println(checkingsAccount.toString());
	}

}
