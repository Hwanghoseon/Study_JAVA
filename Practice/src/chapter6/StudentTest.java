package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("태백산맥1", "조광래");
		studentLee.addBook("태백산맥2", "조광래");
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addBook("토지1", "박완서");
		studentKim.addBook("토지2", "박완서");
		studentKim.addBook("토지3", "박완서");
		
		Student studentCho = new Student(1003, "Cho");
		
		studentCho.addBook("해리포터1", "조앤");
		studentCho.addBook("해리포터2", "조앤");
		studentCho.addBook("해리포터3", "조앤");
		studentCho.addBook("해리포터4", "조앤");
		studentCho.addBook("해리포터5", "조앤");
		studentCho.addBook("해리포터6", "조앤");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
		
	}

}
