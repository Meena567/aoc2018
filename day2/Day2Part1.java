import java.util.*;

class Day2Part1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int twice = 0;
		int thrice = 0;
		int eachTwice;
		int eachThrice;
		String str;
		HashSet<Character> setOfLetters = new HashSet<> ();
		HashSet<Character> twiceRepeated = new HashSet<> ();
		HashSet<Character> thriceRepeated = new HashSet<> ();

		while(sc.hasNextLine()) {
			eachTwice = 0;
			eachThrice = 0;
			setOfLetters.clear();
			twiceRepeated.clear();
			thriceRepeated.clear();
			str = sc.nextLine();
			StringTokenizer strToken = new StringTokenizer(str);

			for(int i = 0; i < str.length(); i++) {
				char character = str.charAt(i);

				if(thriceRepeated.contains(character)) {
					eachThrice -= 1;
				} else if(twiceRepeated.contains(character)) {
					eachTwice -= 1;
					eachThrice += 1;
					thriceRepeated.add(character);
				} else if(setOfLetters.contains(character)) {
					eachTwice += 1;
					twiceRepeated.add(character);
				} else {
					setOfLetters.add(character);
				}
			}

			if(eachTwice > 0) {
				twice += 1;
			}
			if(eachThrice > 0) {
				thrice += 1;
			}
		}

		System.out.println(twice * thrice);
	}
}