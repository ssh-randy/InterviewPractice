
public class Tree<T extends Comparable<T>> {

	private TreeCell<T> head;
	
	public Tree(TreeCell<T> head) {
		this.head = head;
	}
	
	
	public boolean recursiveSearch(Object o, TreeCell<T> head){
		if(head == null) return false;
		if (head.getDatum().equals(o)) return true;
		return recursiveSearch(o, head.getLeft()) || recursiveSearch(o, head.getRight());
	}
	
	public void sortedInsert(T data) {
		sortedInsert(data, head);
	}
	
	public void sortedInsert(T data, TreeCell<T> cell) {
		if (head == null) head.setDatum(data);
		else if (head.getDatum().compareTo(data) > 0) sortedInsert(data, cell.getLeft());
		else if (head.getDatum().compareTo(data) < 0) sortedInsert(data, cell.getRight());
	}
	
	public void sortedPrint(){
		sortedPrint(head);
		System.out.println();
	}
	public void sortedPrint(TreeCell<T> cell) {
		if (cell == null) return;
		sortedPrint(cell.getLeft());
		System.out.println(cell.getDatum());
		sortedPrint(cell.getRight());
	}
	
	
	public boolean isBST(){
		return isBST(head, null, null);
	}
	
	public boolean isBST(TreeCell<T> cell, TreeCell<T> minCell, TreeCell<T> maxCell){
		if (cell == null) return true;
		else if(cell.getDatum().compareTo(minCell.getDatum()) < 0 || cell.getDatum().compareTo(maxCell.getDatum()) > 0) return false;
		else return (isBST(cell.getLeft(), minCell, cell) && isBST(cell.getRight(), cell, maxCell));
	
	}
	
	
	
	
	
}
