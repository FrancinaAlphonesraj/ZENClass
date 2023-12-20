import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = scan.nextInt();
		
		for(int i=0; i < n;i++) {
			int num = n;
			for(int j = i; j < n; j++) {
				if (j <= i) {
				System.out.println(num + " ");
				}else {
					System.out.println(j + " ");
				}
			}
			
		}
		
	}

}
	



