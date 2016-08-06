import java.util.Arrays;


public class MergeSort2 {

	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void mergeSort(Comparable[] a){
		Comparable[] tmp = new Comparable[a.length];
		
		mergeSort(a, tmp, 0, a.length);
	}
	
	public static void mergeSort(Comparable[] a, Comparable[] tmp, int left, int right){
		
		if (left < right - 1){
			
			int center = (left + right)/2;
			
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center+1, right);
			
			merge(a, tmp, left, right);
			
		}
		
	}
	
	public static void merge(Comparable[] a, Comparable[] tmp, int left, int right){
		
		int center = (left+right)/2 + 1;
		
		int i = left;
		int k = center;
		int j = left;
		
		while ( i < center - 1 && k < right){
			if (a[i].compareTo(a[k]) < 0) {
				tmp[j] = a[i];
				i++;
			} else{
				tmp[j] = a[k];
				k++;
			}
			j++;
		}
		
		
	}
	
	
}
