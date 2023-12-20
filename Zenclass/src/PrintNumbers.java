import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scan.nextInt();
		System.out.println("The Print values are:");
		for(int i = a; i <= 50; i++) {
			
			System.out.println(i);
		}

	}

}
