package leetcode;

// static, global variable tanimlayinca kod dogru olsa bile submitte hata veriyor. statik ve global dan sakin. 
// counter i fonksiyon icinde tanimlayinca cok iyi sonuc verdi.
public class Q202 {
	public static boolean isHappy(int n) {
		int total = 0;
		int count = 0;
		while(true){
			
			while(n > 0){
				int digit = n % 10;
				total += digit*digit;
				n /= 10;
			}
			if(total == 1 || total == 10 || total == 100){
				return true;
			} 
			if(count == 20){
				return false;
			}
			n = total;
			total = 0;
			count++;
			continue;
		}
		
		
	}
	

	
	public static void main(String[] args) {
		
		int number = 7;
		System.out.println(isHappy(number));

	}

}
