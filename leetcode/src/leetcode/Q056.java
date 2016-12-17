package leetcode;

import java.util.*;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Q056 {
	
	public static List<Interval> merge(List<Interval> intervals){
		// 167 / 168 test cases passed.
		if(intervals.isEmpty()){
			return intervals;
		}
		for(int i=0; i<intervals.size();i++){
			Interval max = intervals.get(i);
			int index = i;
			for(int j=i+1;j<intervals.size();j++){
				if(intervals.get(j).start > max.start){
					max = intervals.get(j);
					index = j;
				}
			}
			intervals.remove(index);
			intervals.add(0, max);	
		}
		List<Interval> list2 = new ArrayList<>();
		list2.add(intervals.get(0));		
		for(int i=1; i<intervals.size(); i++){
			Interval prev = list2.get(list2.size()-1);
			Interval curr = intervals.get(i);	
			if(curr.start <= prev.end){
				list2.remove(list2.size()-1);
				Interval newint = new Interval(prev.start,Math.max(prev.end, curr.end)); 
				list2.add(newint);			
			} else{
				list2.add(curr);
			}	
		}
		return list2;   
    }
	
	public static void main(String[] args) {
		
		List<Interval> list = new ArrayList<>();
		Interval inter1 = new Interval(1,3);
		list.add(inter1);
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		
		list = merge(list);
		for(Interval i: list){
			System.out.println("["+ i.start + "," + i.end + "]");
			
		}

	}

}
