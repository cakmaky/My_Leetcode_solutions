package leetcode;
// cozumu (m+n -2)! / ((m-1)!* (n-1))!
// faktoriyelleri ayri yapinca overflow veriyor. longla cozmeye calistim, oldu
public class Q062 {
	
	public static int uniquePaths(int m, int n) {
		
		long up = 1;
		int count = 1;
		for(int i=n; i<= (m+n-2); i++){
			up *= i;
			up /= count;
			count++;
		}
		
		return (int)up;
        
    }

	public static void main(String[] args) {
		
		int m=0;
		int n=0;
		
		System.out.println(uniquePaths(m,n));
		

	}

}
