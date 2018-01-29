package test;

public class Binarysearch {
//how to program binary search... 
	public static void main (String[] args) {
		int [] arrayNumbers = {2,5,7,8,10,16,21,24,25,27};
	
		System.out.println(binarySearch(arrayNumbers, 2));
	}
	
	public static boolean binarySearch(int[] n, int target) {
		//what's the efficiency? O(log n)?
		int hi = n.length-1;
		int lo = 0;
		 // static array storing elements at various positions from indices 0 - k
		while(lo <= hi) {
			int middle = (hi + lo)/2;
			if( n[middle] == target) {
				return true;
				// target is found
			}
			else if( n[middle] < target) {
				lo = middle+1;
				hi = n.length-1;
				
			}
			
			else if ( n[middle] > target) {
				lo = 0;
				hi = middle-1;
			}
		
		}
		return false;
	}
	
}
