import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scan.nextInt();
		int reverse = 0;
		
		while(a != 0)
		{
			 int reminder = a % 10;
			 reverse = reverse * 10 + reminder;
	         a=a/10;
		}
		
		System.out.println("The reverse number is:" +reverse);
		
	
	}

}
