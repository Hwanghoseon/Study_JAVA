package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student("이순신");
		studentLee.address = "서울";
		
		Student studentKim = new Student(100, "김유신 ");
		
		studentLee.showStudnetInfo();
		studentKim.showStudnetInfo();
	}

}
