package others.mvc;

public class StudentController {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void printStudentDetails() {
		view.printStudentDetails(model);
	}

	public void setStudentName(String string) {
		model.setName(string);
		
	}
}