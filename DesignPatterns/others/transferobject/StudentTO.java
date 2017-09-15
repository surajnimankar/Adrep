package others.transferobject;

import java.io.Serializable;

public class StudentTO implements Serializable{

	private static final long serialVersionUID = -6434408499577984513L;
	private String name;
	private int rollNo;

	StudentTO(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}