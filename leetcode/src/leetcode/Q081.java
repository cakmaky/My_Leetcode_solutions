package leetcode;

public class Q081 {
	
	public static boolean search(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		
		 return rotatedSearch(nums, target, start ,end);   
    }

	public static boolean rotatedSearch(int[] nums, int target, int start, int end){
		int mid = (start + end) /2;
		if(nums[start] == target || nums[end] == target || nums[mid] == target){
			return true;
		}
		if((end - start) == 0 || (end - start) == 1 ){
			return false;
		}
		if(nums[start] == nums[mid] && nums[mid] == nums[end] ){
			return rotatedSearch(nums, target, ++start, --end);
		}
		else if(nums[start] <= nums[mid]){
			if(nums[start] < target && target < nums[mid]){
				return rotatedSearch(nums, target, start, mid);
			} else {
				return rotatedSearch(nums, target, mid, end);
			}	
		} else if(nums[mid] <= nums[end]){
			if(nums[mid] < target && target < nums[end]){
				return rotatedSearch(nums, target, mid, end);	
			} else {
				return rotatedSearch(nums, target, start, mid);
			}
			
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		int[] nums = {1,3,1,1,1};
		System.out.println(search(nums,3)); 
		
		

	}

}
