import java.util.Scanner;

public class Statements {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = obj.nextInt();
		
		if(num > 0) {
		
		
			System.out.println("The given number is Positive Number");
			
		}else {
			System.out.println("The given number is Negative Number");
		}
		

	}

}
