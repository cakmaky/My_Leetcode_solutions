package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q119 {
	
	public static List<Integer> getRow(int rowIndex){
		
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		
		if(rowIndex >= 0){
		list1.add(1);
		}
		list.add(list1);
		
		for(int i=1; i<=rowIndex; i++ ){
			
			List<Integer> list2 = new ArrayList<>();
			list2.add(1);
			int index = 0;
			while((index + 1) < list1.size()){
				list2.add(list1.get(index) + list1.get(index + 1));
				index++;
			}
			list2.add(1);
			list.add(list2);
			list1 = list2;	
		}
		return list1;     
    }

	public static void main(String[] args) {
List<List<Integer>> list = new ArrayList<>();
		
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list.add(list1);
		
		list1.add(4);
		list.add(list1);

		list1 = getRow(3);
		
		System.out.println(list1.toString()); 
	}
		

	}


