package IndexBound;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) throws ArrayIndexOutOfBoundException {
		String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter the day index (0-6): ");
		
		int dayIndex = scan.nextInt();
		
		if(dayIndex < 0 || dayIndex >6) {
			throw new ArrayIndexOutOfBoundException("Invalid day index. Please enter a value between 0 and 6.");
		}
		
		System.out.println("Day: " + weekdays[dayIndex]);
		}catch(ArrayIndexOutOfBoundException e) {
			System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("An unexpected error occured: " + e.getMessage());
		}
		
		finally {
			scan.close();
		}

	}

}
