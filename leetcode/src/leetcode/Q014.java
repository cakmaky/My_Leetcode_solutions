package leetcode;

public class Q014 {

	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length == 0){
			return "";
		}
		String result = "";
		boolean exit = false;
		for(int i=0; i<strs[0].length(); i++){
			result += strs[0].charAt(i);
			for(int j=1; j<strs.length; j++){
				
				if( !(strs[j].startsWith(result))){
					exit = true;
					result = result.substring(0, result.length()-1);
					break;
				}		
			}
			
			if(exit == true){
				break;
			}	
		}
				
		return result;	  
    }
	
	public static void main(String[] args) {
		
		String[] array = {"asdcbh", "asdklmn", "asdtrieu"};
		//String[] array = {""};
		
		System.out.println("The longest common prefix  is : " + longestCommonPrefix(array));
	
	}

}
