package staticex;

public class StudentIdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student("Lee");
		Student studentKim = new Student("Kim");
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		
		System.out.println(Student.getSerialNum());
		
	}

}
