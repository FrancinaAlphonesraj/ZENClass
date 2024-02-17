package stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class Stack {
	private LinkedList<Integer> stack;

    public Stack() {
        this.stack = new LinkedList<>();
    }

    // Pushes an element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println(element + " has been pushed onto the stack.");
    }

    // Pops an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = stack.pop();
        System.out.println(poppedElement + " has been popped from the stack.");
        return poppedElement;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nInteger Stack Menu:");
                System.out.println("1. Push an element onto the stack");
                System.out.println("2. Pop an element from the stack");
                System.out.println("3. Check if the stack is empty");
                System.out.println("4. Exit");

                System.out.print("Enter your choice (1-4): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer to push onto the stack: ");
                        int elementToPush = scanner.nextInt();
                        myStack.push(elementToPush);
                        break;
                    case 2:
                        try {
                            myStack.pop();
                        } catch (EmptyStackException e) {
                            System.out.println("Cannot pop from an empty stack.");
                        }
                        break;
                    case 3:
                        System.out.println("Is the stack empty? " + myStack.isEmpty());
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
