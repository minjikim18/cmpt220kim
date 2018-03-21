
public class CourseExercise {

	public static void main(String[] args) {
		// Create course
		Course softwareDev1 = new Course("Software Development 1");

		// Add students
		softwareDev1.addStudent("Min Ji Kim");
		softwareDev1.addStudent("Nam Hoang");
		softwareDev1.addStudent("Titan Newman");
		
		// Drop a student
		softwareDev1.dropStudent("Nam Hoang");

		// Display students in course
		System.out.println("The students in the course " + 
				softwareDev1.getCourseName() + ":");
		String[] students = softwareDev1.getStudents();
		for (int i = 0; i < softwareDev1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
}
