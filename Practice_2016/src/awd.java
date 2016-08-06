package sort;

import java.util.Random;

public class awd<T extends Comparable<T>> implements Sorter<T> {
   
   static Random rand = new Random();

   public void sort(T[] x) {
      sort(x, 0, x.length);
   }
   
   // sort the portion of Comparable array x between
   // lo (inclusive) and hi (exclusive) in place
   // does not touch other parts of x
   // WARNING: This version can handle arrays that have duplicate elements, 
   // but has may have average-case runtime O(n^2) runtime for such inputs.
   private void sort(T[] x, int lo, int hi) {
      
	  for(int j=lo; j<hi; j++) {
		  System.out.print(x[j]+".");
	  }
	  System.out.println(""); 
	  
      // base case: empty or single element array
      if (hi <= lo + 1) return;
      
      // base case: all elements equal
      int k;
	  for(k=lo; k<hi; k++) {
		  if(x[lo].compareTo(x[k]) != 0) break;
	  }
	  if(k == hi) return;
      
      // pick random pivot
      T pivot = x[lo + rand.nextInt(hi - lo)];
      
      // partition the elements about the pivot
      int i = lo;
      int j = hi - 1;
      while (true) {
         // advance indices
         while (i < j && x[i].compareTo(pivot) < 0) i++;
         while (i < j && x[j].compareTo(pivot) >= 0) j--;
         // done?
         if (i == j) break;
         // swap
         System.out.print(i+" ");
         System.out.println(j);
         T tmp = x[i];
         x[i] = x[j];
         x[j] = tmp;
      }
      
      // recursively sort the partition elements
      sort(x, lo, j);
      sort(x, j, hi);
   }
}

