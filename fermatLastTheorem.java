package test;
import java.util.*;
public class fermatLastTheorem {
	/* this program outputs the sum of approximations used in fermat's last theorem. 
	for example, pi / 4 = 1 - 1/3 + 1/5 - 1/7 ... */
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	// prompt user 
	System.out.println("How many inputs");
	int a = reader.nextInt(); // read in user inputs 
	double b = 1; // this will be the denominator of 1/1, 1/3, 1/5 == 1/b, 1/b+2 .. etc
	int x = 1; // counter variable to loop 
	double ans = 0; // answer 
	while(x<=a) { // looping through from 1 to user in puts inclusively
		if(x % 2 == 1) { // check if counter is odd, if odd it's positive 
			ans += (1/(b));
		}
		else { // check if counter is even, if even its negative 
			ans -= (1/(b));
		}
		b = b+2; // b gets incremented by 2 in the denominator
	x++;
	}System.out.println(ans); // print out the answer
	

}}
