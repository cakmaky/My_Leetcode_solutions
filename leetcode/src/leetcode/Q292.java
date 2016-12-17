package leetcode;

public class Q292 {
	
	public static boolean canWinNim(int n) {
		
		if(n % 4 == 0)
			return false;
		
		return true;
        
    }

	public static void main(String[] args) {
		
		int n = 8;
		System.out.println(canWinNim(n));
	}

}
