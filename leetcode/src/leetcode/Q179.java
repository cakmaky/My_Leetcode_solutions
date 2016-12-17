package leetcode;

public class Q179 {
	
	public static String largestNumber(int[] nums) {
		
		for(int i=0; i<nums.length;i++){
			for(int j=0; j<nums.length-1; j++){
				String s1 = "" + nums[j] + nums[j+1];
				String s2 = "" + nums[j+1] + nums[j];
				if(s2.compareTo(s1) > 0){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}	
			}
		}
		String result = "";
		for(int i=0; i<nums.length; i++){
			result += nums[i];
		}
		while(result.charAt(0) == '0' && result.length() > 1){
			result = result.substring(1);
		}
		return result;      
    }

	public static void main(String[] args) {
		int[] nums = {0,0,0};
	
		System.out.println(largestNumber(nums)); 
		
		
		//System.out.println("95".compareTo("951"));
		

	}

}
