package others.dao;

public class Client {

	public static void main(String[] args) {
		StudentDaoInterface studentDaoInterface = new StudentDaoInterfaceImpl();

		// print all students
		for (Student student : studentDaoInterface.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo()
					+ ", Name : " + student.getName() + " ]");
		}

		// update student
		Student student = studentDaoInterface.getAllStudents().get(0);
		student.setName("Michael");
		studentDaoInterface.updateStudent(student);

		// get the student
		studentDaoInterface.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo()
				+ ", Name : " + student.getName() + " ]");
	}
}