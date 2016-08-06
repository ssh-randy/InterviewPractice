package HiredQuestions;




/*How to find the minimum positive number K such that for each item in the array, 
 * adding or subtracting a number from [-K, K] can lead to a strictly ascending array?

For example:

the array is [10, 2, 20]
the min K is 5, a possible result is [10-5, 2+4, 20]
k = 4 is not OK, because 10-4 == 2+4; the array can not be transformed to strictly ascending order*/

public class Hill {
	
	public static void main(String[] args){
		
		int[] array = {3, 10, 7, 2, 1};
		
		hill(array);
	}
	
	
	public static void hill(int[] array) {
		
		double X2 = 0.0;
		int last = array[0];
		for(int i=1; i < array.length; i++){
			if(last - array[i] >= X2) {
				X2 = last - array[i];
				last ++;
			} else {
				last = array[i];
			}
			
		}
		System.out.println(1+Math.floor(X2/2));
	}
	
	

}
