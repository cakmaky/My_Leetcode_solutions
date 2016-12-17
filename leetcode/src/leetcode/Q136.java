package leetcode;
// Bit manipulation ile daha hizli yapilabiliyor
import java.util.*;
public class Q136 {
	
	public static int singleNumber(int[] nums){
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++){
			
			if(!map.containsKey(nums[i])){
				map.put(nums[i], i);
			} else {
				map.remove(nums[i]);
			}	
		}
		
		Set<Integer> keys =  map.keySet();
		for(Integer key: keys){
			result = key;
		}
		return result;
    }

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,4,3,1,5};
		
		System.out.println(singleNumber(array));

	}

}
