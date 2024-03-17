package map;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your birthday (yyyy-mm-dd): ");
	        String birthdayInput = scanner.nextLine();

	        LocalDate birthday = LocalDate.parse(birthdayInput);

	        LocalDate currentDate = LocalDate.now();

	        Period period = Period.between(birthday, currentDate);

	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");

	        scanner.close();
	}

}
