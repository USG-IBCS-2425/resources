import java.util.*;

class Searching {

	public static int binarySearch(ArrayList<Integer> a, int x, int start, int stop) {
		
		// stop is not inclusive (it is the length of the list to start)

		// If the length of the arraylist is 0 (that we are searching)
		// return that we did not find it
		if (start == stop) {
			return -1;
		}

		// 1. If the middle is less than x
		// binary search on the top half of arraylist
		int mid = (start + stop)/2;
		if (a.get(mid) < x) {
			// recursive call
			return binarySearch(a, x, mid + 1, stop);
		}

		// 2. If the middle is greater than x
		// binary search on the bottom half of arrayList
		else if (a.get(mid) > x) {
			// recursive call
			return binarySearch(a, x, start, mid);
		}
		// 3. Middle == x
		// return that we found it!
		else {
			return mid;
		}
	}

	public static int linearSearch(ArrayList<Integer> a, int x) {
		for (int i = 0; i < a.size(); i++) {
			if (x == a.get(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			c.add(i+1);
		}
		int y = 369;
		
		// keep track of the time in nanoseconds
		long start = System.nanoTime();
		int d = binarySearch(c, y, 0, c.size());
		long end = System.nanoTime();
		long total = end - start;
		if (d > -1) {
			System.out.println("Found " + y + " at position " + d);
			System.out.println("Took " + total + " nanoseconds");
		}
		else {
			System.out.println("Did not find " + y);
		}



		// Create an arraylist of n integers
		// with random integers from 1 - n
		ArrayList<Integer> a = new ArrayList<Integer>();
		int n = 1000;
		for (int i = 0; i < n; i++) {
			int newNum = 1 + (int)(Math.random()*n);
			a.add(newNum);
		}
		//System.out.println(a);

		// search for x
		int x = 777;

		/*
		// keep track of the time in nanoseconds
		long start = System.nanoTime();
		int b = linearSearch(a, x);
		long end = System.nanoTime();
		long total = end - start;

		if (b >= 0) {
			System.out.println("Found " + x + "! at position " + b);
		}
		else {
			System.out.println("Did not find " + x + " :(");
		}
		System.out.println("Took " + total + " nanoseconds!");
		*/
	}
}