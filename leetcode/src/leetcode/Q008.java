package leetcode;

public class Q008 {
	
	public static int myAtoi(String str) {
		
		//if(str.charAt(0) =='+' || str.charAt(0) == '-'){
		//	str = str.substring(1);
		//}
		
		if(str.length() == 0){
			return 0;
		}
		int num = 0;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
			num *= 10;
			num += (str.charAt(i) - '0');
			}
		}
		if(str.charAt(0) == '-'){
			num = -num;
		}
		
		return num;
		
        
    }

	public static void main(String[] args) {
		
		String str = "12345";
		
		System.out.println(myAtoi(str)); 

	}

}
