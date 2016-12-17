package leetcode;

import java.util.*;
public class Q219 {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k){
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i < nums.length; i++){
			
			if(map.containsKey(nums[i]) &&   (i- map.get(nums[i])) <= k){
				return true;
				
			}
			else {
				map.put(nums[i], i);
			}
			
		}
		
		return false;
    }

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,4};
		
		System.out.println(containsNearbyDuplicate(nums, 3));

	}

}
