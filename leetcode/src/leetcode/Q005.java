package leetcode;
// 91 / 91 test cases passed. TLE. son test case i gecemedi.
public class Q005 {
	public static boolean isPalindrome(String s){
		boolean result = true;
		for(int i=0; i< s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				result = false;
				break;
			}	
		}
		return result;
		
	}
	public static String longestPalindrome(String s){
		
		String longest = "";
		for(int i=0; i<s.length(); i++){
			for(int j=s.length() -1; j>=i; j--){
					if(s.charAt(i) == s.charAt(j) && isPalindrome(s.substring(i, j+1))){
						  
						if((j-i) >= longest.length()){
							//System.out.println(s.substring(i, j+1));
							  longest = s.substring(i, j+1);
				
						  }
						break;
					}
					
			}
			if(longest.length() > (s.length() - 1 - i)){
				break;
			}
		}
		
		return longest;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//System.out.println(isPalindrome(s));
		System.out.println(longestPalindrome(s));

	}

}
