
public class fibonacciRecursive {

	public static void main(String args[]) {
		
		int bla = fibonnaciCalc(10);
		
		System.out.println(bla);
		
	}
	
	public static int fibonnaciCalc(int n) {
		if (n == 1) {return 1;}
		else if (n == 2) {return 1;}
		else {return (fibonnaciCalc(n - 1) + fibonnaciCalc(n-2)); }
	}
	
}
