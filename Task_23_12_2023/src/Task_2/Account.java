package Task_2;

import java.util.Scanner;

public class Account {
	
	private double balance;
	
	public Account() {
		this.balance = 0.0;
	}

	public Account(double initialBalance) {
		this.balance = initialBalance;
	}
	 
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Amount deposited sucessfully");
			
		}else {
			System.out.println("Enter the valid amount to deposit");
		}
	}
	public void withdraw(double amount) {
		
		if(amount>0 && amount <= this.balance) {
			this.balance -= this.balance;
			System.out.println("The Amount withdrawn sucessfully");
			
			}else {
				System.out.println("Insufficient fund or Invalid amount to withdraw");
			}
		
	}
	
	public void displaytheBalance() {
		System.out.println("The current balance is: " +this.balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial balance(if any): ");
		
		double initialBalance = scan.nextDouble();
		
		Account account;
		
		if(initialBalance>0) {
			account = new Account(initialBalance);
		}else {
			account = new Account();
		}
		
		int choice;
		
		do {
			System.out.println("\n1.Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.println("Enter Your Chioce: ");
			
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter amount to deposit:");
				double depositAmount = scan.nextDouble();	
				break;
			case 2:
				System.out.println("Enter amount to withdraw:");
				double withdrawAmount = scan.nextDouble();
				break;
			case 3:
				account.displaytheBalance();
				break;
			case 4:
				System.out.println("Existing..");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
				}
		} while(choice != 4);
		
		scan.close();
 
	}

}
