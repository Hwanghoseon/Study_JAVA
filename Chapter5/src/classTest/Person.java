package classTest;

public class Person {
	public int age;
	public String name;
	public Boolean isMarried;
	public int numberOfChildren;
	
	public void showPersonInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("결혼여부 : " + isMarried);
		System.out.println("자녀 수 : " + numberOfChildren);
	}
}
