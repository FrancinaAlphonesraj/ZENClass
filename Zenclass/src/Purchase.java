import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Purchase Amount:");
		int amount = scan.nextInt();
		int discount1 = amount +(amount*20/100);
		int discount = amount + (amount*10/100);
		if(amount >= 1000) {
			System.out.println("The Purchase amount is :" +discount1);

		}else if (amount > 500 && amount < 1000) {
			System.out.println("The Purchase amount is :" +discount);
		}else if (amount <= 500) {
			System.out.println("The Purchase amount is :" +amount);
		}
	}

}
