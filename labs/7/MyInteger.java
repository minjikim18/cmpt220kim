
public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return (value % 2) == 0;
	}
	
	public boolean isOdd() {
		return (value % 2) == 1;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) { // JA
		    if (value % i == 0) {
		        return false;
		    }
		}
		return true;
	}
	
	public static boolean isEven(int integer) {
		return (integer % 2) == 0;
		    }
	
	public static boolean isOdd(int integer) {
		return (integer % 2 == 1);
	}
	
	public static boolean isPrime(int integer) {
		for (int i = 2; i <= integer; i++) {
		    if (integer % i == 0) {
		        return false;
		    }
		}
		return true;
	}
	
	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}
	
	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}
	
	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}
	
	public boolean equals(int integer) {
		if (integer == value)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger integer) {
		if (integer.value == this.value) 
			return true;
		return false;
	}
	
	public static int parseInt(char[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += Character.getNumericValue(i);
		}
		return result;
	} 

	public static int parseInt(String b) {
		return Integer.parseInt(b);
	}
}

