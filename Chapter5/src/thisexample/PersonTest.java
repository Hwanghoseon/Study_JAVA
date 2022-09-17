package thisexample;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Lee = new Person();
		Lee.showInfo();
		
		Person Kim = Lee.getSelf();
		Kim.showInfo();
	}

}
