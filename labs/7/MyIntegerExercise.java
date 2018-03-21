
public class MyIntegerExercise {

	public static void main(String[] args) {
	
	// Variables
	MyInteger integer1 = new MyInteger(13);
	MyInteger integer2 = new MyInteger(20);
	MyInteger integer3 = new MyInteger(13);
	
	// Check if number is prime
	System.out.println(integer1.getValue() + " is prime? " + integer1.isPrime());
	System.out.println(integer2.getValue() + " is prime? " + integer2.isPrime());
	
	// Check if number is even
	System.out.println(integer1.getValue() + " is even? " + integer1.isEven());
	System.out.println(integer2.getValue() + " is even? " + integer2.isEven());
	
	// Check if number is odd
	System.out.println(integer1.getValue() + " is odd? " + integer1.isOdd());
	System.out.println(integer2.getValue() + " is odd? " + integer2.isOdd());
	
	// Check if two numbers are equal to each other
	System.out.println(integer1.getValue() + " and " + integer2.getValue() +
								" is equal? " +integer1.equals(integer2));
	System.out.println(integer1.getValue() + " and " + integer3.getValue() +
			" is equal? " +integer1.equals(integer3));
	
	// Converts an array of numeric character to an integer
	System.out.println(MyInteger.parseInt(new char[] {'1', '2', '3'}));
	
	// Converts String into an integer
	System.out.println(MyInteger.parseInt("123"));
	}
}
