package staticTest;

public class Card {
	private static int serialNum = 10000;
	
	private int cardNum;
	String customerName;
	
	public Card(String customerName) {
		this.customerName = customerName;
		
		serialNum++;
		
		cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
}
