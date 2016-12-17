package leetcode;

public class Q069 {
	
	public static int mySqrt_(int x) {
		if(x == 0){
			return 0;
		}
		else if(x >= 1 && x<=3){
			return 1;
		}
		int i = 2;
		int result = 1;
		while(x != 1){
			if(x % (i*i) == 0){
				x /= (i*i);
				result *= i;
			}
			else {
			i++;
			}
		}
		return result;
    }
	
	public static int mySqrt(long x){
		
		
		long result = 0;
		for(long i=0; i<50000;i++){
			//System.out.println(i*i);
			if( x >= (i*i) && x < ((i+1) * (i+1))){
				result = i;
				break;
			}
		}
		return (int)result;
		
	}

	public static void main(String[] args) {
	
		long x = 2147395600;
		
		System.out.println("result is " +mySqrt(x));

	}

}
