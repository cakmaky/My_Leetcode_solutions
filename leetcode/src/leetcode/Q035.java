package leetcode;

public class Q035 {
	
	public static int searchInsert(int[] nums, int target) {
        
		boolean found = false;
		int low = 0;
		int high = nums.length -1;
		int mid = (low + high) / 2;
		while(low <= high && found == false){
			
			if(nums[mid] == target){
				found = true;
				break;
			}
			else if(nums[mid] > target){
				high = mid -1;
			}
			else {
				low = mid + 1;
			}
			mid = (low + high) / 2;
		}
		if(found == true){
			return mid;
		}
		else {
			if(nums[mid] > target){
				return mid;
			}
			else{
				return mid + 1;
			}	
		}
		
    }

	public static void main(String[] args) {
		
		int[] array = {1};
		int target = 2;
		
		System.out.println(searchInsert(array, target));
		
		

	}

}
