
public class fibonacci {

	public static void main(String args[]) {
		
		int bla = fibonnaciCalc(10);
		
		System.out.println(bla);
		
	}
	
	public static int fibonnaciCalc(int n) {
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) { array[i] = 1; }
			else if (i == 1) { array[i] = 1; }
			else {array[i] = array[i-1] + array[i-2]; }
		}
		
		return array[n-1];
	}
	
}
