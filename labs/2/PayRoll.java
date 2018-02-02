import java.util.Scanner;

public class PayRoll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter data
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		// Calculations
		double grossPay = hoursWorked * rate;
		double federalWithholding = grossPay * federalTax;
		double stateWithholding = grossPay * stateTax;
		double totalDeduction = federalWithholding + stateWithholding;
		double netPay = grossPay - totalDeduction;
			
		// Outputs
		System.out.println("Employees name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay rate: $" + rate);
		System.out.println("Gross pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("Federal withholding" + federalTax * 100 + ": $" + federalWithholding );
		System.out.println("State withholding" + stateTax * 100 + ": $" + stateWithholding);
		System.out.println("Total Deduction: $" + totalDeduction);
		System.out.println("Net pay: $" + netPay);
		
	}

}
