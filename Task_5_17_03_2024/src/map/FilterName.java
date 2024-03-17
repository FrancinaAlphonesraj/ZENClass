package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterName {

	public static void main(String[] args) {
		List<String> studentNames = new ArrayList<>();

        // Using Scanner to get input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of 10 students:");

        // Getting names of 10 students from user input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        // Using lambda expression and stream API to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("a"))
                .collect(Collectors.toList());


        // Printing the names of students whose names start with "A"
        System.out.println("\nStudents whose names start with 'A':");
        for (String student : studentsWithA) {
            System.out.println(student);
	}
	}

}
