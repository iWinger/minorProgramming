package test;
import java.util.*;
public class readInIntegers {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter 50 integers ");
	int n = reader.nextInt();
	System.out.println("x");
	int z = 0;
	int y = 99999;
	for (int i =0; i<5; i++) {
		int x = reader.nextInt();
		if(y > x) {
			y = x;
			z = y;
		}
	}

System.out.println(z);
}
}