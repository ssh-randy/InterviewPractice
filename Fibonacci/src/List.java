
public class List<T> {

	private ListCell<T> head;
	public List (ListCell<T> head) {
		this.head = head;
	}
	
	public ListCell<T> getHead() { return head;}
	
	public void setHead(ListCell<T> lc) { head = lc; }
	
	
	
	public ListCell<T> recursiveDeleteItem(Object o, ListCell<T> lc) {
		
		if(lc == null) return null;
		if(lc.getData().equals(o)) return lc.getNext();
		
		lc.setNext(recursiveDeleteItem(o, lc.getNext()));
		return lc;
		
	}
	
	
	public void iterativeDeleteItem(Object o) {
		
		if (head == null) return;
		if(head != null && head.getNext() == null) {
			if (head.getData().equals(o)) { head = null; }
			return;
		}
			
		ListCell<T> iterator = head;
		ListCell<T> iteratorNext = head.getNext();
		
		while (iteratorNext != null && !iteratorNext.getData().equals(o)) {
			iterator = iteratorNext;
			iteratorNext = iteratorNext.getNext();
		}
		
		if ( iteratorNext != null ) {
			iterator.setNext(iteratorNext.getNext());
		}
			
		
	}
	
	
	
	public ListCell<T> recursiveReverseList2(){
		return recursiveReverseList2Helper(head, null);
	}
	
	public ListCell<T> recursiveReverseList2Helper(ListCell<T> lc, ListCell<T> r){
		if(lc == null) return r;
		return recursiveReverseList2Helper(lc.getNext(), new ListCell(lc.getData(), r));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ListCell<T> recursiveReverseList(ListCell<T> lc){
		
		return recursiveReverseListHelper(lc, null);
		
	}
	
	public ListCell<T> recursiveReverseListHelper(ListCell<T> lc, ListCell<T> r){
		
		if (lc == null) return r;
		
		return recursiveReverseListHelper(lc.getNext(), new ListCell(lc.getData(), r));
		
	}
	
	
	
	public ListCell<T> reverseList(ListCell<T> lc){
		
		ListCell<T> reversed = null;
		
		for (; lc != null; lc = lc.getNext()){
			reversed = new ListCell(lc.getData(), reversed);
		}
		
		return reversed;
		
	}
	
	
	
	
	
	
}
