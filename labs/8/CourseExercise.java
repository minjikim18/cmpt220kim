
public class CourseExercise {

	public static void main(String[] args) {
		// Create new courses
		Course course1 = new Course("Software Development");
		Course course2 = new Course("Discrete Mathematcis");
		
		// Add students to each courses
		course1.addStudent("Min Ji Kim");
		course1.addStudent("Nam Hoang");
		course2.addStudent("Min Ji Kim");
		course2.addStudent("Amy Galloway");
		
		// Display number of students in each courses and names of students
		System.out.println("Number of students in Software Development: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.println(students[i] + ", ");
		
		System.out.println("Number of students in Discrete Mathematics: "
				+ course2.getNumberOfStudents());
	}

}
