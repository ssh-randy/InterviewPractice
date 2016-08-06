package HiredQuestions;

/* Given an array of ints and an int d, consider all the sequences of length d within the array.
 * 
 * The deviation is calculated as the difference between the max and min value within a sequence
 * 
 * Find the maximum deviation across all sequences of length d in the array
 * 
 */


public class Deviation {

	public static void main(String[] args) {
		int[] array = {5, 3, 6, 10, 4};
		
		maxDeviation(array, 3);
		
	}
	
	
	public static void maxDeviation(int[] array, int d) {
		
		int[] deviations = new int[array.length - (d-1)];
		for(int i=0; i < array.length - (d-1); i++) {
			
			int max=0;
			int min=2^31-1;
			for(int j = i; j < i+d; j++) {
				if(array[j] < min) {
					min = array[j];
				}
				if(array[j] > max) {
					max = array[j];
				}
			}
			deviations[i] = max-min;
			
		}
		
		int max = 0;
		for(int deviation : deviations) {
			if(deviation > max) max = deviation;
		}
		
		System.out.println(max);
		
		
	}
	
}
