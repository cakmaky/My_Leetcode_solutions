package leetcode;

public class Q246 {
	
	public static boolean isStrobogrammatic(String num) {
		
		int length = num.length();
				
		for(int i=0; i< (length/2 + 1); i++ ){
			
			char first = num.charAt(i);
			char second = num.charAt(length-1-i);
			
			if(first == '6' && second != '9')
				return false;
			if(first == '9' && second != '6')
				return false;
			if(first == '1' || first == '8' || first == '0'){
				if(first != second)
					return false;
			}
			if(first == '2' || first == '3' || first == '4' || first == '5' || first == '7'){
				return false;
			}
			
		}
		
        return true;
    }
	
	

	public static void main(String[] args) {
		
		String num = "2";
		
		System.out.println(isStrobogrammatic(num));
		

	}

}
