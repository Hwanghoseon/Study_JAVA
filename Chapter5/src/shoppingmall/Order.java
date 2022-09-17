package shoppingmall;

public class Order {
	public int orderNum;
	public String userID;
	public String date;
	public String name;
	public String productNum;
	public String address;
	
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + userID);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + productNum);
		System.out.println("배송 주소 : " + address);
	}
}
