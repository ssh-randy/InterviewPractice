package priorityQueue;

import java.util.LinkedList;
import java.util.List;

public class priorityQueueList<E extends Comparable<E>> {
	
	private LinkedList<E> queue;
	int size;
	
	public priorityQueueList() {
		queue = new LinkedList<E>();
		size = 0;
	}
	
	
	public boolean add(E e) {
		
		if(queue.isEmpty()) {
			queue.add(e);
			size++;
			return true;
		} else {
			
			int index = 0;
			while(index < queue.size() && queue.get(index).compareTo(e) <= 0) {
				index++;
			}
			
			queue.add(index, e);
			size++;
			return true;
		}
	}
	
	public void clear() {
		queue = new LinkedList<E>();
		size = 0;
	}
	
	public E peek() {
		return queue.peekFirst();
	}
	
	public E poll() {
		size--;
		return queue.pop();
	}
	
	public int size() {
		return size;
	}


}
