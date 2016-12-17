package leetcode;

public class Q220 {
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if(nums.length == 0 || nums.length == 1){
			return false;
		}
		for(int i=0; i<nums.length;i++){
			for(int j=i+1; (j-i)<=k && j<nums.length; j++){
				int diff = Math.abs(nums[i] - nums[j]);
				if(diff <= t && diff >0){
					System.out.println( Math.abs(nums[i] - nums[j])); 
					return true;
				}	
			}	
		}
		return false;
    }

	public static void main(String[] args) {
		
		int[] nums = {-1,2147483647};
		
		System.out.println(containsNearbyAlmostDuplicate(nums, 1, 2147483647));
		
	}

}
