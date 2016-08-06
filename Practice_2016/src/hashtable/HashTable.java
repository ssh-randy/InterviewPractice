package hashtable;

public class HashTable<K,V> {
	
	private HashNode<K,V>[] nodes;
	private int size;
    private int numItems;
	private float lambda;
	
	public HashTable(int size, float lambda){
		nodes = new HashNode[size];
		this.lambda = lambda;
		this.numItems = 0;
	}
	
	public int getIndex(K key){
		if(key == null) return 0;
		int hash = key.hashCode() % nodes.length;
		if(hash < 0){
			hash += nodes.length;
		}
		return hash;
	}
	
	public void resize() {
		HashTable<K,V> newTable = new HashTable<K,V>(size*2, lambda);
		size = size*2;
		
		for (HashNode<K,V> node : nodes) {
			newTable.insert(node.key, node.value);
		}
		
		nodes = newTable.nodes;
		
	}
	
	
	public void insert(K key, V value) {
		int index = getIndex(key);
		if(nodes[index] == null) {
			nodes[index] = new HashNode<K,V>(key, value);
			numItems++;
		}
		else{
			while(nodes[index].hash != key.hashCode() && !nodes[index].key.equals(key)) {
				index++;
				index %= size;	
				if(nodes[index] == null) break;
			}
			if(nodes[index] == null) {
				nodes[index] = new HashNode<K,V>(key, value);
				numItems++;
			}
			else nodes[index].value = value;
		}
		
		if(numItems/size > lambda) {
			resize();
		}
	}
	
	
	public void delete(K key) {
		int index = getIndex(key);
		if(nodes[index] == null) return;
		else {
			while(nodes[index].hash != key.hashCode() && !nodes[index].key.equals(key)) {
				index++;
				index %= size;
				if(nodes[index] == null) return;
			}
			nodes[index] = null;
			numItems--;
			
		}
	}
	
	public V get(K key){
		int index = getIndex(key);
		if(nodes[index] != null) return nodes[index].value;
		else return null;
	}
	
	
	


}

class HashNode<K,V> {
	K key;
	V value;
	int hash;
	
	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
		hash = key.hashCode();
	}
}