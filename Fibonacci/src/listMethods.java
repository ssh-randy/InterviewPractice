
public class listMethods {


	public static void main(String[] args){
		
		Integer A = new Integer(5);
		
		Integer B = new Integer(3);
		
		Integer C = new Integer(-12);
		
		ListCell<Integer> Pointer = new ListCell<Integer>(A, 
										new ListCell<Integer>(B, 
											new ListCell<Integer>(C, null)));
		
		//System.out.println(Pointer.getNext().getData());
		
		System.out.println("The outcome is: " + ListCell.contains(new Integer(4), Pointer));
		
		
		
		
		
		
	}
	
	
}
