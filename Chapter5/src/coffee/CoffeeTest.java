package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Lee = new Person("Lee", 20000);
		Person Kim = new Person("Kim", 30000);
		
		StarCoffee sCoffee = new StarCoffee();
		
		Lee.buyStarCoffee(sCoffee, "STARAMERICANO");
		//Lee.buyStarCoffee(sCoffee, "STARLATTE");
	}

}
