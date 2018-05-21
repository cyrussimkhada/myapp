package inheritance;

public class PhysicsTeacher1 extends Teacher1{
	String mainSubject = "physics";

	public static void main(String[] args) {
		PhysicsTeacher1 obj1 = new PhysicsTeacher1();
		System.out.println(obj1.getCollegeName());
		System.out.println(obj1.getDesignation());
		System.out.println(obj1.mainSubject);
		obj1.print();
		
	}

}
