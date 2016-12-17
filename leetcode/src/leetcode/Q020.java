package leetcode;
 
import java.util.*;

public class Q020 {

	public static boolean isValid(String s) {
		
		boolean result = true;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			}
			else {
				
				if((c == ')' || c == '}' || c == ']') && stack.isEmpty()){
					result = false;
					break;
				} else {
				
				if(c == ')' && stack.peek() == '('){
					stack.pop();
				}
				else if(c == '}' && stack.peek() == '{'){
					stack.pop();
				}
				else if(c == ']' && stack.peek() == '['){
					stack.pop();
				}
				else {
					result = false;
					break;
				}	
			}	
			}
		}
		if(!stack.isEmpty()){
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string to test: ");
		String s = sc.nextLine();

		System.out.println("The result is : " + isValid(s));
	}

} 
