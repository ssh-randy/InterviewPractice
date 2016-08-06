package HiredQuestions;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class anagramDetector {
	public static void main(String[] args){
		String[] pair1 = {"abcd", "gtgh", "qwe"};
		String[] pair2 = {"dbca", "gthq", "qwee"};
		
		anagramSolver(pair1, pair2);
	}
	
	
	public static void anagramSolver(String[] firstPair, String[] secondPair){
		
		for(int i=0; i < firstPair.length; i++){
			
			Hashtable<Character, Integer> charCountTable = new Hashtable<Character, Integer>();
			
			for (Character ch: firstPair[i].toCharArray()) {
				int count = charCountTable.containsKey(ch) ? charCountTable.get(ch) : 0;
				charCountTable.put(ch, count+1);
			}
			
			for (Character ch: secondPair[i].toCharArray()) {
				int count = charCountTable.containsKey(ch) ? charCountTable.get(ch) : 0;
				charCountTable.put(ch, count-1);
			}
			
			boolean isAnagram = true;
			Set<Character> keys = charCountTable.keySet();
		    //Obtaining iterator over set entries
		    Iterator<Character> itr = keys.iterator();
			while(itr.hasNext()) {
				Character ch = itr.next();
				if(charCountTable.get(ch) != 0) isAnagram = false;
			}
			
			if(isAnagram == true) System.out.println(1);
			else System.out.println(0);
			
		}
		
	}
	
}
