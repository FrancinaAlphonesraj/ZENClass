package Exception;

import java.util.Scanner;

public class Student {
	
	int rollno;
	String name;
	int age;
	String course;
	
	public Student(int rollno, String name, int age, String course)  throws AgeNotWithinRangeException, NameNotValidException {
		
		this.rollno = rollno;
		
		if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name should only contain alphabets");
        }
		this.name = name;
		
		if(age<15 || age>21) {
			throw new AgeNotWithinRangeException("Age should not between 15 and 21");
		}
		this.age = age;
		this.course = course;
	}
	
	
	
	 

}
