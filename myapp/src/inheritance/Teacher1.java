package inheritance;

public class Teacher1 {
	private String designation = "teacher";
	private String collegeName = "Ascol";
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public void print() {
		System.out.println("use of getter and setter");
	}

}
