import java.util.Scanner;

public class PrintNumbersUsingWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input number:");
		int a = scan.nextInt();
		System.out.println("The Values are:");
		while(a <= 50) {
			
			System.out.println(a);
			a = a+1;
		}

	}

}
