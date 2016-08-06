package listStuff;

public class ListMain {

	public static void main(String[] args) {
		
		/*LinkedListRecursive<Integer> list = new LinkedListRecursive<Integer>();

		list.insert(5);
		list.insert(3);
		list.insert(2);
		list.insert(1);
		System.out.println(list.toString());
		System.out.println("size " + list.size());
		System.out.println("list has 4: " + list.contains(4));
		System.out.println("list has 5: " + list.contains(5));
		
		list.delete(2);
		System.out.println(list.toString());
		System.out.println("size " + list.size());
		
		list.reverse();
		System.out.println(list.toString());*/
		
		LinkedListIterative<Integer> list2 = new LinkedListIterative<Integer>();

		list2.insert(3);
		list2.insert(2);
		list2.insert(1);
		System.out.println(list2.toString());
		list2.delete(1);
		System.out.println(list2.toString());
		list2.insert(4);
		list2.insert(5);
		list2.insert(6);
		System.out.println(list2.toString());
		list2.reverse();
		System.out.println(list2.toString());
		
		System.out.println(list2.contains(6));
		
	}
	
}
