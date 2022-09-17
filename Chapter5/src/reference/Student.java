package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject math;
	Subject english;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		math = new Subject();
		english = new Subject();
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void setEngSubject(String name, int score) {
		english.subjectName = name;
		english.score = score;
	}
	
	public void showStudentScore() {
		int total = math.score + english.score;
		
		System.out.println(studentName + "학생의 수학 점수 : " + math.score);
		System.out.println(studentName + "학생의 영어 점수 : " + english.score);
		System.out.println(studentName + "학생의 총 점수 : " + total);
	}
}
