package leetcode;

public class Q034 {
	
	public static int[] searchRange(int[] nums, int target){
		
		int[] result = new int[2];
		boolean found = false;
		int low = 0;
		int high = nums.length -1;
		int mid = (low + high) / 2;
		while(low <= high && found == false){
			if(nums[mid] == target){
				found = true;
				result[0] = mid;
				result[1] = mid;
				while(result[0]>=1){
					result[0] --;
					if(nums[result[0]] == target){
						continue;
					}
					else {
						result[0] ++;
						break;
					}	
				}
				while(result[1]< (nums.length -1)){
					result[1] ++;
					if(nums[result[1]] == target){
						continue;
					}
					else {
						result[1] --;
						break;
					}	
				}	
			}
			else if(nums[mid] > target){
				high = mid -1;
			}
			else {
				low =  mid + 1;
			}
			
			mid = (low + high) / 2;	
		}
		if (found == false){
			result[0] = -1;
			result[1] = -1;
			return  result;
		}	
		return result;		
		}
		
        
  

	public static void main(String[] args) {
		
		int[] array = {1};
		int target = 1;
		
		int[] result = new int[2];
		
		result = searchRange(array, target);
		
		System.out.println(result[0] + " " + result[1]);

	}

}
