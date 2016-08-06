
public class reverseString {

	
	public static String reverseString(String str){
		if (str.length() <= 1) return str;
		else return str.charAt(str.length()-1) + reverseString(str.substring(1, str.length()-1)) + str.charAt(0);
	}
	
	
	public static void main(String[] args){
		
		String bla = "hi my name is randy---";
		System.out.println(reverseString(bla));
	}
	
}
