
public class TreeCell<T extends Comparable<T>> {

	private T datum;
	private TreeCell<T> left, right;
	
	
	public TreeCell(T datum){
		this.datum = datum;
		this.left = null;
		this.right = null;
	}
	
	
	public TreeCell(T datum, TreeCell<T> left, TreeCell<T> right){
		this.datum = datum;
		this.left = left;
		this.right = right;
	}
	
	
	public void setLeft(TreeCell<T> treeCell){
		left = treeCell;
	}
	public void setRight(TreeCell<T> treeCell){
		right = treeCell;
	}
	public TreeCell<T> getLeft(){
		return left;
	}
	public TreeCell<T> getRight(){
		return right;
	}
	public void setDatum(T data){
		datum = data;
	}
	public T getDatum(){
		return datum;
	}
	
	
	
}
