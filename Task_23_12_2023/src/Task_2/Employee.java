package Task_2;

import java.util.Scanner;

public class Employee extends Person {
	
	int employeeID;
	double salary;
	
	public Employee() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		this.employeeID = scan.nextInt();
		System.out.println("Enter the Salary: ");
		this.salary = scan.nextDouble();
		System.out.println("Enter the Name: ");
		this.name = scan.next();
	}
	
	public void displayDetails() {
		System.out.println("\n Employee Details:");
		System.out.println("Name: " + this.name);
		System.out.println("Age:" +this.age);
		System.out.println("Employee ID: " +this.employeeID);
		System.out.println("Salary: " +this.salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.displayDetails();

	}

}
