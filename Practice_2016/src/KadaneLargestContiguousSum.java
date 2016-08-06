
public class KadaneLargestContiguousSum {

	public static void main(String[] args) {
		int[] array = {10, 3, -4, 6, -3, -13, 7, -2, 8};
		
		System.out.println(largestContiguousSum(array));
		
	}
	
	
	public static int largestContiguousSum(int[] array) {
		
		int maxSoFar = 0;
		int newSum = 0;
		boolean allNegative = true;
		for(int i=0; i < array.length; i++) {
			
			if(array[i] >= 0) allNegative = false;
			
			newSum += array[i];
			if(newSum < 0) {
				newSum = 0;
			}
			if(newSum > maxSoFar) maxSoFar = newSum;
			
			
		}
		
		if(allNegative == true) return arrayMaxVal(array);
		
		else return maxSoFar;
		
	}
	
	
	public static int arrayMaxVal(int[] array) {
		
		int maxVal = Integer.MIN_VALUE;
		
		for(int i=0; i< array.length; i++) {
			if(array[i] > maxVal) maxVal = array[i];
		}
		
		return maxVal;
		
	}
	
}
