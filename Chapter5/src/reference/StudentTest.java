package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "Lee");
		studentLee.setMathSubject("수학", 100);
		studentLee.setEngSubject("영어", 85);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setMathSubject("수학", 99);
		studentKim.setEngSubject("영어", 94);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
