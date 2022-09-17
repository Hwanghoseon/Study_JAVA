package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Kim = new Student("Kim", 5000);
		Student Lee = new Student("Lee", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subway2 = new Subway(2);
		Subway subway4 = new Subway(4);
		
		Kim.takeBus(bus100);
		Kim.takeSubway(subway4);
		Lee.takeSubway(subway2);
		
		Kim.showInfo();
		Lee.showInfo();
		
		bus100.showInfo();
		bus500.showInfo();
		
		subway2.showInfo();
		subway4.showInfo();
	}

}
