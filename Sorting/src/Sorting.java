
public class Sorting {

	public static int[] insertionSort( int[] a){
		
		for(int i = 0; i < a.length; i++){
			int temp = a[i];
			int k;
			for (k = i; 0 < k && temp < a[k-1] ; k--) {
				a[k] = a[k-1];
			}
			a[k] = temp;
		}
		
		
		return a;
	}
	
	
	public static int[] selectionSort(int[] a){
		
		for(int i=0; i < a.length; i++){
			
			int k;
			int min = a[i];
			int temp = i;
			for (k = i; k < a.length; k++){
				if (a[k] < min) { 
					min = a[k];
					temp = k;
				}
			}
			
			a[k] = a[i];
			a[i] = min;
			
		}
		
		return a;
	}
	
	

	
	
}
