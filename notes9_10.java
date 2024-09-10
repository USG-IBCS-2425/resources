class notes9_10 {

	// Properties / attributes of the class can be defined
	// before any of the methods are defined

	String color = "orange";
	double length = 10.0;

	public static void main(String[] args) {
		int x = 4;
		int y = 10;
		// if statements
		// if (boolean expression) { everything
		// between the braces is the consequence }
		if (x > y) {
			System.out.println("Four is more than ten!");
		}
		// consequence if it is false is 'else'
		else {
			System.out.println("Four is not more than ten!");
		}

		// boolean expressions can use > , < , >= , <= , == , !=
		// ex: is x equal to y?

		if (x == y) {
			System.out.println("They are equivalent");
		}

		// else if is used to create an additional condition
		else if (x < y) {
			System.out.println("X is lower");
		}

		else {
			System.out.println("X is larger");
		}










	}


}