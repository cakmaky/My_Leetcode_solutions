package leetcode;

public class Q153 {

	public static int findMin_(int[] nums){
	// submit i en sonunda gecti ama daha elegant yazilabilir	
		  if(nums.length == 1){
				return nums[0];
			} else if(nums.length == 2){
				if(nums[0] < nums[1]){
					return nums[0];
				} else {
				return nums[1];
				}
			}
			int left = 0;
			int right = nums.length -1;
			int mid = left + (right - left +1) / 2;
			
			while(left <= right){
				if(mid == 0){
					return Math.min(nums[0], nums[1]);
				}
				if(nums[mid] < nums[mid-1]){
					return nums[mid];
				}
				else if(nums[left] > nums[right]){
					if(nums[mid] >= nums[left]){
						left = mid + 1;
					}
					else {
						right = mid -1;
					}	
				} else {
					right = mid -1;
				}
				mid = left + (right - left) / 2;
			}	
			return nums[mid];
		   
	   
    }
	public static int findMin(int[] nums){
		// elegant i bu.  http://articles.leetcode.com/searching-element-in-rotated-array/
		int left = 0;
		int right = nums.length-1;
		int mid = left + (right - left) / 2;
		while(nums[left] > nums[right]){
			if(nums[mid] > nums[right]){
				left = mid + 1;
			} else {
				right = mid;
			}
			 mid = left + (right - left) / 2;
		}
		
		return nums[left];

	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,0};
		System.out.println(findMin(nums));

	}

}
