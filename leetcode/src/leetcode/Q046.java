package leetcode;

import java.util.*;
public class Q046 {
	public static void listAll(List<List<Integer>> list2, List<Integer> list1, List<Integer> arlist,int size){
		if(list1.size() == size){
			list2.add(list1);
		} 
		else {
			for(int i=0; i<arlist.size();i++){
				List<Integer> list3 = new ArrayList<>(list1);
				int elem = arlist.get(i);

				if(!list3.contains(elem)){
					list3.add(elem);
				}else{
					continue;
				}

				listAll(list2,list3, arlist,size);
			}
		}

	}
	public static List<List<Integer>> permute(int[] nums) {

		int size = nums.length;
		List<Integer> arlist = new ArrayList<>();
		for(int i:nums){
			arlist.add(i);
		}
		List<Integer> list1 = new ArrayList<>();
		List<List<Integer>> list2 = new ArrayList<>();

		listAll(list2, list1, arlist,size);
		return list2;

	}

	public static void main(String[] args) {
		int[] nums = {1,2,3};

		List<List<Integer>> list = permute(nums);

		System.out.println(list.toString());


	}

}
