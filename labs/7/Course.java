
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		int a = findStudent(student);
		if (a >= 0) {
			dropStudent(a);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}

	private void dropStudent(int a) {
		String[] student = new String[students.length];
		for (int i = 0, j = 0; i < student.length - 1; i++, j++) { //JA
			if (i == a) {
				j++;
			}
			student[i] = students[j];
		}
		this.students = student;
		numberOfStudents--;
		
	}

	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
}
