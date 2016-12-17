package leetcode;

public class Q152 {
	
	public static int maxProduct_(int[] nums){
		//brute force solution
		if(nums.length == 0){
			return 0;
		}
		int result = nums[0];
		for(int i=0; i<nums.length;i++){
			int product = nums[i];
			for(int j=i+1;j<nums.length;j++){
				product *= nums[j];	
				if(product > result){
					result = product;
				}
			}
			if(product > result){
				result = product;
			}
		}
		return result;
    }
	public static int maxProduct(int[] nums){
		// local max ve min degerlerini ayri ayri tutarak yaptim discussion dan fikir alip. Bu daha elegant
		if(nums.length == 0){
			return 0;
		}
		int localmax =nums[0];
		int localmin =nums[0];
		int max = nums[0];
		int min = nums[0];
		
		for(int i=1; i<nums.length; i++){
			int currentmax = localmax*nums[i];
			int currentmin = localmin*nums[i];
			
			
			
			localmax =Math.max((Math.max(currentmax, currentmin)),nums[i]);
			localmin =Math.min((Math.min(currentmax, currentmin)),nums[i]);
			max = Math.max(max, localmax);
			min = Math.min(min, localmin);
			
			
		}
		
		return max;
		
	}
	public static void main(String[] args) {
		int[] nums = {2,3, -2,4};
		
		System.out.println(maxProduct(nums));

	}

}
