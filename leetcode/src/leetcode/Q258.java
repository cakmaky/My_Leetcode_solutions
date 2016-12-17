package leetcode;

public class Q258 {
	
	public static int addDigits2(int num) {
	// sayinin rakamlarini toplayip her seferinde sayiya atip 1o dan kucuk olunca dondurdum.
	// submit i gecti
		
		
		while(num > 9){
	    	int count = 0;
				while (num > 0){
					count += num % 10;
					num /= 10;
				}
				num = count;
		}
		
		return num;
        
    }
	
	public static int addDigits(int num) {
	// matematiksel bir kural cikti. sonuc sayinin mod 9 una esit. input 0 olunca ve mod 9  0 olunca case lerini dusun.
        if(num == 0){
            return num;
        }
        if(num % 9 == 0){
			return 9;
		}
		return num % 9;
		
	}

	public static void main(String[] args) {
		
		int num = 98762345;
		
		System.out.println(addDigits2(num)); 
		System.out.println(addDigits(num)); 

	}

}
