package leetcode;

public class Q058 {
	
	public static int lengthOfLastWord(String s){
		int result;
		int index;
		if(s.length() == 0){
			result = 0;
		}
		else if(!(s.contains(" "))){
			result = s.length();
		}
		//else if(s.charAt(s.length()-1) == ' '){
		//	index = s.substring(0, s.length()-1).lastIndexOf(' ');
		//	result = s.substring(index + 1).length()-1;
		//}
		else {
			
			while(s.charAt(s.length()-1) == ' '){
				s = s.trim();
				if(s.length() == 0){
					break;
				}
			}
			
			index = s.lastIndexOf(' ');
			result = s.substring(index+1).length();
			
		}
		
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " ";
		System.out.println(lengthOfLastWord(s));

	}

}
