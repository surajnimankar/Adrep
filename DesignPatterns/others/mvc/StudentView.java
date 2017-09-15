package others.mvc;

public class StudentView {
	public void printStudentDetails(Student model) {
		System.out.println("Student: ");
		System.out.println("Name: " + model.getName());
		System.out.println("Roll No: " + model.getRollNo());
	}
}
