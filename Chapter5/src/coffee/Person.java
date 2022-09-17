package coffee;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.takeOrder("BEANAMERICANO", 4100);
		if(message != null) {
			this.money -= money;
			System.out.println(name + " 님이 " + money + "으로 " + message);
		}
		message = bCoffee.takeOrder("BEANLATTE", 4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + " 님이 " + money + "으로 " + message);
		}
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, String coffeeName) {
		if(money >= Menu.STARAMERICANO) {
			String message = sCoffee.takeOrder(coffeeName);
			if(message != null) {
				this.money -= Menu.STARAMERICANO;
				
				System.out.println(name + " 님이 " + money + "으로 " + message);
			}
		}
		String message = sCoffee.takeOrder(coffeeName);
		if(message != null) {
			this.money -= Menu.STARLATTE;
			
			System.out.println(name + " 님이 " + money + "으로 " + message);
		}
	}
}
