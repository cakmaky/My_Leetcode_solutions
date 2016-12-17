package leetcode;

import java.util.*;
public class Q260 {
	
	public static int[] singleNumber(int[] nums){
		Set<Integer> set = new HashSet<Integer>();	
		for(int i: nums){
			if(!set.add(i)){
				set.remove(i);
			}	
		}
		Object[] arr = set.toArray();
		int[] arr2 = {(int)arr[0], (int)arr[1]}; 
		return arr2;
        
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,2,5,1};
		
		int[] arr = singleNumber(nums);
		System.out.println(arr[0] + "  " + arr[1]); 
		

	}

}
