package leetcode;

public class Q338 {
	
	public static int[] countBits_klasik_yonten(int num){
		// Bit manipulation ile kolayca cozumu var. Bu fonksiyon submit i gecti 
		int[] result = new int[num+1];
		for(int i=0; i<=num; i++){
			int n = i;
			int count = 0;
			while(n != 0){
				n= n & (n-1);
				count++;
			}
			result[i] = count;
		}
	 return result;
    }

	public static int[] countBits(int num){
	//	0 1 - 1 2 - 1 2 2 3 - 1 2 2 3 2 3 3 4	gibi bi sequence var, bunu yazdirdim.
		int[] result = new int[num+1];
		if(num == 0){
			result[0] = 0;
			return result;
		}
		result[0] = 0;
		result[1] = 1;
		int x = 1, y=1, m=0;
		for(int i=2; i<=num; i++){	
			if(x == 2*y && m==0){
				x = y;
				m =1;
			}
			if(x == 2*y && m==1){
				x = i/2;
				y = x;
				m= 0;
			}
			result[i] = result[x] + m;
			x++;			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int n=5;
		
		int[] array = countBits(n);
		
		for(int i: array){
			System.out.print(i + " "); 
		}

	}

}
