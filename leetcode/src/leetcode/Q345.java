package leetcode;

import java.util.*;
public class Q345 {
	
	public static String reverseVowels_(String s) {
		// son test case i gecemedi
		Character[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		Set<Character> set = new HashSet<>(Arrays.asList(arr));  
		
		int left = 0;
		int right =s.length()-1;
		while(left < right){
			//if(!(s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u')) {
			if(!set.contains(s.charAt(left))){
				left++;
			}
			//else if(!(s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u')) {
			else if(!set.contains(s.charAt(right))){
				right--;
			} else if(s.charAt(left) == s.charAt(right)){
				left++;
				right--;
			} else {	
				
			String first = s.substring(0, left);
			String middle = s.substring(left+1, right);
			String last="";
			if(right != s.length()-1){
			      last =s.substring(right+1);
			}
			s = first + s.charAt(right) + middle + s.charAt(left) + last;
			//s= s.substring(0, left).concat(s.charAt(right) + "").concat(s.substring(left+1, right)).concat(s.charAt(left) + "").concat(t); 
			left++;
			right--;
		
		}
		}
		return s;
	
    }

	public static String reverseVowels(String s) {
		// submit i gecti
		Character[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		Set<Character> set = new HashSet<>(Arrays.asList(arr));  
		
		char[] A= s.toCharArray();
		
		int left = 0;
		int right =s.length()-1;
		while(left < right){
			if(!set.contains(A[left])){
				left++;
			}
			else if(!set.contains(A[right])){
				right--;
			} else {	
				
			char dummy = A[left];
			A[left] = A[right];
			A[right] = dummy;
			left++;
			right--;
			}
		}
		s= String.copyValueOf(A);
		return s;
	
    }
	
	public static void main(String[] args) {
		
		String s = "leetcode";
		System.out.println(reverseVowels(s)); 
 		

	}

}
