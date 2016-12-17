package leetcode;

import java.util.ArrayList;

public class Q409 {

	public static int longestPalindrome(String s) {
		ArrayList<Character> Array = new ArrayList<>();
		for(int i=0; i<s.length(); i++){
			Array.add(s.charAt(i));	
			System.out.print(Array.get(i));
		}
		System.out.println();
		int count = 0;
		int i=0, j;
		while(i<Array.size()){    
			 j= i + 1 ;          				
		    while(j<Array.size()){    	
			
					if(!(Array.get(i).equals(Array.get(j)))){
						j++;
					
					}	
					else{	
						System.out.println(Array.get(i));
						System.out.println(Array.get(j));
						count += 2;
						Array.remove(i);
						i--;
						j--;
						Array.remove(j);
					
						break;
					}
					
			}
		    i++;
		}
		if(Array.size() > 0){
			count++;
		}
		
     return count;
    }

	public static void main(String[] args) {
		
		String s = "abcdefdecba";
		int result = longestPalindrome(s);
		System.out.println(result);
		
 
	}

}
