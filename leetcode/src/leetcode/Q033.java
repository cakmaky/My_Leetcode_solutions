package leetcode;

public class Q033 {

	public static int BinarySearch(int[] Array, int target){
		int low = 0;
		int high = Array.length -1;
		int mid = (low + high) / 2;
		
		while( low <= high ){
			if(Array[mid] > target){
				high = mid -1;
			}
			else if(Array[mid] < target){
				low = mid + 1;
			}
			else if(Array[mid] == target){
				return mid;
			}
			mid = (low + high) / 2;	
		}
		return -1;
	}	
	public static int search_(int[] nums, int target) {
		// biraz karisik cozdum, 6-7 ihtimali if le tek tek yazdim. sadelestir. Onemli soru
		int low = 0;
		int high = nums.length -1;
		int mid = (low + high) / 2;
		while(low <= high){
			if(nums[mid] == target){
				return mid;
			}
			System.out.println(nums[mid]);
			if(target >= nums[low] && target <= nums[mid]){
				high = mid ;
			}
			else if(target >= nums[low] && target >= nums[mid] && nums[mid] >= nums[low]){
				low = mid ;
			}
			else if(target <= nums[high] && target <= nums[mid] && nums[mid] > nums[high]){
				low = mid;
			}
			else if((target <= nums[high] && target >= nums[mid] )){
				low = mid ;
			}
			else if(target <= nums[low] && target <= nums[mid] && nums[high] <= nums[mid]){
				low = mid;
			}
			else if(target >= nums[low] && target >= nums[mid] && nums[mid] <= nums[low]){
				high = mid;
			}
			else if(target <= nums[low] && target <= nums[mid] && nums[high] >= nums[mid]){
				high = mid;
			}else {
				return -1;
			}
			mid = (low + high) / 2;	
		}
		return -1;
	
	}
	
	public static int search(int[] nums, int target) {
		// en elegant hali bu. 
		int low = 0;
		int high = nums.length -1;
		int mid = low + (high - low) / 2;
		while(low <= high){
			if(nums[mid] == target){
				return mid;
			}
			if(nums[low] <= nums[mid]){
				if(nums[low] <= target && target <nums[mid]){
					high = mid -1;
				} else {
					low = mid + 1;
				}	
			} else {
				if(nums[mid] < target && target <= nums[high]){
					low = mid +1;
				} else {
					high = mid -1;
				}	
			}
			mid = low + (high - low) / 2;	
		}	
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {3,1};
		
		int index = search(array, 1);
		
		System.out.println("found in " + index);

	}

}
