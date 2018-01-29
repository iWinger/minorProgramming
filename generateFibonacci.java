package test;

public class generateFibonacci {
//instance variables, fields, global and local

	public static void main(String[] args) {
		printFib(17);
		System.out.println("----------------------------------");
		System.out.println(recurprintFib(17));
	}
	
	public static void printFib(int max) {
		// cannot make a static reference to a non-static field
		int pfib = 1;
		int fib1 = 0;
		int fib2 = 1;
		for ( int i = 0; i < max; i= pfib) {
			System.out.println(pfib + "");
			pfib = fib1+fib2;
			fib1 = fib2;
			fib2= pfib;
		}
	}
	
	public static int recurprintFib(int max) {
		//each method does its own job, stack, recur(17) --> recur(1) base case, then pops off  
		if(max<=1) {
			return max;
		}
		return recurprintFib(max-1) + recurprintFib(max-2);
		

		
		
	}
}
