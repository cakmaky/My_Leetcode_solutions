package leetcode;

import java.util.*;
public class Q228 {
	
	public static List<String> summaryRanges(int[] nums) {
		
		List<String> list = new ArrayList<>();
		if(nums.length == 1){
			list.add(nums[0] + "");
			return list;
		}
		String s = "";
		for(int i=0; i<nums.length-1; i++){
			if(nums[i] != (nums[i+1] - 1)){
					s+= nums[i];
					list.add(s);
				    s= "";	
			} else{
				if(s.length() == 0){
					s += nums[i];
				}
				if(s.length()>0 && s.charAt(s.length()-1) != '>'){
					s += "->";
				}	
			}
		}
		if(nums.length !=0){
		s += nums[nums.length-1];
		list.add(s);
		}
		return list;     
    }

	public static void main(String[] args) {
		
		int[] nums ={1,2,3,7,8,10}; 	
		
		List<String> list = summaryRanges(nums);
		
		System.out.println(list.toString()); 

	}

}
