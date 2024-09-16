class Prizes {

	// instance variables
	String prize1;
	String prize2;
	String prize3;
	String prize4;
	int numPrizes;

	public String getNextPrize() {
		String p = "";
		if (numPrizes == 4) {
			p = prize1;
		}
		else if (numPrizes == 3) {
			p = prize2;
		}
		else if (numPrizes == 2) {
			p = prize3;
		}
		else if (numPrizes == 1) {
			p = prize4;
		}
		else {
			p = "no more prizes :(";
		}
		numPrizes = numPrizes - 1;
		return p;
	}

	public void changePrize(String p, int n){
		if (n == 1) {
			prize1 = p;
		}
		if (n == 2) {
			prize2 = p;
		}
		if (n == 3) {
			prize3 = p;
		}
		if (n == 4) {
			prize4 = p;
		}
	}
	// constructor method allows us to create an instance
	public Prizes() {
		prize1 = "25$ Starbucks Gift Card";
		prize2 = "Civies Pass";
		prize3 = "Mr. Orr trip to Seattle";
		prize4 = "Ms. Corrigan bakes cupcakes";
		numPrizes = 4;
	}


}