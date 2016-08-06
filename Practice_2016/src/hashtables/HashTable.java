package hashtables;

import java.lang.reflect.Array;

public class HashTable<K,V> {

	private int size;
	private int load;
	private double loadFactor;
	
	
	private HashEntry<K,V>[] tableValues;
	
	public HashTable(double loadFactor) {
		this.size = 1;
		tableValues = new HashEntry[size];
		this.loadFactor = loadFactor;
		load = 0;
	}
	
	public HashTable(int size, double loadFactor) {
		this.size = size;
		tableValues = new HashEntry[size];
		this.loadFactor = loadFactor;
		load = 0;
	}
	
	public void resize() {
		HashTable newTable = new HashTable(size*2, loadFactor);
		
		for(HashEntry entry : tableValues) {
			newTable.insert(entry.key, entry.value);
		}
		
		size = newTable.size;
		load = newTable.load;
		tableValues = newTable.tableValues;
		
	}
	
	public void insert(K key, V value) {
		
		//get the index of the key
		int index = key.hashCode() % size;
		//if loadFactor > 1, we need to see if we've looped around
		int originalIndex = index;
		boolean looped = false;
		
		//if tableValues at the index is null, has the same key, or if we've looped over fully
		while(tableValues[index] != null && !tableValues[index].key.equals(key) && !looped) {
			index = (index + 1) % size;
			if (originalIndex == index) looped = true;
		}
		
		if(tableValues[index] == null) {
			HashEntry<K,V> entry = new HashEntry<K,V>(key, value);
			tableValues[index] = entry;
			load++;
		} else if(tableValues[index].key.equals(key)) {
			tableValues[index].value = value;
		}
		
		if (looped == true) resize();
		else if (((double) load)/size > loadFactor) resize();
		
	}
	
	
	public V get(K key) {
		
		int index = key.hashCode() % size;
		int originalIndex = index;
		boolean looped = false;
		while(tableValues[index] != null && !tableValues[index].key.equals(key) && !looped) {
			index = (index + 1) % size;
			if(originalIndex == index) looped = true;
		}
		
		if(tableValues[index] == null)
			return null;
		else
			return tableValues[index].value;
	}
	
	
	static class HashEntry<K,V> {
		
		K key;
		V value;
		
		public HashEntry(K key, V value){
			this.key = key;
			this.value = value;
		}
		
	}
	
}
