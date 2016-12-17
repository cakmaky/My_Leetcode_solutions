package leetcode;

public class Q072 {
	
	public static int minDistance(String word1, String word2) {
		int m = word1.length();
		int n= word2.length();
		int[][] arr = new int[n+1][m+1];
		for(int i=0; i< n+1 ; i++){
			arr[i][0] = i;
		}
		for(int j=0; j< m+1; j++){
			arr[0][j] = j; 
		}
		for(int i=1; i< n+1 ; i++){
			for(int j=1; j<m+1; j++){
				if(word1.charAt(j-1) == word2.charAt(i-1)){
					arr[i][j] = arr[i-1][j-1];
				} else{
					arr[i][j] = (Math.min(Math.min(arr[i-1][j], arr[i][j-1]), arr[i-1][j-1]) +1);	
				}	
				}
		}
		return arr[n][m];    
    }

	public static void main(String[] args) {
		
		String word1 = "abcdef";
		String word2 = "azced";
		
		System.out.println(minDistance(word1,word2));
		

	}

}
