import java.util.*;

class LoopArrayPractice {

	public static int roleDice(int x) {
		int choice = 0;

		int[] dice = new int[x];
		for (int i = 0; i < dice.length; i++) {
			dice[i] = i+1;
		}
		int randomPosition = (int)(Math.random()*dice.length);
		choice = dice[randomPosition];

		return choice;
	}

	public static int luckyDice(int x) {
		int option1 = roleDice(x);
		int option2 = roleDice(x);
		if (option1 > option2) {
			return option1;
		}
		return option2;
	}

	public static boolean evenOrOdd(int[] a) {
		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				//even
				even = even + 1;
			}
			else {
				//odd
				odd = odd + 1;
			}
		}
		if (even > odd) {
			return true;
		}
		if (odd > even) {
			return false;
		}
		System.out.println("Warning: Same number of even and odd!");
		return true;
	}

	public static void printArray(int[] a) {
		for (int x : a) {
			System.out.print(x);
			System.out.print(", ");
		}
	}

	public static void main(String[] args) {
		/*System.out.println("Regular 20-sided dice:");
		System.out.println(roleDice(20));
		System.out.println("Lucky 20-sided dice:");
		System.out.println(luckyDice(20));*/
		int[] a = new int[10];
		for (int i=0; i < a.length; i++) {
			//random integers from 1 --> length of the array
			a[i] = (int)(Math.random()*a.length)+1;
		}
		printArray(a);

		System.out.println(evenOrOdd(a));

	}
}


