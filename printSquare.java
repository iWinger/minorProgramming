
package test;
import java.util.*;

public class printSquare {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Please enter a minimum and a maximum");
	int minimum = reader.nextInt();
	int maximum = reader.nextInt();
	printSquare(minimum,maximum);
}

// as easy as flipping my hand 
// running speed of O(2n^2+c) =O(n^2) structure of the for loop = for ( for + for )
public static void printSquare(int min, int max) { 
	for(int i = min; i <= max; i++) {
		for (int j = i; j <= max; j++) {
			System.out.print(j);	
			}	
		if ( i > min) { // if the difference between the counting variable and minimum , print out these set of numbers.
			for (int j = min; j < i; j++) {
			System.out.print(j);
		}
		}
		System.out.println();
	}
}
}
