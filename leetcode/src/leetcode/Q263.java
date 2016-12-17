package leetcode;

public class Q263 {
	
	public static boolean isUgly(int num) {
		if(num == 1){
			return true;
		}
		if(num == 0){
			return false;
		}
		while(num != 1){	
			if(num %2 == 0){
				num /= 2;
				continue;
			}
			else if(num % 3 == 0){
				num /= 3;
				continue;
			}
			else if(num % 5 == 0){
				num /=5;
				continue;
			} else {
				return false;
			}	
		}
		return true;
    }

	public static void main(String[] args) {
		
		System.out.println(isUgly(1)); 
		

	}

}
