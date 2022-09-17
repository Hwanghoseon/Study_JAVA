package classpart;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		System.out.println(total);
	}

}
