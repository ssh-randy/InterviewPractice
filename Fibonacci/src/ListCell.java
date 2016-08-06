
public class ListCell<T> {

	private T data;
	private ListCell<T> next;
	
	public ListCell (T data, ListCell<T> next) {
		this.data=data;
		this.next=next;
	}
	
	
	public void setData(T data){
		this.data=data;
	}
	public void setNext(ListCell<T> next) {
		this.next=next;
	}
	public T getData(){
		return data;
	}
	public ListCell<T> getNext(){
		return next;
	}
	
	
	public static boolean contains(Object o, ListCell lc){
		for(; lc != null; lc = lc.getNext()){
			if (lc.getData().equals(o)) { return true; }
		}
		
		return false;
	}
	
	public static boolean recursiveContains(Object o, ListCell lc) {
		if (lc == null) return false;
		if (lc.getData().equals(o)) return true;
		else return recursiveContains(o, lc.getNext());
	}
	
	
	public ListCell<T> reverseList(ListCell<T> lc) {
		
		ListCell<T> reversedList = null;
		
		for(; lc != null; lc = lc.getNext()){
			reversedList = new ListCell<T>(lc.getData(), reversedList);
		}
		
		return reversedList;
		
	}
	
	public static ListCell recursiveReverseList(ListCell lc) {
		
		return recursiveReverseListHelper(lc, null);	
	}
	
	
	public static ListCell recursiveReverseListHelper(ListCell c, ListCell r) {
		
		if (c==null) return r;
		
		return recursiveReverseListHelper(c.getNext(), new ListCell(c.getData(), r));
		
		
	}
	
	
	
	
	
}



