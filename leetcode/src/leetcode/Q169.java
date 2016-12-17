package leetcode;

import java.util.*;
public class Q169 {
	
	public static int majorityElement2(int[] nums) {
	// HashMap ile 	hangi eleman kac kez bulunuyor onu tuttum.
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++){
			
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 1);
			}
			else {
				int value = map.get(nums[i]);
				value++;
				map.put(nums[i], value);
			}	
		}
		System.out.println(map.toString());
		int count = 0;
		int key=0;
		for(int i : map.keySet()){
			int value = map.get(i);
			if(value > count){
				count = value;
				key = i;
			}
			
		}
		
		return key;    
    }

	public static int majorityElement(int[] nums){
	// Moore Voting algorithm sorusuymus bu. Bu sekilde en optimum cozuluyor.	
		int major = nums[0];
		int count = 1;
		
		for(int i=1; i<nums.length; i++){
			if(count == 0){
				count++;
				major = nums[i];
			}
			else if(nums[i] == major){
				count++;
			} else {
				count--;
			}
				
		}
		
		return major;
		
		
	}
	public static void main(String[] args) {
		
		
		int[] nums = {1,2,3,2,4,5,6,2,2,2,7,8,2,3,2,2};
		
		System.out.print(majorityElement(nums)); 

	}

}
