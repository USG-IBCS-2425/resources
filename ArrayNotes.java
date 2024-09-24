// Arrays are non-primitive data types that need to be
// imported from the java utility library
import java.util.*;

class ArrayNotes {
	public static void main(String[] args) {
		// create an array
		// 1. initialize with values
		// every array has a fixed length
		// array elements have order (positions = index)
		// positions start at 0 --> 
		int[] a = {5, 4, 3, 2, 1};

		// access arrays by their index (position)
		// print element at position 0
		System.out.println(a[0]);
		System.out.println(a[2]);
		// out of bounds!
		//System.out.println(a[5]);

		// change the values of the elements
		a[0] = 20;
		a[4] = -400;
		// for loop can access all elements in iteration
		for (int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		// for each loop
		for (int x : a) {
			System.out.println(x);
		}

		// create an array with no values initialized
		// initializing a string array with 8 elements
		String[] b = new String[8];
		b[0] = "Abby";
		b[1] = "Christian";
		b[2] = "Doris";
		b[3] = "Audri";
		b[4] = "Phoebe";
		for (String s : b) {
			System.out.println(s);
		}
		System.out.println(b.length);
	}
}











