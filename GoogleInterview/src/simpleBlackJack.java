
/* TECHNICAL PHONE SCREEN
given cards d1, p1, p2

find probability that player wins if player wins on ties, dealer must draw until hand >= 17, busts on 22+
Ace=1, infinitely large deck
*/


public class simpleBlackJack {
	
	
	public static double probabilityDealerHand(int hand, int target, double prob){
		if (hand == target) return prob;
		else if (hand > target) return 1.0;
		else{
			double totalProbability = 0;
			for(int i=1; i<= 13; i++){
				if(i < 10) totalProbability += probabilityDealerHand(hand + i, target, prob*1/13);
				else totalProbability += probabilityDealerHand(hand + 10, target, prob*1/13);
			}
			return totalProbability;
		}
	}
	
	
	public static double probabilityPlayerWins(int d1, int p1, int p2){
		double totalProb = 0;
		
		for(int i = p1 + p2; i >= 17; i--){
			totalProb += probabilityDealerHand(d1, i, 0);
		}
		for(int i = 22; i <= 26; i++){
			totalProb += probabilityDealerHand(d1, i, 0);
		}
		
		return totalProb;
		
		
	}
	
	
	
	
	
}
