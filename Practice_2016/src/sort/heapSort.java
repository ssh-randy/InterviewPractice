package sort;

import java.util.Arrays;

//if we want to create a priority queue using heapsort, we can just use an arraylist so that we can store
//items with the same priority in a list in each slot, and use comparable as opposed to < and > for maintaining
//the heap invariant
public class heapSort {
	
	public static void main(String[] args) {
		
		int[] array = {1, 7, 4, 50, 30, 25, 60, 42, 3, 100};
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(heapifySiftDown(array)));
		System.out.println(Arrays.toString(sortFromHeap(heapifySiftDown(array))));
	}
	
	
	//heap sort can't be in order because of the way insertion works, does not satisfy
	//in order
	public static int[] heapifySiftUp(int[] unheaped){
		
		int[] heaped = new int[unheaped.length];
		for(int i=0; i<unheaped.length; i++) {
			heaped[i] = unheaped[i];
			int j = i;
			//while inserted node is less than parent
			//maintain invariant
			while(heaped[j] < heaped[((j-1)/2)]) {
				int swap = heaped[j];
				heaped[j] = heaped[((j-1)/2)];
				j = (j-1)/2;
				heaped[j] = swap;
			}
		}
		
		return heaped;
	}
	
	
	
	//creates a heap from an array using siftdown
	public static int[] heapifySiftDown(int[] unheaped){
		
		int[] heaped = new int[unheaped.length];
		System.arraycopy( unheaped, 0, heaped, 0, unheaped.length );
		int endIndex = unheaped.length -1;
		
		//starting from the end of the array, siftdown each element so that we maintain
		//the heap invariant for [endIndex - n, endIndex] 
		for(int n=0; n<unheaped.length; n++){
			siftDown(heaped, endIndex-n, endIndex);
		}
		
		return heaped;
	}
	
	//sifts down a value to satisfy heap invariant
	public static void siftDown(int[] heap, int start, int end) {
		int index = start;
		
		//while there is at least one root of the node
		while(2*index + 1 <= end) {
			int swapIndex = index;
			int swap = heap[index];
			
			if(heap[index*2 + 1] < heap[swapIndex]) {
				swapIndex = index*2+1;
			}
			
			if((index*2+2) <= end && heap[index*2+2] < heap[swapIndex]) {
				swapIndex = index*2+2;
			}
			
			if(index == swapIndex) {
				return;
			} else {
				heap[index] = heap[swapIndex];
				heap[swapIndex] = swap;
				index = swapIndex;
			}
			
		}
		
		
	}
	
	//sorts an array that is a heap
	public static int[] sortFromHeap(int[] heaped){
		
		int[] sorted = new int[heaped.length];
		
		for(int i=0; i < heaped.length; i++) {
			sorted[i] = heaped[0];
			heaped[0] = heaped[heaped.length - 1 - i];
			
			
			siftDown(heaped, 0, heaped.length-1-i);
			
		}
		
		
		return sorted;
	}
	

}
