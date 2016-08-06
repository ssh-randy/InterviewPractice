
public class rotateString {
	
	public static String rotateStringRight(String str, int amount){
		
		amount = amount % str.length();
		
		String newString = str.substring(str.length() - amount, str.length()) + str.substring(0, str.length() - amount);
		
		return newString;
	}
	
	public static void main(String[] args){
		
		String bla = "hello guys";
		
		System.out.println(rotateStringRight(bla, 3));
		
	}

}
