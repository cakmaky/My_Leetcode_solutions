package leetcode;

import java.util.Arrays;

public class Q268 {
	
	public static int missingNumber_(int[] nums) {
		
		Arrays.sort(nums);
		int result =-1;
		for(int i=0; i<nums.length;i++){
			if(nums[i] != i){
				result = i;
				break;
			}
		}
		if(result == -1){
			result = nums[nums.length-1] + 1;
		}
        return result;
    }
	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int total = 0;
		for(int i=0; i<nums.length; i++){
			total += nums[i];
		}
		
		int result = n*(n+1) / 2 - total;
		return result;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		int[] nums = {1,2};
		System.out.println(missingNumber(nums)); 

	}

}
