
public class Location {

	// Data fields
	double row;
	double column;
	double maxValue; 
	
	// Default constructor
	Location() {
		row = 0;
		column = 0;
		maxValue = 0;
	}
	
	// Constructor with arguments row, column, and maxValue
	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	// Method that locates the largest element
	public static Location locateLargest(double[][] a) {
		double max = a[0][0];
		int row = 0;
		int column = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++)
				if(a[i][j] > max)
				{
					max = a[i][j];
					row = i;
					column = j;
				}
		}
		return(new Location());
	}
}
