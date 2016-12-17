package leetcode;

public class Q344 {
	
	public static String reverseString(String s) {
	// bu fonsiyon time limiti gecemedi.  475 / 476 test cases passed.	
		String reverse = "";
		int length = s.length();
		
		for(int i=0; i<length; i++){
			//reverse += (s.charAt(length-1-i) + "");
			reverse = reverse.concat(s.charAt(length-i-1) + "");
			
			
		}
		return reverse;
        
    }
	public static String reverseString2(String s) {
	// bu daha hizli calisti	
		int length = s.length();
		char[] arr = s.toCharArray();
		
		for(int i=0; i< length / 2; i++){
			char temp = arr[i];
			arr[i] = arr[length-1-i];
			arr[length-1-i] = temp;
		}
		
	
		return new String(arr);
			
	}
	
	public static void main(String[] args) {
		
		String s = "hello";
		
		System.out.println(reverseString2(s));
	}

}
