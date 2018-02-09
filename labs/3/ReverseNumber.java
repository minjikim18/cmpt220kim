import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in); 

	// Prompt user to enter an integer
	System.out.print("Enter an integer: ");
	int number = input.nextInt();

	// Print whether  integer is a palindrome or not
	System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
		"a palindrome.");
}

	// Method to reverse number
	public static int reverse(int number) {
		String reverse = ""; 	
		String n = number + ""; 
	// Reverse string
	for (int i = n.length() - 1; i >= 0; i--) {
		reverse += n.charAt(i);
	}
	return Integer.parseInt(reverse); 
}
	
	// Method to check if number is plaindrome or not
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
}

}