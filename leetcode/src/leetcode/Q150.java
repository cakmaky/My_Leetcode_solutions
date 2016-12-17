package leetcode;

import java.util.*;
public class Q150 {
	

	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<tokens.length; i++){
			String s = tokens[i];
			if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
				int n2 = stack.pop();
				int n1 = stack.pop();
				switch(s){
				case "+": stack.push(n1+n2); break;
				case "-": stack.push(n1-n2); break;
				case "*": stack.push(n1*n2); break;
				case "/": stack.push(n1/n2); break;
				}	
			} else{	
			stack.push(Integer.parseInt(s));	
			}	
		}
		return stack.pop();
    }
	public static void main(String[] args) {
		
		//String[] tokens = {"2", "1", "+", "3", "*"};
		String[] tokens = {"4", "13", "5", "/", "+"};
		
		System.out.println(evalRPN(tokens)); 

	}

}
