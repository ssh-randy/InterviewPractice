package Trees;


public class BinarySearchTree<T extends Comparable<T>> {
	
	TreeCell<T> root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(T datum) {
		root = insert(datum, root);
	}
	
	private TreeCell<T> insert(T datum, TreeCell<T> tc){
		if(tc == null) return new TreeCell<T>(datum);
		
		if(datum.compareTo(tc.getDatum()) < 0) tc.setLeft(insert(datum, tc.getLeft()));
		else if(datum.compareTo(tc.getDatum()) > 0) tc.setRight(insert(datum, tc.getRight()));
		
		return tc;
	}
	
	
	public boolean treeSearch(T datum) {
		return treeSearch(datum, root);
		
	}
	
	private boolean treeSearch(T datum, TreeCell<T> node){
		if(node == null) return false;
		
		boolean foundVal = false;
		if(datum.compareTo(node.getDatum()) == 0) foundVal = true;
		else if(datum.compareTo(node.getDatum()) < 0) foundVal |= treeSearch(datum, node.getLeft());
		else if(datum.compareTo(node.getDatum()) > 0) foundVal |= treeSearch(datum, node.getRight());
		
		return foundVal;
		
	}
	
	
	public String printTree() {
		return printTree(root);
	}
	
	private String printTree(TreeCell<T> node) {
		
		if(node == null) return"";
		String returnString = "";
		returnString += printTree(node.getLeft());
		returnString += node.getDatum() + " ";
		returnString += printTree(node.getRight());
		
		return returnString;
	}
	

}

class TreeCell<T extends Comparable<T>> {
	
	private TreeCell<T> left, right;
	private T datum;
	
	public TreeCell(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}
	
	public TreeCell(T datum, TreeCell<T> left, TreeCell<T> right){
		this.datum = datum;
		this.left = left;
		this.right = right;
	}
	
	
	public TreeCell<T> getLeft() {
		return left;
	}
	public void setLeft(TreeCell<T> left) {
		this.left = left;
	}
	public TreeCell<T> getRight() {
		return right;
	}
	public void setRight(TreeCell<T> right) {
		this.right = right;
	}
	public T getDatum() {
		return datum;
	}
	public void setDatum(T datum) {
		this.datum = datum;
	}
	
	
	
	
	
}