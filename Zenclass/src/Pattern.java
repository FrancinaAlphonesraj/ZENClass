import java.util.Scanner;

//public class Pattern {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner scan =  new Scanner(System.in);
//		System.out.println("Enter the number of rows:");
//		int n = scan.nextInt();
//		
//		for(int i=0; i < n;i++) {
//			
//			for(int j = 0; j < n; j++) {
//				if (j < n-i) {
//				System.out.println(n + " ");
//				}else {
//					System.out.println(n-j + " ");
//				}
//			}
//			System.out.println();
//		}
//		
//	}
//
//}


public class Pattern {
    public static void main(String[] args) {
        int n = 1; // Set the size of the pattern
        int i = 0;

        // Loop to iterate through rows
        while (i < n) {
            int j = 0;

            // Loop to iterate through columns
            while (j < n) {
                if (j < n ) {
                    System.out.print(n - j  + " ");
                } else {
                    System.out.print(j + " ");
                }
                j++;
            }

            // Move to the next line after each row
            System.out.println();
            i++;
        }
    }
}