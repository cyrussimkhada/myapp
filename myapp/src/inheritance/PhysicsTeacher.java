package inheritance;

public class PhysicsTeacher extends Teacher{
	
	String mainSubject = "Physics Teacher";

	public static void main(String[] args) {
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.print();
		
	}

}
