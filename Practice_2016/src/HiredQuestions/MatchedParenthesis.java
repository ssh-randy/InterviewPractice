package HiredQuestions;
import java.util.Stack;


public class MatchedParenthesis {

	public static void main(String[] args){
		String bla = "[([{awf{}wad}]s)]";
		
		System.out.println("String " + bla + " is matched: " + matchedParenthesis(bla));
		bla = "[([awf{wad]s)]";
		

		System.out.println("String " + bla + " is matched: " + matchedParenthesis(bla));

		bla = "[az([awfwad}]s)]";
		System.out.println("String " + bla + " is matched: " + matchedParenthesis(bla));
	}
	
	
	public static boolean matchedParenthesis(String string) {
		
		String[] openParens = {"{", "(", "["};
		String[] closedParens = {"}", ")", "]"};
		Stack<String> latestParen = new Stack<String>();
		
		
		for(int i=0; i < string.length(); i++){
			
			for (String parenType: openParens) {
				if(string.substring(i, i+1).equals(parenType)) {
					latestParen.push(string.substring(i,i+1));
				}
			}
			
			for (String parenType: closedParens) {
				if(string.substring(i, i+1).equals(parenType) && latestParen.size() == 0) {
					return false;
				}
			}
			
			
			if(string.substring(i, i+1).equals("}") && !latestParen.pop().equals("{")) {
				return false;
			}
			if(string.substring(i, i+1).equals(")") && !latestParen.pop().equals("(")) {
				return false;
			}
			if(string.substring(i, i+1).equals("]") && !latestParen.pop().equals("[")) {
				return false;
			}
		}
		
		if(latestParen.size() > 0) return false;
		
		return true;
	}
	
	
}
