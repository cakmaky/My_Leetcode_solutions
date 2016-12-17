package leetcode;

import java.util.*;
public class Q287 {
	
	public static int findDuplicate(int[] nums){
		int num = 0;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++){
			
			if(!set.contains(nums[i])){
				set.add(nums[i]);
			} else {
				num = nums[i];
				break;	
			}
		}
		return num;
    }

	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,4,7,8,9};
		
		System.out.println(findDuplicate(nums)); 
		

	}

}
