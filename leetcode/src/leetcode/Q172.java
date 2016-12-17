package leetcode;

public class Q172 {
	
	public static int trailingZeroes(int n) {
		
		int count = 0;
		while(n > 0){
			count += n / 5;
			n /=5;
		}
		return count; 
    }

	public static void main(String[] args) {
		int n= 50;
		
		System.out.println(trailingZeroes(n));
	}

}
