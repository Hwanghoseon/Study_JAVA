package variable;

import java.util.Scanner;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 1; i < num; i++) {
			for(int j = num - i; j > 0; j--)
				System.out.print(" ");
			for(int j = 0; j < i * 2 - 1; j++) 
				System.out.print("*");
			
			System.out.println();
		}
		for(int i = 0; i < num * 2 - 1; i++)
			System.out.print("*");;
			
		System.out.println();
		
		for(int i = 1; i < num; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = 0; j < (num - i) * 2 - 1; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
