package leetcode;

public class Q283 {
	public static void moveZeroes2(int[] nums) {
		for(int i = 0; i< nums.length; i++){
			for(int j = i+1; j< nums.length; j++){
				if(nums[i] == 0 && nums[j] != 0){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					break;
				}
				}
			}
				for(int i: nums){
				System.out.print(i + " ");	
			}	
		}
		
		
	public static void moveZeroes(int[] nums){			
		int index = 0;
		for(int i = 0; i< nums.length; i++){
			if(nums[i] != 0){
				nums[index]  = nums[i];
				index++;
			}	
		}
		
		for(int i= index; i<nums.length; i++){
			nums[i] = 0;
		}
		
		for(int i: nums){
			System.out.print(i + " ");	
		}
		
	}
		
	public static void main(String[] args) {
		
		
		int[] nums = {0,1,0,3,0,1,2,0,0,6,0,8,0,3,4,5,6,12};
		
		moveZeroes(nums);

	}

}
