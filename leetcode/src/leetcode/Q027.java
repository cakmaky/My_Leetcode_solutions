package leetcode;

public class Q027 {
 //	
	public static int removeElement(int[] nums, int val){
		if(nums.length == 0){
			return 0;
		}
		int index = 0;
		int next = 1;
		while(next < nums.length){	
			if(nums[index] == val){
				nums[index] = nums[next];
				nums[next] = val;
				next++;		
			} else {
				index++;
				next = index +1;				
			}	
		}
		if(nums[index] == val){
			index--;
		}
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i] +  " ");
			}
        return index + 1;
    }

	public static void main(String[] args) {
		
		int[] array = {1,2,3,3,3,4,4,5,6,7,3};
		int val = 3;
		
		System.out.println("Answer is " + removeElement(array,val));
		

	}

}
