import java.util.Scanner;

public class PointsNearest {

	public static void main(String[] args) {
		
		// Create array with the points given
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
				  {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
				  {5.5, 4, -0.5}};
		
		// Create variables for each point
		int point1 = 0;
		int point2 = 0;
		int point3 = 0;
		
		// To find the shortest distance (distance forumla)
		double shortest = distance(points[point1][0], points[point1][1],
				points[point1][2], points[point2][0], points[point2][point1],
				points[point3][point2]);
		
		// Loop that finds the distance between every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double dist = distance(points[i][0], points[i][1], points[i][2],
					points[j][0], points[j][1], points[j][2]); 

				// Finds the shortest distance
				if (shortest > dist) {
					point1 = i; 
					point2 = j; 
					shortest = dist; 
				}
			}
		}
		
		// Prints the closest two points
		System.out.println("The closest two points are " +
				"(" + points[point1][0] + ", " + points[point1][1] + ")and (" +
					points[point2][0] + ", " + points[point2][1] + ")");
	}

	// Distance formula
	private static double distance(double a, double b, double c, 
										double d, double e, double f) {
		return (Math.sqrt(Math.pow(d - a, 2) + Math.pow(e - b, 2)
								+ Math.pow(e - b, 2)));
	}

}
