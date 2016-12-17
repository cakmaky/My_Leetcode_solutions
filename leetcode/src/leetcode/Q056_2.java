package leetcode;

import java.util.*;

public class Q056_2 {	
	// 168 / 168 test cases passed. Merge sort yazdim yine time limit e takildi
	public static List<Interval> combine(List<Interval> list1, List<Interval> list2){
		if(list1.isEmpty()){
			return list2;
		}
		if(list2.isEmpty()){
			return list1;
		}
	
		List<Interval> list = new LinkedList<>();
		while(!list1.isEmpty() && !list2.isEmpty()){
			if(list1.get(0).start < list2.get(0).start){
				list.add(list1.get(0));
				list1.remove(0);
			}
			else if(list1.get(0).start == list2.get(0).start){
				if(list1.get(0).end > list2.get(0).end){
					list.add(list1.get(0));
					list1.remove(0);
				} else {
					list.add(list2.get(0));
					list2.remove(0);
				}	
			}
			else {
				list.add(list2.get(0));
				list2.remove(0);
			}	
		}
		while(!list1.isEmpty()){
			list.add(list1.get(0));
			list1.remove(0);	
		}
		while(!list2.isEmpty()){
			list.add(list2.get(0));
			list2.remove(0);
		}
		return list;	
	}
	public static List<Interval> merge(List<Interval> intervals){
		if(intervals.size() == 0 || intervals.size() == 1){
			return intervals;
		}
	
		int mid = intervals.size()/2;
		List<Interval> list1 = new ArrayList<>();
		List<Interval> list2 = new ArrayList<>();
		
		for(int i=0; i<mid; i++){
			list1.add(intervals.get(i));	
		}
		for(int i=mid; i<intervals.size(); i++){
			list2.add(intervals.get(i));	
		}
		 list1 = merge(list1);
		 list2 = merge(list2);
		 List<Interval> list = combine(merge(list1), merge(list2));
		 list = overlap(list);
		return list;
	}
	public static List<Interval> overlap_(List<Interval> intervals){
		List<Interval> list2 = new ArrayList<>();
		list2.add(intervals.get(0));		
		for(int i=1; i<intervals.size(); i++){
			Interval prev = list2.get(list2.size()-1);
			Interval curr = intervals.get(i);	
			if(curr.start <= prev.end){
				if(curr.end <= prev.end){
					continue;
				}
				list2.remove(list2.size()-1);
				Interval newint = new Interval(prev.start,Math.max(prev.end, curr.end)); 
				list2.add(newint);			
			} else{
				list2.add(curr);
			}	
		}
		return list2;   	
	}
	public static List<Interval> overlap(List<Interval> intervals){
		List<Interval> list = new ArrayList<>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		
		for(int i=1; i<intervals.size(); i++){
			if(intervals.get(i).start <= end){
				end = Math.max(end, intervals.get(i).end);
			} else {
				list.add(new Interval(start, end));
				start = intervals.get(i).start;
				end = intervals.get(i).end;
			}	
		}
		list.add(new Interval(start,end));
		return list;
	
	}
	
	public static void main(String[] args) {
		List<Interval> list = new LinkedList<>();
		Interval inter1 = new Interval(1,3);
		list.add(inter1);
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		
		List<Interval> list2 = merge(list);
		//for(Interval i: list2){
		for(int i=0; i<list2.size(); i++){
			System.out.println("["+ list2.get(i).start + "," + list2.get(i).end + "]");
			
		}

	}

}
