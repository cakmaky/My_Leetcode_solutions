package leetcode;

import java.util.*;
public class Q022 {
	public static List<String> generateParenthesis(int n){
		
		List<String> list = new ArrayList<>();
		backtrack(list, "", 0, 0, n);
		return list;
	}
	public static void backtrack(List<String> list, String str, int open, int close, int max){
		if(str.length() == 2*max){
			list.add(str);
			return;
		}
		if(open < max){
			backtrack(list, str + "(", open + 1, close, max);
		}
		if(close < open){
			backtrack(list, str + ")", open, close +1, max);
		}
	
	}
	public static void main(String[] args) {
		
		List<String> list = generateParenthesis(5);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
	}

}
}
