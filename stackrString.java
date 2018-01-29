package test;
import java.util.Stack;
import java.util.Scanner;
public class stackrString {
	Stack<Character> stcky= new Stack<>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string: " );
		String elements = reader.nextLine();
		stackrString reverseElements = new stackrString();
		reverseElements.Reverse(elements);
	
	}
	
public void Reverse(String str) {
	char[] reverseElements = new char[str.length()];
	for(int i = 0; i<str.length(); i++) { // push all the elements from string onto stack
		stcky.push(str.charAt(i));
		
	}
	
	for(int i= 0; i<str.length(); i++) {
		reverseElements[i] = stcky.peek();
		stcky.pop();

	}
	for (int i = 0; i < reverseElements.length; i++) {
		System.out.print(reverseElements[i]);
	}
}
}

