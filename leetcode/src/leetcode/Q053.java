package leetcode;

public class Q053 {
	
	public static int maxSubArray_mine(int[] nums) {	
	// Bu benim cevaba bakmadan yazdigim. Son test case i gecemedi.
		int max = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++){
			int total = nums[i];
			if(total > max){
				max = total;
			}
			for(int j=i+1; j<nums.length; j++){
				total +=nums[j];
				if(total > max){
					max = total;
				}	
			}	
		}
		return max;
    }

	public static int maxSubArray(int[] nums) {
	// Discussionda en cok hit alan cevap.  Ondan fikir alip yazdim. Submit i gecti
		int sum = nums[0];
		int max = nums[0];
		for(int i=1; i<nums.length; i++){
			if( nums[i] > (nums[i] + sum)){			
				sum = nums[i];
			} else {
				sum += nums[i];
			}
			if(sum > max){
				max = sum;
			}
		}
		return max;
		
	    
	}
	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.print(maxSubArray(nums)); 
	}

}
