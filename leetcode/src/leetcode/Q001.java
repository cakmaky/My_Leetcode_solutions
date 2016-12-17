package leetcode;

import java.util.*;

public class Q001 {
	 public static int[] twoSum_(int[] nums, int target) {
		 int[] Result = new int[2];
		 for(int i=0; i<nums.length; i++){
			 for(int j=i+1; j<nums.length; j++){
				 if((nums[i] + nums[j]) == target){
					 Result[0] = i;
					 Result[1] = j;
				 }
				 
			 }
		 }
		 
	    return Result;    
	    }
	 public static int[] twoSum(int[] nums, int target){ 
		
		 int[] result = new int[2];
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int i=0; i<nums.length; i++){
			 map.put(nums[i], i);	 
		 } 
		 for(int i=0; i<nums.length; i++){
			 int val = nums[i];
			 int search = target - val;
			 
			 if(map.containsKey(search) && map.get(search) != i){
				 result[0] = i;
				 result[1] = map.get(search);
				 break;
			 }
		 }
		 return result; 
	 }
	 
	 public static void main(String[] args) {
		
		 int[] nums = {2, 7, 11, 15, 42, 6, 51, 9}; 
		 int target = 48;
		 int[] result = new int[2];
		 
		 result = twoSum(nums, target);
		 System.out.println(result[0] + " " + result[1]); 
		

	}

}
