package coffee;

public class BeanCoffee {
	String coffeeName;
	int cost;
	
	public BeanCoffee(String coffeeName, int cost) {
		this.coffeeName = coffeeName;
		this.cost = cost;
	}
	
	public String takeOrder(String coffeeName, int cost) {
		this.cost += cost;
		String answer = "";
		
		if(coffeeName == "BEANAMERICANO" && cost == Menu.BEANAMERICANO) {
			answer += Menu.BEANAMERICANO;
			
			answer += " 원 콩다방 아메리카노를 구입하셨습니다.";
			
			return answer;
		}
		else if(coffeeName == "BEANLATTE" && cost == Menu.BEANLATTE) {
			answer += Menu.BEANLATTE;
			
			answer += " 원 콩다방 라떼를 구입하셨습니다.";
			
			return answer;
		}
		else
			return null;
	}
}
