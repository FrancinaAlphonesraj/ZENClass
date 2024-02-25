package TaxCalculation;

import java.util.Scanner;

public class CalculateTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Employee ID: ");
		int empID = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter an Employee Name: ");
		String empName = scan.nextLine();
		System.out.println("Enter Salary: ");
		double empSalary = scan.nextDouble();
//		Creating Employee Object
		
		Employee emp = new Employee(empID, empName, empSalary);
		
//	Calculating and printing the employee salary
		
		double incomeTax = emp.calcTax();
		 System.out.println("Income Tax for " + empName + ": " + incomeTax);
		 
		 System.out.println("Enter an Product ID: ");
			int prodID = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter an Product Price: ");
			double prodPrice = scan.nextDouble();
			System.out.println("Enter Quantity: ");
			int prodQuantity = scan.nextInt();
			
			
			
			
//			Creating the Product object
			Product product = new Product(prodID, prodPrice, prodQuantity);
			
//			Calculating and printing the Product details
			
			double salesTax = product.calcTax();
			
			
			
			System.out.println("Sales Tax for Product ID " + prodID + ": " + salesTax);
			
			scan.close();
	}

}
