package leetcode;

import java.util.*;
public class Q137 {
	
	public static int singleNumber(int[] nums) {
		// HashMap ile yaptim, submiti gecti
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			if(!map.containsKey(nums[i])){
			map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1); 
			}	
		}
		
		Set<Integer> set = map.keySet();
		
		for(Integer i: set){
			if(map.get(i) != 3){
				return i;
			}
		}
		return 0;        
    }

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,2,3,4,2,3,1,1};
		
		System.out.println(singleNumber(nums)); 

	}

}
