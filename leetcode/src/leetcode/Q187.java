package leetcode;
import java.util.*;
public class Q187 {
	public static List<String> findRepeatedDnaSequences_(String s) {
		// aslinda map cok uygun degil. set ile yapilmali
		Map<String,Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		
		for(int i=0; i<s.length()-9; i++){
			String sub = s.substring(i, i+10);
			
			if(!map.containsKey(sub)){
				map.put(sub, i);
			} 
			else {
				if(!list.contains(sub)){
				list.add(sub);
				}
			}	
		}
		
		return list;
		   
    }

	public static List<String> findRepeatedDnaSequences(String s) {
		// bu cozum daha iyi ama nedense time complexitysi digerinden yuksek.
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		for(int i=0; i<s.length()-9; i++){
			String sub = s.substring(i, i+10);
			if(!set.contains(sub)){
				set.add(sub);
				
			} 
			else {
				if(!list.contains(sub)){
				list.add(sub);
				}
			}	
		}
		
		return list;
		   
    }
	

	public static void main(String[] args) {
		
		//String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		String s = "AAAAAAAAAAA";
		
		List<String> result = findRepeatedDnaSequences(s);
		
		System.out.println(result.toString());
		

	}

}
