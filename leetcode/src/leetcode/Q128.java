package leetcode;

import java.util.*;
public class Q128 {
	
	public static int longestConsecutive_(int[] nums) {
	// 65 / 67 test cases passed.	
		Set<Integer> set = new HashSet<>();
		for(int i:nums){
			set.add(i);
		}
		int maxcount = 0;
		for(int i=0; i<nums.length; i++){
			
			int count = 1;
			while(set.contains(nums[i]+count)){
				count++;
			}
			maxcount = Math.max(count, maxcount);	
		}
		
		return maxcount;    
	}
	public static int longestConsecutive(int[] nums) {
		// discussiondaki en hit cozumden (alttaki linkteki) fikir alip yaptim. 
		//https://discuss.leetcode.com/topic/6148/my-really-simple-java-o-n-solution-accepted/2
		// left ve right i if-else ile yazinca time limite takildi. bu sekilde yazinca  kabul etti.
		Map<Integer, Integer> map = new HashMap<>();
		int max= 0, left =0, right=0;
		for(int i=0; i<nums.length;i++){
			if(!map.containsKey(nums[i])){
				
				left = (map.containsKey(nums[i] -1)) ? map.get(nums[i] -1): 0;
				right = (map.containsKey(nums[i] +1)) ? map.get(nums[i] +1): 0;
				
				/*if(map.containsKey(nums[i] -1)){
					left = map.get(nums[i] -1);
				} else { 
					left = 0;
				} 
				if(map.containsKey(nums[i] + 1)){
					right = map.get(nums[i] + 1);
				} else {
					right = 0;
				}*/
				int sum = left+right+1;
				map.put(nums[i], sum);
				max = Math.max(max, sum);
				
				map.put(nums[i] - left, sum);
				map.put(nums[i] + right, sum);
			}
		}
		
		return max;	
	}
	public static void main(String[] args) {
		int[] nums = {5,1,3,4};
		System.out.println(longestConsecutive(nums));
 		

	}

}
