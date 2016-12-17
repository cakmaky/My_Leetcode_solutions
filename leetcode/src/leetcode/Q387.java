package leetcode;

import java.util.*;

public class Q387 {
	
		public static int firstUniqChar_(String s) {
		// accepted solution with HashMap	
			Map<Character, Integer> map = new HashMap<>();
			for(int i=0; i<s.length();i++){
				if(!map.containsKey(s.charAt(i))){
					map.put(s.charAt(i), 1);
				} else {
					map.put(s.charAt(i), map.get(s.charAt(i))+1);	
				}
			}
			for(int i=0; i<s.length();i++){
				if(map.get(s.charAt(i)) == 1){
					return i;
				}
			}
			return -1;
		}
		public static int firstUniqChar(String s) {
		// faster solution with defining an array with size 26 for each lowercase character
			int[] arr = new int[26];
			for(int i=0; i<s.length();i++){
				arr[s.charAt(i) - 'a']++;
			}
			for(int i=0; i<s.length();i++){
				if(arr[s.charAt(i) - 'a'] == 1){
					return i;
				}
			}
			return -1;
		}
		
		public static void main(String[] args) {
		String s = "loveleetcode";

		System.out.println(firstUniqChar(s)); 

	}

}
