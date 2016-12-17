package leetcode;

import java.util.*;
public class Q349 {
	public static int[] intersection(int[] nums1, int[] nums2){
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i: nums1){
			set.add(i);
		}
		
		for(int i:nums2){
			if(set.contains(i)){
				list.add(i);
				set.remove(i);
			}
		}
		int[] arr = new int[list.size()];
		for(int i=0; i<arr.length;i++){
			arr[i] = list.get(i);
		}
		return arr;
   
    }

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,4,5,6,7};
		int[] nums2 = {2,2,3,3,5,5,7,9,8};
		
		int[] result = intersection(nums1,nums2);
		
		for(int i:result){
			System.out.print(i + " ");
		}
		
		

	}

}
