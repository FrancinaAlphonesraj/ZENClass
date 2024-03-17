package Voter;

import javax.activity.InvalidActivityException;

public class Voter {
int voteID;
String name;
int age;
public Voter(int voteID, String name, int age) throws InvalidAgeForVote {
	
	this.voteID = voteID;
	this.name = name;
	this.age = age;
	if(age < 18) {
		throw new InvalidAgeForVote("Invalid Age for Voter");
	}
}



}
