package coffee;

public class StarCoffee {
	String coffeeName;
	int cost;
	
	public String takeOrder(String coffeeName) {
		String answer = "";
		
		if(coffeeName == "STARAMERICANO") {
			cost += Menu.STARAMERICANO;
			
			answer += Menu.STARAMERICANO;
			
			answer += " 원 별다방 아메리카노를 구입하셨습니다.";
			
			return answer;
		}
		else if(coffeeName == "STARLATTE") {
			cost += Menu.STARLATTE;
			
			answer += Menu.STARLATTE;
			
			answer += " 원 별다방 라떼를 구입하셨습니다.";
			
			return answer;
		}
		else
			return null;
	}
}
