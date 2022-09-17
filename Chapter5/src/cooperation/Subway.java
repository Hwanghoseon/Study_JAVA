package cooperation;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(subwayNumber + " 지하철의 승객은 " + passengerCount + " 명이고, 수입은 " + money + " 원 입니다.");
	}
}
