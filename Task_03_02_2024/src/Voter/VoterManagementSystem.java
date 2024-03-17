package Voter;

import java.util.Scanner;

public class VoterManagementSystem {

	public static void main(String[] args) throws InvalidAgeForVote {
		Scanner scan =new Scanner(System.in);
		try {
		
		
		System.out.println("Enter Your Vote ID: ");
		int voteID = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Your Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Your Age: ");
		int age = scan.nextInt();
		
		
		Voter vote = new Voter(voteID, name, age);
		
		System.out.println("VoterID " + vote.voteID);
		System.out.println("Name: " + vote.name);
		System.out.println("Age: " +vote.age);
		}catch(InvalidAgeForVote e) {
			System.out.println("Error Message: " +e.getMessage());
		}catch(Exception e) {
			System.out.println("Error Message: Invalid Input");
		}
		
		finally {
			scan.close();
		}

	}

}
