package leetcode;

import java.util.*;
public class Q205 {
	
	public static int calculateHashCode(char c){
		return  (c + "").hashCode();
	}
	
	public static boolean isIsomorphic(String s, String t) {
		boolean result = true; ;
		Map<Integer, Character> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++){
			int code = s.charAt(i);
			char c = t.charAt(i);
			
			if(!map.containsKey(code) && !map.containsValue(c)){
					map.put(code, t.charAt(i));
			}
			else {
				
				if(map.get(code) == null ||map.get(code) != c ){
					return false;
				}	
			}
				
		}
	
        return result;
    }

	public static void main(String[] args) {
		
		String s = "paper";
		String t = "title";		
		System.out.println(isIsomorphic(s,t));

	}

}
