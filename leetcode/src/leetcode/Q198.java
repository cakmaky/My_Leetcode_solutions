package leetcode;
// discussion daki en iyi cozumu yazdim
public class Q198 {
	public int rob(int[] nums){
		int even = 0;
		int odd = 0;
		
		for(int i=0; i<nums.length; i++){
			if(i % 2 == 0){
				even = Math.max(even + nums[i], odd);	
			} else {
				odd = Math.max(odd + nums[i], even);	
			}		
		}
		return Math.max(even, odd);   
    }

	public static void main(String[] args) {
		

	}

}
