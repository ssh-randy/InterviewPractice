import java.util.Queue;


public class runningAverage {
	
	private double average;
	private Queue<Double> inputNums;
	private int index;
	private int maxNum;
	
	public runningAverage(int maxNum){
		average = 0;
		inputNums = null;
		index = 1;
		this.maxNum = maxNum;
	}
	
	public double addNum(double number){
		
		if(index < maxNum) {
			average += number/index++;
			inputNums.add(number);
		} else {
			average += number/maxNum;
			inputNums.add(number);
			average -= (inputNums.remove()/maxNum);
		}
		
		return average;
	}
	
	
	

}
