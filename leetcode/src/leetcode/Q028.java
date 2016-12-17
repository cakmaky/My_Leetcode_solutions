package leetcode;
// substring method u ile cok kolay cozuldu.
public class Q028 {

	public static int strStr(String h, String n) {
		if(h.length() == 0 && n.length() == 0){
			return 0;	
		}
		if(n.length() == 0){
			return 0;
		}
		
		for(int i=0; i<h.length(); i++){
			
			if(h.charAt(i) == n.charAt(0) && (i+n.length()<=h.length())){
				if(h.substring(i, i+n.length()).equals(n)){
					return i;
				} else {
					continue;
				}	
		}
		
	}
		return -1;
	}
	public static void main(String[] args) {
		
		String s1 = "aaaaaab";
		String s2 = "aaaaaab";
		
		 System.out.println(strStr(s1,s2));

	}

}
