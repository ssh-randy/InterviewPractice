import java.util.HashMap;


public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(6));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(0));
		
		
		System.out.println(dynamicFibonacci(6));
		System.out.println(dynamicFibonacci(5));
		System.out.println(dynamicFibonacci(4));
		System.out.println(dynamicFibonacci(3));
		System.out.println(dynamicFibonacci(2));
		System.out.println(dynamicFibonacci(1));
		System.out.println(dynamicFibonacci(0));
		
		
		
		memo = new HashMap<Integer, Integer>();
		
	}
	
	
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int dynamicFibonacci(int n) {
		int prevVal = 0;
		int firstVal = 1;
		int swap;
		
		if( n == 0 ) return 0;
		if( n == 1 ) return 1;
		
		for(int i=0; i<= n-2; i++) {
			swap = firstVal;
			firstVal = firstVal + prevVal;
			prevVal = swap;
		}
		
		return firstVal;
		
	}
	
	public static int memoFibonacci(int n) {
		int f;
		if(memo.containsKey(n)) return memo.get(n);
		else if(n <= 2) f = 1;
		else f = fibonacci(n-1) + fibonacci(n-2);
		memo.put(n, f);
		return f;
	}
	
	
	
	public static HashMap<Integer, Integer> memo;
	
	
}
