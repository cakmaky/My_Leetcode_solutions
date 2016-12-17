package leetcode;

import java.util.*;

import javax.swing.ListModel;
public class Q015_2 {

	public static List<List<Integer>> threeSum(int[] nums) {
	// Discussion dan fikir alip yazdim. 	
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> minilist;
		Arrays.sort(nums); 
		
		for(int i=0; i<nums.length; i++){
			if(i == 0 || (nums[i] != nums[i-1] && nums[i] <= 0)){
				int sum = (0 - nums[i]);
				int left = i+1;
				int right = nums.length -1;
				while(left < right){
					if(sum == (nums[left] + nums[right])){
						minilist = new ArrayList<>();
						minilist.add(nums[i]);
						minilist.add(nums[left]);
						minilist.add(nums[right]);
						if(!list.contains(minilist)){
						list.add(minilist);
						}
						left++;
						right--;
					} else if(sum > (nums[left] + nums[right])){
						left ++;
					} else {
						right--;
					}	
				}	
			}	
		}	
		return list;
		
	}
	public static void main(String[] args) {
		int[] Array = {-1, 0, 1, 2, -1, -4};
		
		List<List<Integer>> Array2 = threeSum(Array);
		
		System.out.println(Array2.toString());

	}

}
