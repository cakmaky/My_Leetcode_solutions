package leetcode;

public class Q231 {
	
	public static boolean isPowerOfTwo_(int n) {
		// benim cozum submiti gecti
		
		if(n==0){
			return false;
		}
		
		while(n != 1){	
			if(n % 2 == 0){
				n /=2;
				continue;
			} else{
				return false;
			}	
		}
		return true;
    }
	public static boolean isPowerOfTwo__(int n) {
		// 2 nin kati en buyuk int i kullanarak
		return n>0 && (1073741824 % n == 0);	
	}
	
	public static boolean isPowerOfTwo(int n) {
		// most concise;
		return n>0 && (n& (n-1)) == 0;	
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPowerOfTwo(2)); 
		

	}

}
