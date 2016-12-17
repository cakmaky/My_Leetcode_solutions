package leetcode;

import java.util.*;
public class Q242 {
	// bu fonksiyon calisti, submitten gecti, problem yok
	public static boolean isAnagram_(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}
		char[] sa = s.toCharArray();
		Arrays.sort(sa);
		
		char[] ta = t.toCharArray(); 
		Arrays.sort(ta);
		
		for(int i=0; i<s.length(); i++){
			if(sa[i] != ta[i]){
				return false;
			}	
		}
		
		
      return true;  
    } 
	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()){
			return false;
		}
		int[] array = new int[26];
		Arrays.fill(array, 0);
		
		for(int i=0; i<s.length(); i++){
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			array[c1 -'a'] ++;
			array[c2- 'a']--;	
		}
		
		for(int i=0; i < 26; i++){
			if(array[i] != 0){
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String s = "anagram";
		String t = "nagaramz";
		
		System.out.println(isAnagram(s,t));

	}

}
