package test;
import java.util.*;
public class letterGradeConverter {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	int x = 0;
	while (x == 0) {
		System.out.println("Please enter an integer to convert to letter grade, else type in -1 to halt");
		int integer = reader.nextInt();
		System.out.println(letterGradeEquivalent(integer));
		if(integer == -1) {
			return;
		}
	}
}

public static String letterGradeEquivalent(int input) {
	String output = "";
	
	if(input >= 97 && input <= 100) {
		output = "A+";
	}
	else if(input >= 94) {
		output = "A";
	}
	else if(input >= 90) {
		output = "A-";
	}
	else if(input >= 87) {
		output = "B+";
	}
	else if(input >= 84) {
		output = "B";
	}
	else if (input >= 80) {
		output = "B-";
	}
	else if (input >= 77) {
		output = "C+";
	}
	else if (input >= 74) {
		output = "C";
	}
	else if (input >= 70) {
		output = "C-";
	}
	else if(input>= 67) {
		output = "D+";
	}
	else if(input >= 65) {
		output ="D";
	}
	else if (input >= 0 && input <= 64) {
		output = "E";
	}
	else {
		output = "Not Valid";
	}
	

	return output;
}
}

