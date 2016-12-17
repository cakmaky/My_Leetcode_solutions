package leetcode;

import java.util.Arrays;
// 2080 / 2080 test cases passed. TLE
public class Q004 {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2){
	
		int l1 = nums1.length;
		int l2 = nums2.length;
		int[] arr = new int[l1+l2];
		
		for(int i=0; i < l1; i++){
			arr[i] = nums1[i];
		}
		for(int i=0; i<l2; i++){
			arr[l1+i] = nums2[i];
		}
		
		Arrays.sort(arr); 
		int length = arr.length;
		
		if(length % 2 == 1){
			return arr[length/2];
		}
		
		return (arr[length/2-1] + arr[length/2])/2.0;
		       
    }

	public static void main(String[] args) {
		
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		double median = findMedianSortedArrays(nums1, nums2);
		System.out.println(median); 
		

	}

}
