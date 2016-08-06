/*
 * Find the best times to buy and sell a stock.
Find the best times to buy and sell a stock.
AP
You have an array for which the ith element is the price of a given stock on day "i".

If you are only allowed to buy one share of the stock and sell one share of the stock, 
make an algorithm to find the best times to buy and sell.


 */


public class buyAndSell {
	
	
	public static String buyAndSellStock(int[] prices){
		
		int buy = 0;
		int sell = 0;
		int speculativeBuy = 0;
		int speculativeSell = 0;
		int max = 0;
		
		for(int i=0; i<prices.length; i++){
			
			if (prices[i] < prices[buy]) buy = i;
			if (prices[i] > prices[sell]) sell = i;
			if(buy < sell){
				
				if(max < prices[buy]-prices[sell]) {
					max = prices[buy] - prices[sell];
					speculativeBuy = buy;
					speculativeSell = sell;
				}
				
			}
			
		}
		return "buy at "+ buy + ", sell at " + sell;
		
		
	}
	
	

}
