package leetcode;

import java.util.*;
public class Q217 {
	 public static boolean containsDuplicate(int[] nums){
		 
		 Map<Integer,Integer> map = new HashMap<>();
		 
		 for(int i=0; i<nums.length; i++){
			 
			 if(map.containsKey(nums[i])){
				 return true;
			 }
			 map.put(nums[i], i);
		 }
		 
		 return false;   
	    }

	
	 public static boolean containsDuplicateHashSet(int[] nums){
		 
		 Set<Integer> set = new HashSet<>();
		 
		 for(int i=0; i<nums.length; i++){
			 
			 if(set.contains(nums[i])){
				 return true;
			 }
			 set.add(nums[i]);
		 } 
		 return false;
	 }
	 
	 public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,2,7,8,9};
		
		System.out.println(containsDuplicateHashSet(nums));

	}

}
