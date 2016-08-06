
public class palindrome {
	
	public static void main(String[] args) {
		

		System.out.println("racecar");
		System.out.println(palindromeSolver("racecar"));
		

		System.out.println("bugatti");
		System.out.println(palindromeSolver("bugatti"));
		

		System.out.println("mom");
		System.out.println(palindromeSolver("mom"));

		System.out.println("aa");
		System.out.println(palindromeSolver("aa"));
		

		System.out.println("a");
		System.out.println(palindromeSolver("a"));

		System.out.println("at");
		System.out.println(palindromeSolver("at"));
	}
	
	
	public static boolean palindromeSolver(String word) {
		
		if (word.length() <= 1) return true;
		else if (word.charAt(0) == word.charAt(word.length() - 1)) return palindromeSolver(word.substring(1, word.length()-1));
		else return false;
	}

}
