package leetcode;
// 232 / 311 test cases passed. Time Limit Exceeded -  263 / 311 test cases passed.
//Brute force lar testi gecemedi. Q015_2 de testi gecen daha iyisini yazdim. 
import java.util.*;
public class Q015 {
	/*l = new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);

	list.add(l);
	l = new ArrayList<>();
	
	l.add(4);
	l.add(5);
	l.add(6);
	
	list.add(l);*/
	public static List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> list =  new ArrayList<List<Integer>>();
		List<Integer> l; 
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			map.put(nums[i], i);
		}
		
		for(int i=0; i< nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				int search =0 - (nums[i] + nums[j]);
				if(map.containsKey(search) && map.get(search) >i && map.get(search) > j){
					Integer[] array = {nums[i], nums[j],nums[map.get(search)]};
					Arrays.sort(array);
					l = new ArrayList<>(Arrays.asList(array));
						
					if(!list.contains(l)){
						list.add(l);
					}
				}
				
			}	
		}
	return list;

    }

	public static List<List<Integer>> threeSum_(int[] nums) {
	
		List<List<Integer>> list =  new ArrayList<List<Integer>>();
		List<Integer> l; // = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				for(int k=j+1; k<nums.length; k++){
					if((nums[i] + nums[j] + nums[k]) == 0){
						System.out.println(nums[i] + " " +  nums[j] + " " + nums[k]);
						l = new ArrayList<>();
						int max , av, min;
						if(nums[i] > nums[j]){
							max = nums[i];
							min = nums[j];
						}
						else {
							min = nums[i];
							max = nums[j];	
						}
						av = nums[k];
						if(nums[k] >= max){
							av = max;
							max = nums[k];	
						}
						if(nums[k] <= min){
							av = min;
							min = nums[k];	
						} 
						l.add(min);
						l.add(av);
						l.add(max);
						if(!list.contains(l)){
						list.add(l);	
						}
					}
				}	
			}
		}
	return list;

    } 

	public static void main(String[] args) {
		
		
		int[] Array = {-1, 0, 1, 2, -1, -4,0,0};
		
		List<List<Integer>> Array2 = threeSum(Array);
		
		System.out.println(Array2.toString());
		
	}

}
