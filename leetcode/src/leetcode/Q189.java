package leetcode;

public class Q189 {
	

	public static void rotate(int[] nums, int k) {
		// extra array tanimlayip yaptim
		k = k % nums.length;
		int[] arr = new int[nums.length];
		for(int i=0; i< nums.length; i++){
			arr[i] = nums[(nums.length -k+i) % nums.length];	
		}
		for(int i=0; i<nums.length;i++){
			nums[i] = arr[i];
		}

		for(int i:nums)
		System.out.println(i);    
    }
	public static void rotate_(int[] nums, int k) {
		// editorial solution a bakip yazdim
		k %= nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
		
		for(int i:nums)
			System.out.println(i);
	}
	public static void reverse(int[] nums, int start, int end){
		while(start< end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;	
			start++;
			end--;
		}	
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr, 3);
		

	}

}
