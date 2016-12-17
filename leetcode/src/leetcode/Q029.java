package leetcode;
// overflowda ve max degerlerde istedigini tam bulmak zor, onun disinda yaptim.Gicik bir soru.
public class Q029 {
	
	public static int divide(int d1, int d2) {

		if(d2==1){
			if(d1 <= Integer.MAX_VALUE)
				return d1;
		}
		
		if(d2 == 0){
			return Integer.MAX_VALUE;
		}
		int countMinus = 0;
		if(d1 < 0){
			countMinus++;
			d1 = 0 - d1;
			
		}
		System.out.println(d1 + " " + d2);
		if(d1<0){
			if(d2 == 1)
				return d1;
			if(d2 == -1)
				return Integer.MAX_VALUE; 
		
		}
		
		if(d2 < 0){
			countMinus++;
			d2 = 0 - d2;
		}
		
		
		int count = 0;
		int sum = d2;
		
		while (sum<= d1){
			
			sum += d2;
			count++;
					
		}
		if(countMinus == 0 || countMinus == 2 ){
			return count;
		}
		else if(countMinus == 1){
			return (0-count);	
			}
		return 0;
		}
	   
    

	public static void main(String[] args) {
		
		int d1 = 2147483647;
		int d2 = 1;
		
		System.out.println("Result is " + divide(d1,d2)); 
		

	}

}
