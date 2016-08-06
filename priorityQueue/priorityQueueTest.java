package priorityQueue;

public class priorityQueueTest {

	public static void main(String[] args){
		
		FlightTicket sam = new FlightTicket("sam", 1);
		FlightTicket vick = new FlightTicket("vick", 1);
		FlightTicket remy = new FlightTicket("remy", 2);
		FlightTicket jeff = new FlightTicket("jeff", 2);
		FlightTicket sally = new FlightTicket("sally", 2);
		FlightTicket bob = new FlightTicket("bob", 3);
		
		priorityQueueList<FlightTicket> flight1 = new priorityQueueList<FlightTicket>();
		
		flight1.add(vick);
		flight1.add(sally);
		flight1.add(remy);
		flight1.add(jeff);
		flight1.add(bob);
		flight1.add(sam);
		
		System.out.println(flight1.poll().toString());
		System.out.println(flight1.poll().toString());
		System.out.println(flight1.poll().toString());
		System.out.println(flight1.poll().toString());
		System.out.println(flight1.poll().toString());
		System.out.println(flight1.poll().toString());
		
	}
	

	
	
}



class FlightTicket implements Comparable<FlightTicket>{

	private String name;
	private int seatClass;
	
	public FlightTicket(String name, int seatClass){
		this.name = name;
		this.seatClass = seatClass;
	}
	
	public int compareTo(FlightTicket arg0) {
		if(seatClass < arg0.seatClass) return -1; 
		else if (seatClass == arg0.seatClass) return 0;
		else return 1;
	}
	
	public String toString() {
		return name;
	}
	
}