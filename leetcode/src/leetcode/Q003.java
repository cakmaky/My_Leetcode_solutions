package leetcode;

import java.util.Scanner;

public class Q003 {

public static int lengthOfLongestSubstring(String s) {
	
	String sub = "";
	int count = 0;
	for(int i=0; i<s.length(); i++){
		
		if(!(sub.contains(s.charAt(i) + ""))){
			sub = sub + s.charAt(i);
			if(sub.length() > count){
				count = sub.length();
			}
			
		}
		else {	
			if(sub.length() > count){
				count = sub.length();
			}
			sub = sub.substring(sub.indexOf(s.charAt(i)) + 1) + s.charAt(i);
			if(sub.length() > count){
				count = sub.length();
			}
		}	
		if(sub.length() > count){
			count = sub.length();
		}
		
		
	}
	
	return count;   
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to find longest substring without repeating characters:");
		String s = sc.nextLine();
		
		System.out.println("The result is " + lengthOfLongestSubstring(s));  
		
	}

}
