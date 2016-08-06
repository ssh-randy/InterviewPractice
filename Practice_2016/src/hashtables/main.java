package hashtables;

public class main {
	
	public static void main(String[] args) {
		
		HashTable<String, Integer> hashTable = new HashTable<String, Integer>(0.8);
		
		hashTable.insert("hey", 5);
		hashTable.insert("qwe", 3);
		hashTable.insert("qeyth", 1);
		
		System.out.println(hashTable.get("hey"));
		System.out.println(hashTable.get("qwe"));
		System.out.println(hashTable.get("qeyth"));
		
	}
	

}
