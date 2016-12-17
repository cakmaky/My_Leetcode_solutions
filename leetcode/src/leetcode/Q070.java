package leetcode;
// bu soruda fibonacci gibi bir cevap cikiyor. Formulu bulunca gerisi kolay.
public class Q070 {	
	public static int climbStairs(int n) {	
		if(n== 0 || n== 1 || n==2){
			return n;
		}
		int s1 = 1;
		int s2 = 2;
		int res = s1 + s2;
		for(int i=3; i<= n; i++ ){
				res = (s1 + s2);    // degerleri birbirine atarken dikkat et. sira onemli
				s1 = s2;	
				s2= res;
		}
		return res;  
    }

	public static void main(String[] args) {
		
		int n = 4;
		
		System.out.println(climbStairs(n));
		
	}

}
