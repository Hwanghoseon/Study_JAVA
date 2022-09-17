package staticTest;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard("KIM");
		Card yourCard = company.createCard("LEE");
		
		System.out.println(myCard.getCardNum());
		System.out.println(yourCard.getCardNum());
	}

}
