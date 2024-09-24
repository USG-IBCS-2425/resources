import java.util.*;
class RanArray {
	public static void main(String[] args) {
		int[] a = new int[10];
		
		for (int i : a) {
			System.out.println(i);
		}
		for (int i = 0; i <10; i++) {
			// assign each element a random integer 0-100
			a[i] = (int)(Math.random()*101);
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}