package shoppingmall;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.orderNum = 124584149;
		order.userID = "abc123";
		order.date = "2020년 2월 22일";
		order.name = "홍길동";
		order.productNum = "DFS23JF-41KD";
		order.address = "서울시 영등포구 여의동 20번지";
		
		order.showOrderInfo();
	}

}
