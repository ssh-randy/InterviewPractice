/* 
 * Given a string (for example: "a?bc?def?g"), write a program to generate all the possible strings by replacing ? with 0 and 1. 
	Example: 
	Input : a?b?c? 
	Output: a0b0c0, a0b0c1, a0b1c0, a0b1c1, a1b0c0, a1b0c1, a1b1c0, a1b1c1.


 */



public class replaceQuestionMarks {

	public static String[] replaceQuestionMark(String str){
		
		int index = 0;
		for (int i=0; i < str.length(); i++){
			if(str.charAt(i) == '?') index++;
		}
		
		String[] possibleStrings = new String[2^index];
		
		//use a bunch of binary string stuff here, make sure to account for cases like 001 (append 0s until length matches number of ?)
		//Integer.toBinaryString(int i);
		
		return possibleStrings;
	}
	
	
	
	
}
