package leetcode;

public class Q191 {
	
	public static int hammingWeight_classic(int n) {
	// 315/ 600 test cases passed.	
		int count = 0;
		while(n > 0){
			
			count += n % 2; 
			n /= 2;
		}
		return count;
	    
    }
	public static int hammingWeight(int n) {
	// passed from all test cases	
		return Integer.bitCount(n);	
	}
	
	public static int hammingWeight2(int n) {
	// passed from all test cases
		int count = 0;
		String s = Integer.toBinaryString(n);
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == '1'){
				count++;
			}
		}
		return count;
	}
	
	public static int hammingWeight3(int n) {
		
		int count = 0;
		while(n != 0){
			count++;
			n &= (n-1);	
		}
		return count;	
	}
	
	
	public static void main(String[] args) {
		
		int n  = 87535746;
		
		System.out.println(hammingWeight_classic(n));
		System.out.println(hammingWeight(n));
		System.out.println(hammingWeight2(n));
		System.out.println(hammingWeight2(n));
		
		

		//System.out.println(k); 
		
		

	}

}
