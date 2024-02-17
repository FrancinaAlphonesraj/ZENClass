package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

	static Map<String, Integer> studentgrades = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 try {
		while(true) {
		System.out.println("Student Grade System Menu: ");
		System.out.println("1. Add a new Student");
		System.out.println("2. Remove a Student");
		System.out.println("3. Display a student's grade");
		System.out.println("4. Exit");
		
		System.out.println("4. Enter your choice: 1-4: ");
		int choice = scan.nextInt();
		
		switch(choice){
		
		case 1:
            addNewStudent(scan);
            break;
        case 2:
            removeStudent(scan);
            break;
        case 3:
            displayStudentGrade(scan);
            break;
        case 4:
            System.out.println("Exiting the program.");
            return;
        default:
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			
		}
		}
	}catch(Exception e) {
		
        System.out.println("An unexpected error occurred: " + e.getMessage());

	}
		 finally {
		scan.close();
	}

	}

	

	
	private static void addNewStudent(Scanner scan) {
		System.out.print("Enter student name: ");
        String name = scan.next();

        System.out.print("Enter student grade: ");
        int grade = scan.nextInt();

        studentgrades.put(name, grade);
        System.out.println("Student added successfully.");
		
	}
	
	private static void removeStudent(Scanner scan) {
		 System.out.print("Enter student name to remove: ");
	        String nameToRemove = scan.next();

	        if (studentgrades.containsKey(nameToRemove)) {
	            studentgrades.remove(nameToRemove);
	            System.out.println("Student removed successfully.");
	        } else {
	            System.out.println("Student not found.");
	        }
	}
	
	private static void displayStudentGrade(Scanner scan) {
		 System.out.print("Enter student name to display grade: ");
	        String nameToDisplay = scan.next();

	        if (studentgrades.containsKey(nameToDisplay)) {
	            int grade = studentgrades.get(nameToDisplay);
	            System.out.println("Grade for " + nameToDisplay + ": " + grade);
	        } else {
	            System.out.println("Student not found.");
	        }
	    }
	
}



