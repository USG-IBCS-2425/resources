class CasinoNight {

	public static void main(String[] args) {
		// instance of Prizes
		Prizes p = new Prizes();

		System.out.println("Vera and Lisa have 40k chips" +
		 " to spend. They want to buy the first prize. " + 
		 "They won! They received: ");
		// return string to a new variable 'p' first
		// then print it.
		String firstPrize = p.getNextPrize();
		System.out.println(firstPrize);
		System.out.println("Trinity's friends want to get her a prize" +
			" They buy the second prize, which is: ");
		// print the return value immediately
		System.out.println(p.getNextPrize());
	}

}