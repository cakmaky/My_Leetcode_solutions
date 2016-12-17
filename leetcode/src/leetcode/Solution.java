package leetcode;

import java.util.*;
public class Solution {
	
	private LinkedList<Integer> list;
    public Solution(int[] nums) {
    	list = new LinkedList<>();
    	for(int i=0; i<nums.length; i++){
    		list.add(nums[i]);
    	}
    	
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset(){
    	int[] arr = new int[list.size()];
    	for(int i=0; i<list.size(); i++){
    		arr[i] = list.get(i);
    	}
    	return arr;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle(){
    	int size = list.size();
    	LinkedList<Integer> list2 = new LinkedList<>(list);
    	int[] arr = new int[size];
    	for(int i=0; i<size; i++){
    		int rand = (int)(Math.random()*list2.size());
    		arr[i] = list2.remove(rand);	
    	}
    	return arr;   
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
