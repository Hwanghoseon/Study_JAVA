package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate day1 = new MyDate(2020, 2, 29);
		MyDate day2 = new MyDate(1000, 2, 29);
		MyDate day3 = new MyDate(2020, 2, 28);
		MyDate day4 = new MyDate(2020, 11, 31);
		
		System.out.println(day1.isValid());
		System.out.println(day2.isValid());
		System.out.println(day3.isValid());
		System.out.println(day4.isValid());
	}

}
