
public class AccountExercise {

	public static void main(String[] args) {
		
		// Create an Account with ID 1122 and initial balance 20,000
		Account account = new Account(1122, 20000);
		
		// Set annual interest rate to 4.5%
		account.setAnnualInterestRate(4.5);
		
		// Withdraw amount is 2,500
		account.withdraw(2500);
		
		// Deposit amount is 3,000;
		account.deposit(3000);
		
		// Display balance, monthly interest and date when account is created
		System.out.println(account.getBalance());
		System.out.println(account.getMontlyInterest());
		System.out.println(account.getDate());
	}

}
