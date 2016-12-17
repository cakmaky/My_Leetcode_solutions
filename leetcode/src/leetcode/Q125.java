package leetcode;

public class Q125 {
	
	public static boolean isAlphaNumeric(char c){
		if(c >= '0' && c<= '9'){
			return true;
		}
		else if(c >= 'A' && c <= 'Z'){
			return true;
		}
		else if(c >= 'a' && c <= 'z'){
			return true;
		}
		else {
			return false;
		}	
	}
	public static boolean isPalindrome(String s) {
		int starti = 0;
		int endi = s.length() -1;
		boolean result = true;
		while(starti < endi){
			String s1 = s.substring(starti, starti + 1);
			String s2 = s.substring(endi, endi +1);
			
			if(!(isAlphaNumeric(s1.charAt(0)))){
				starti++;		
			}
			else if(!(isAlphaNumeric(s2.charAt(0)))){
				endi--;		
			}
			else if(!(s1.equalsIgnoreCase(s2))){
				result = false;
				break;
			}
			else {
				starti++;
				endi--;	
			}	
			System.out.println(starti);
			System.out.println(endi);
		}
		return result;
    }

	public static void main(String[] args) {
		
		//String s = "A man, a plan, a canal: Panama";
		String s = "0P"	;	
		
		System.out.println(isPalindrome(s));		

	}

}
