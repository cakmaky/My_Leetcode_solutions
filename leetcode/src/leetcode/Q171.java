package leetcode;

public class Q171 {
	
	public static int titleToNumber(String s) {
		
		int res =0;
		for(int i=s.length()-1; i>=0; i--){
			res += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length()-1-i);	
		}
        return res;
    }

	public static void main(String[] args) {
		
		String s= "ABCD";
		
		System.out.println(titleToNumber(s)); 

	}

}
