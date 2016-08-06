package listStuff;

public interface List<T> {
	public void insert(T element);
	public void delete(T element);
	public boolean contains(T element);
	public int size();
	public String toString();
}


class ListCell<T> {

	private T datum;
	private ListCell<T> next;
	
	public ListCell(T datum, ListCell<T> next) {
		this.datum = datum;
		this.next = next;
	}

	public T getDatum() {
		return datum;
	}

	public void setDatum(T datum) {
		this.datum = datum;
	}

	public ListCell<T> getNext() {
		return next;
	}

	public void setNext(ListCell<T> next) {
		this.next = next;
	}
	
}
