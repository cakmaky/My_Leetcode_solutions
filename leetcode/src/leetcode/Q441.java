package leetcode;
// binary tree olmadan sistem kabul etmedi
public class Q441 {

	public static int arrangeCoins_(int n) {
		int count = 0;
		int result = 0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				count++;
				if(count == n){
					
					if(i==j){
						result = i;
					}
					else{
						result = (i-1);
					}
					break;
				}	
			}
			if(result > 0){
				break;
			}
			System.out.println(i);
		}
		return result;
    }
	
	public static int arrangeCoins(int n){
		
		int count =0;
		int result = 0;
		for(int i=1; i<=n; i++){
			count++;
			if((result + 1) == count){
				result = count;
			    count = 0;
			}
		
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
		int result = arrangeCoins(846930886);
		System.out.println(result); 
		

	}

}
