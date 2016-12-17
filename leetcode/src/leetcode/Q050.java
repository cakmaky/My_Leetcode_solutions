package leetcode;

public class Q050 {
	// Aldigim her hata icin tek tek if ekleyerek cozdum. 
	public static double myPow(double x, int n) {

		double result = 0;

		if(n == 0){
			result = 1;
		}
		else if(x == 1.00){
			result = 1;
		}
		else if(x == -1.00){
			if(n % 2 == 0){
				return 1;
			}
			else {
				return -1;
			}
				
		}
		else if(n > 0){

			double mult = 1.0;

			for(int i=1; i<=n; i++){
				mult *= x;
				if(mult == 0){
					return mult;
				}
			}
			result = mult;	
		}
		else {
			double div = 1.0;
			for(int i=-1; i>=n; i--){
				div /= x;
				if(div == 0){
					return div;
				}
			}
			result = div;
		}
		return result;
	}

	public static void main(String[] args) {

		double x = -1.00000;
		int n = -2147483647;

		System.out.println( myPow(x,n) );



	}

}
