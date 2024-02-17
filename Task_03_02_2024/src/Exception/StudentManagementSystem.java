package Exception;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter the Roll No: ");
			int rollno = scan.nextInt();
			System.out.println("Enter the Name:");
			scan.nextLine(); 
			String name = scan.nextLine();
			System.out.println("Enter the Age: ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Course: ");
			String course = scan.nextLine();
			
			Student student = new Student(rollno, name, age, course);
			
			System.out.println("\n Student Information ");
			System.out.println("RollNo: " + student.rollno );
			System.out.println("Name: " + student.name);
			System.out.println("Age: " + student.age);
			System.out.println("Course: " + student.course);
		}catch(AgeNotWithinRangeException e){
			System.out.println("Error Message: " +e.getMessage());
		}catch (NameNotValidException e) {
			System.out.println("Error Message: "  + e.getMessage());
		}catch (Exception e) {
			System.out.println("Error: Invalid Input");
		}
		finally {
			scan.close();
		}
		
	}

}
