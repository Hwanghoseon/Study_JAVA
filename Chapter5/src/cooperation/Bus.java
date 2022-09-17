package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " 버스의 승객은 " + passengerCount + " 명이고, 수입은 " + money + " 원 입니다.");
	}
}
