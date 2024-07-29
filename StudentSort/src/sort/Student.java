package sort;

public class Student extends Sort {

	int rollNo;
	String name = "";
	String address = "";

	Student(String name, int rollNo, String address) {

		this.rollNo = rollNo;
		this.name = name;
		this.address = address;

	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
