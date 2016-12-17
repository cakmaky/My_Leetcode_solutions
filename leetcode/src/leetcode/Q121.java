package leetcode;
// 200 / 200 test cases passed. daha efectif coz. Time Limit Exceeded.
public class Q121 {
	
	public static int maxProfitold(int[] prices) {
		int length = prices.length;
		int max = Integer.MIN_VALUE;
		for(int i=0; i < length; i++){
			for(int j=i+1; j < length; j++){
				if(prices[j] -prices[i] > max){
					max = prices[j] -prices[i];
				}	
			}
		}
		if(max < 0){
			max = 0;
		}
		
        return max;
    }
	
	public static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i<prices.length; i++){
			
			if(prices[i] < minPrice){
				minPrice = prices[i] ;
			} else if((prices[i] - minPrice) > maxProfit ){
				maxProfit = prices[i] - minPrice;
			}	
		}
		return maxProfit;
		
	}
	public static void main(String[] args) {
		
		
		int[] array = {11,1,10,9,8,0,0};
		
		System.out.println(maxProfit(array));

	}

}
