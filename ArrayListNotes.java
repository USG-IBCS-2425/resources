import java.util.*;

class ArrayListNotes {
	public static void main(String[] args) {
		
		// while loop (indefinite loop)
		Scanner s = new Scanner(System.in);
		int count = 0;
		while (true) {

			System.out.println(count);
			System.out.println("continue?");
			String response = s.nextLine();
			if (response.contains("no")) {
				break;
			}
			count = count + 1;
		}

		// ArrayLists: Arrays with a mutable size
		// Create a string arraylist
		ArrayList<String> a = new ArrayList<String>();
		// add things to this list
		a.add("Abby");
		a.add("Lisa");
		System.out.println(a);
		a.add("Vera");
		System.out.println(a);
		// remove things from this list
		// 1. remove by the index (position)
		// if your arraylist is of integers
		// removing by object requires creating an object
		// first
		int x = 2;
		a.remove(2);
		System.out.println(a);
		a.add("maybe more green ties next year?");
		a.add("Vera");
		a.add("Trinity");
		a.add("more students");
		a.add("Amy");
		// 2. remove by the element itself
		a.add("maybe more green ties next year?");
		System.out.println(a);
		a.remove("maybe more green ties next year?");
		System.out.println(a);

		// to access an element by there position
		// we use the .get() method
		System.out.println(a.get(1));

		// arrays have .length
		// strings have .length()
		// arraylists have .size()

		a.add(0, "Mr. Considine");
		System.out.println(a);


	}
}



