
public class LinearEquation {

	// Data fields
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	// A constructor with the arguments for a, b, c, d, e, and f
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	// Six getter methods for a, b, c, d, e, and f
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
	
	double getC() {
		return c;
	}
	
	double getD() {
		return d;
	}
	
	double getE() {
		return e;
	}
	
	double getF() {
		return f;
	}
	
	// Boolean to see if method is solvalbe or not
	boolean isSolvable() {
		return (a * d - b * c) != 0; 
	}
	
	// Method to return solution for x
	double getX() {
		return ((e * d - b * f) / (a * d - b * c));
	}
	
	// Method to return solutoin for y
	double getY() {
		return ((a * f - e * c) / (a * d - b * c));
	}
}
	
