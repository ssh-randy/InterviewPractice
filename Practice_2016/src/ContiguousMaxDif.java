
public class ContiguousMaxDif {
	
	public static void main(String[] args) {
		int[] array = {10, 3, -4, 6, -3, -13, 7, -2, 8};
		
		System.out.println(contiguousMaxDif(array));
		
	}
	
	//find max and find min
	public static int contiguousMaxDif(int[] array) {
		
		int maxSoFar=0;
		int newSumMax=0;
		
		int minSoFar=0;
		int newSumMin=0;
		
		boolean allNegative = true;
		boolean allPositive = true;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] >= 0) allNegative = false;
			if(array[i] <= 0) allPositive = false;
			
			newSumMax += array[i];
			newSumMin += array[i];
			
			if(newSumMax < 0) newSumMax = 0;
			if(newSumMax > maxSoFar) maxSoFar = newSumMax;
			
			if(newSumMin > 0) newSumMin = 0;
			if(newSumMin < minSoFar) minSoFar = newSumMin;
			
		}
		
		if(allNegative) maxSoFar = arrayMaxVal(array);
		if(allPositive) minSoFar = arrayMinVal(array); 
		
	
		return maxSoFar - minSoFar;
	}
	
	
	public static int arrayMaxVal(int[] array) {
		
		int maxVal = Integer.MIN_VALUE;
		
		for(int i=0; i< array.length; i++) {
			if(array[i] > maxVal) maxVal = array[i];
		}
		
		return maxVal;
		
	}
	
	
	public static int arrayMinVal(int[] array) {
		
		int minVal = Integer.MAX_VALUE;
		
		for(int i=0; i< array.length; i++) {
			if(array[i] < minVal) minVal = array[i];
		}
		
		return minVal;
		
	}
	
	

}
