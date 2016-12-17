package leetcode;

// Binary tree sorusu imis
public class Q238 {

	
	public static int[] productExceptSelfold(int[] nums){
		//With devision and O(n). Inputta 0 varsa calismiyo
		int mult = 1;
		for(int i=0; i< nums.length; i++){
			mult *= nums[i];
		}

		for(int i=0; i< nums.length; i++){
			nums[i] = mult / nums[i];
		}
	
			return nums;
		}
	
	public static int[] productExceptSelf_old(int[] nums){
		// iki array tanimlayip yaptim. daha anlasilir
		int length = nums.length;
		int[] left = new int[length];
		int[] right = new int[length];
		
		left[0] = 1;
		for(int i=1;i<length;i++){
			left[i] = left[i-1] * nums[i-1];
		}
		right[length -1] = 1;
		for(int i = length -2; i>=0; i--){
			right[i] = right[i+1] * nums[i+1];	
		}
		
		for(int i=0;i<length;i++){
			nums[i] = left[i] * right[i];	
		}
		
		return nums;
	}
	public static int[] productExceptSelf(int[] nums){
		// tek array tanimlamak  yeterli. discussion daki idea
		int length = nums.length;
		int[] result = new int[length];
		result[0] = 1;
		for(int i=1;i<length;i++){
			result[i] = result[i-1] * nums[i-1];
		}
		int right = 1;
		for(int i = length -1; i>=0; i--){
			
			result[i] =result[i] * right;	
			right *= nums[i];
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] Array = {1,2,3,4,5};
		int[] Array2 = new int[Array.length];
		
		Array2 =   productExceptSelf(Array);
		for(int i : Array2){
			System.out.print(i + " ");
		}
		

	}

} 
