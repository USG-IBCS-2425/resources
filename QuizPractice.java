

class QuizPractice {

	// Q1: Find the average value of an array
	// of doubles
	public static double avgDoub(double[] d) {
		double arraySum = 0;
		for (int i = 0; i < d.length; i++) {
			arraySum = arraySum + d[i];
		}
		double result = arraySum / d.length;
		return result;
	}

	// Q2: Find the longest word in an array
	// of strings
	public static String longestWord(String[] s) {
		int maxLength = 0;
		String answer = "";

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > maxLength) {
				maxLength = s[i].length();
				answer = s[i];
			}
		}
		return answer;
	}

	// Q3: Determine the most common character
	// in an array of strings
	public static int mostCommon(String[] s) {
		int[] commonValues = new int[26];
		for (int i = 0; i < s.length; i++) {
			// check the string
			for (int j = 0; j < s[i].length(); j++) {
				char c = s[i].charAt(j);
				if (c == 'a') {
					commonValues[0] = commonValues[0] + 1;
				}
				if (c == 'b') {
					commonValues[1] = commonValues[1] + 1;
				}
				if (c == 'c') {
					commonValues[2] = commonValues[2] + 1;
				}
				if (c == 'd') {
					commonValues[3] = commonValues[3] + 1;
				}
				if (c == 'e') {
					commonValues[4] = commonValues[4] + 1;
				}
			}
		}
		int most = 0;
		int mostCommonC = 0;
		for (int i = 0; i <commonValues.length; i++) {
			if (commonValues[i] > most) {
				most = commonValues[i];
				mostCommonC = i;
			}
		}
		System.out.println(most);
		return mostCommonC;
	}

	public static void main(String[] args) {
		double[] x = {2.5, 4.0, -3.1, 10.5, 9.9};
		double answer = avgDoub(x);
		System.out.println(answer);

		String[] names = {"Lisa", "Vera", "Amy", "Trinity"};
		String l = longestWord(names);
		System.out.println(l);

		int c = mostCommon(names);
		System.out.println(c);
	}
}




