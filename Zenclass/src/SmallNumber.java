import java.util.Scanner;

public class SmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("Enter the 1st Value:");
int a = scan.nextInt();
System.out.println("Enter the 2nd Value:");
int b = scan.nextInt();
System.out.println("Enter the 3rd Value:");
int c = scan.nextInt();

if (a < b && a < c)
{
	System.out.println(a);
} else if(b < c && b < a) {
	System.out.println(b);

}else {
	System.out.println(c);
}

	}

}
