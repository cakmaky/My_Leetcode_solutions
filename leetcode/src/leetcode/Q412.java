package leetcode;

import java.util.*;
public class Q412 {
	
	public static List<String> fizzBuzz(int n){
		// Basit soru
		List<String> list = new ArrayList<>();
		for(int i = 1; i<=n; i++){
			if(i % 3 == 0 && i % 5 != 0){
				list.add("Fizz");
			}
			else if(i % 3 != 0 && i % 5 == 0){
				list.add("Buzz");
			}
			else if(i % 3 == 0 && i % 5 == 0){
				list.add("FizzBuzz");
			}
			else {
				list.add(Integer.toString(i));	
			}	
		}	
	return list;	
	}
        
    

	public static void main(String[] args) {
		int n = 1;
		List<String> list = new ArrayList<>();
		
		
		System.out.println(fizzBuzz(n).toString());

	}

}
