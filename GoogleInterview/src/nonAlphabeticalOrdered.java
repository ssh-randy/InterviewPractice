
/*given a string write a function to return the index of the first elememt which is non-alphabat ordered 
 * 
 */

public class nonAlphabeticalOrdered {
	
	public static int nonAlphabet(String str){
		
		int index = 1;
		while(index < str.length() && str.charAt(index) >= str.charAt(index-1)) {
			index ++;
		}
		if (index == str.length()) return -1;
		
		return index;
		
	}
	

}
