package listStuff;

public class LinkedListIterative<T> implements List<T> {

	private ListCell<T> head;
	
	public LinkedListIterative(){
		head = null;
	}
	
	
	public void insert(T element) {
		head = new ListCell<T>(element, head);
		
	}

	public void delete(T element) {
		
		for (ListCell<T> lc = head; lc != null; lc = lc.getNext()) {
			//System.out.println("lc is " + lc.getDatum());
			if(lc == head && lc.getDatum() == element) head = lc.getNext();
			else if(lc.getNext() != null && lc.getNext().getDatum() == element) lc.setNext(lc.getNext().getNext());	
		}
		
	}
	
	public void reverse() {
		ListCell<T> reversedList = null;
		
		for(ListCell<T> lc = head; lc != null; lc=lc.getNext()) {
			reversedList = new ListCell<T>(lc.getDatum(), reversedList);
		}
		head = reversedList;
		
		
	}

	public boolean contains(T element) {
		boolean contain = false;
		
		for (ListCell<T> lc = head; lc != null; lc=lc.getNext()) {
			if(lc.getDatum() == element) contain = true;
		}
		
		return contain;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		String output = "";
		for(ListCell<T> lc = head; lc != null; lc=lc.getNext()) {
			output = output + lc.getDatum() + " ";
		}
		return output;
	}

	
	
}
