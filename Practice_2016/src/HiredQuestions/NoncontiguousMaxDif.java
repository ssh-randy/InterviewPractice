package HiredQuestions;

import java.util.Arrays;

public class NoncontiguousMaxDif {
	public static void main(String[] args) {
		int[] array = {3, -5, 1, -2, 8, -2, 3, -2, 1};
		
		System.out.println(nonContiguousMaxDif(array));
		
	}
	
	//find max and find min
	public static int nonContiguousMaxDif(int[] array) {
		

		int[] differences = new int[array.length-1];

		
		for(int j=0; j<array.length-1; j++) {
			
			int maxSoFar=0;
			int newSumMax=0;
			
			int minSoFar=0;
			int newSumMin=0;
			
			boolean allNegative = true;
			boolean allPositive = true;
			
			//left hand side (find minimum)
			for(int i=0; i <= j; i++) {
				
				if(array[i] <= 0) allPositive = false;
				newSumMin += array[i];
				
				if(newSumMin > 0) newSumMin = 0;
				if(newSumMin < minSoFar) minSoFar = newSumMin;
			}
			
			for(int i=j+1; i<array.length; i++) {
				
				if(array[i] >= 0) allNegative = false;
				
				newSumMax += array[i];
				
				if(newSumMax < 0) newSumMax = 0;
				if(newSumMax > maxSoFar) maxSoFar = newSumMax;
				
				
			}
			
			if(allNegative) maxSoFar = arrayMaxVal(Arrays.copyOfRange(array, 0, j+1));
			if(allPositive) minSoFar = arrayMinVal(Arrays.copyOfRange(array, j+1, array.length)); 
			
			differences[j] = maxSoFar - minSoFar;
			
		}

		return arrayMaxVal(differences);
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
