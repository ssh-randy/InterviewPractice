import java.util.Arrays;

import java.util.Random;

public class sorting {

    static Random rand = new Random();

	public static void main(String[] args) {
		
		Integer[] arrayToSort = {5, 2, 15, 7, 8};
		
		System.out.println("insertion Sort: " + Arrays.toString(insertionSort(arrayToSort)));
		
		Integer[] arrayToSort2 = {5, 2, 15, 7, 8};

		System.out.println("selection Sort: " + Arrays.toString(selectionSort(arrayToSort2)));
		
		Integer[] arrayToSort3 = {5, 2, 15, 7, 8};
		mergeSort(arrayToSort3);
		System.out.println("merge Sort: " + Arrays.toString(arrayToSort3));
		
		Integer[] arrayToSort4 = {5, 2, 15, 7, 8};
		quickSort(arrayToSort4);
		System.out.println("quick Sort: " + Arrays.toString(arrayToSort4));
		
		
		
	}
	
	public static void quickSort(Integer[] array) {
		quickSort(array, 0, array.length);
		
	}
	
	private static void quickSort(Integer[] array, int left, int right) {
		System.out.println(Arrays.toString(array));
		System.out.println("left: " + left + ", right: " +right);
		
		// base case: all elements equal
	    int k;
		for(k=left; k<right; k++) {
			if(array[left] != array[k]) break;
		}
		if(k == right) return;
		
		if(right <= left + 1) return;
		

	    // pick random pivot
	    int pivot = array[left + rand.nextInt(right - left)];
		System.out.println("pivot: " +pivot);
		int leftIndex = left;
		int rightIndex = right-1;
		
		while(leftIndex < rightIndex) {
			while(array[leftIndex] < pivot && leftIndex < rightIndex) leftIndex++;
			while(array[rightIndex] >= pivot && leftIndex < rightIndex) rightIndex--;
			
			if(leftIndex < rightIndex) {
				int temp = array[leftIndex];
				array[leftIndex] = array[rightIndex];
				array[rightIndex] = temp;
			}
			
		}
		
		quickSort(array, left, rightIndex);
		quickSort(array, leftIndex, right);
		
		
		
		
	}

	
	public static void mergeSort(Integer[] array) {
		Integer[] temp = new Integer[array.length];
		mergeSort(array, temp, 0, array.length-1);
		
	}
	
	private static void mergeSort(Integer[] array, Integer[] temp, int begin, int end) {
		
		if( end > begin ) {
			int midpoint = (begin + end)/2;
			mergeSort(array, temp, begin, midpoint);
			mergeSort(array, temp, midpoint+1, end);
			merge(array, temp, begin, midpoint, end);
		}
		
	}
	
	private static void merge(Integer[] array, Integer[] temp, int begin, int midpoint, int end) {
		int arrayIndex1 = begin;
		int arrayIndex2 = midpoint+1;
		int k = begin;
		while(arrayIndex1 <= midpoint && arrayIndex2 <= end) {
			if(array[arrayIndex1] <= array[arrayIndex2]) {
				temp[k++] = array[arrayIndex1++];
			} else {
				temp[k++] = array[arrayIndex2++];
			}
		}
		
		while(arrayIndex1 <= midpoint) {
			temp[k++] = array[arrayIndex1++];
		}
		while(arrayIndex2 <= end) {
			temp[k++] = array[arrayIndex2++];
		}
		
		
        // Copy tmp back
        for(int i = begin; i <= end; i++)
            array[i] = temp[i];
        

	}
	
	
	public static Integer[] selectionSort(Integer[] array) {
		
		for (int i=0; i< array.length-1; i++){
			int temp = array[i];
			int index = i;
			for(int j=i+1; j<array.length; j++){
				if(array[j] < array[i]) {
					index = j;
					temp = array[index];
				}
			}
			array[index] = array[i];
			array[i] = temp;
		}
		
		
		return array;
	}
	
	
	public static Integer[] insertionSort(Integer[] array) {
		
		
		for(int i=0; i < array.length; i++) {
			
			int j = i;
			while(j > 0 && array[j] < array[j-1]) {
				int swap = array[j-1];
				array[j-1] = array[j];
				array[j] = swap;
				j--;
			}
			
		}
		
		return array;
		
	}
	
}
