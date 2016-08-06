package listStuff;

public class LinkedListRecursive2<T> implements List<T> {

	private ListCell<T> head;
	
	public LinkedListRecursive2(){
		head = null;
	}
	
	public void insert(T element) {
		head = new ListCell<T>(element, head);
	}

	//only deletes first occurrence
	public void delete(T element) {
		delete(element, head);
	}
	
	//helper function recursive delete
	private ListCell<T> delete(T element, ListCell<T> lc) {
		if(lc == null) return lc;
		if(lc.getDatum().equals(element)) return lc.getNext();
		lc.setNext(delete(element, lc.getNext()));
		
		return lc;
	}

	public boolean contains(T element) {
		return recursiveContains(element, head);
	}
	
	private boolean recursiveContains(T element, ListCell<T> lc) {
		if(lc == null) return false;
		else if(lc.getDatum().equals(element)) return true;
		else return recursiveContains(element, lc.getNext());
	}

	public int size() {
		return size(head);
	}

	private int size(ListCell<T> lc){
		if (lc == null) return 0;
		else return 1 + size(lc.getNext());
	}

	public ListCell<T> reverse(ListCell<T> lc) {
		
		return reverse(lc, null);
	}
	
	public ListCell<T> reverse(ListCell<T> fl, ListCell<T> rl) {
		if (fl == null) return rl;
		return  reverse(fl.getNext(), new ListCell<T>(fl.getDatum(), rl));
	}
	
	
	public String toString() {
		return toString(head);
	}
	
	private String toString(ListCell<T> lc){
		if (lc == null) return "";
		return lc.getDatum().toString() + " " + toString(lc.getNext());
	}

	
}
