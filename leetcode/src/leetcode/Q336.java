package leetcode;

import java.util.*;
public class Q336 {
	
	public static boolean isPalindrome(String s){
		for(int i=0; i<s.length();i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
	public static List<List<Integer>> palindromePairs(String[] words) {
		List<Integer> small;
		List<List<Integer>> list =  new ArrayList<>();
		for(int i=0; i<words.length;i++){
			for(int j=i+1; j<words.length; j++){
				if(isPalindrome(words[i].concat(words[j]))){
					small = new ArrayList<>();
					small.add(i);
					small.add(j);
					list.add(small);
					
				}
				if(isPalindrome(words[j].concat(words[i]))){
					small = new ArrayList<>();
					small.add(j);
					small.add(i);
					list.add(small);	
				}
				 
			}
		}
		return list;
		
		
		
        
    }

	public static void main(String[] args) {
		
		String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
		
		List<List<Integer>> list = palindromePairs(words);
		System.out.println(list.toString());

	}

}
