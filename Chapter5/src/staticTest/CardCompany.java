package staticTest;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	public Card createCard(String customerName) {
		Card card = new Card(customerName);
		
		return card;
	}
	
}
