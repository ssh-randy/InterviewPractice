
public class power {

	
	public int recPower(int a, int b) {
		int pow;
		if(b == 0) pow = 1;
		else pow = a * recPower(a, b-1);
		
		return pow;
		
		
	}
	
	
	public int smarterPower(int a, int b) {
		
		int pow;
		int halfPow = recPower(a,b/2);
		if(b == 0) pow = 1;
		else if(b%2 == 0) pow = halfPow * halfPow;
		else pow = a * halfPow * halfPow;
		
		return pow;
		
		
	}
	
}
