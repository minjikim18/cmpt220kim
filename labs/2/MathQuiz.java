import java.util.Scanner;

public class MathQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Random number generator 
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);    
		int number3 = (int)(System.currentTimeMillis() / 100 % 10);
		
		// Create Scanner for input
		Scanner input = new Scanner(System.in);
		
		// Ask user the math question
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
		
		int answer = input.nextInt();
		
		// Print out the answer and whether or not the user is correct or incorrect
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " 
				+ (number1 + number2 + number3 == answer));
	}

}
