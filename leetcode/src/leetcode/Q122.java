package leetcode;

public class Q122 {
	
	public static int maxProfit(int[] prices) {
		int total =0;
		
		for(int i=1; i<prices.length; i++){
			if(prices[i] > prices[i-1]){
				total += (prices[i] - prices[i-1]);
			}	
		}
        return total;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
