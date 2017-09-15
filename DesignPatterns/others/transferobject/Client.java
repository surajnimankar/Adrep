package others.transferobject;

public class Client {

	public static void main(String[] args) {
		StudentBO studentBO = new StudentBO();

		// print all students
		for (StudentTO student : studentBO.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo()
					+ ", Name : " + student.getName() + " ]");
		}

		// update student
		StudentTO student = studentBO.getAllStudents().get(0);
		student.setName("Michael");
		studentBO.updateStudent(student);

		// get the student
		student = studentBO.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo()
				+ ", Name : " + student.getName() + " ]");
	}
}