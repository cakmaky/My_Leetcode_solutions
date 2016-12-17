package leetcode;
// bu cozumum yanlis.
public class Q063 {
	
	public static int uniquePaths(int m, int n) {
		
		if(m == 0 || n == 0){
			return 0;
		}
		long up = 1;
		int count = 1;
		for(int i=n; i<= (m+n-2); i++){
			up *= i;
			up /= count;
			count++;
		}
		
		return (int)up;
        
    }
	
	public static int uniquePathsWithObstacles(int[][] A){
		
		if(A[A.length-1][A[0].length-1] == 1 ){
			return 0;
		}
		int row = 0;
		boolean obs = false;
		for(int i=0; i<A.length; i++){
			
			for(int j=0; j<A[i].length; j++){
				if(A[i][j] == 1){
					obs = true;
				}	
			}
			if(obs == false){
				row++;
			}
			obs = false;
		}
		
		int col = 0;
		boolean obs2 = false;
		for(int i=0; i<A[0].length; i++){
			
			for(int j=0; j<A.length; j++){
				if(A[j][i] == 1){
					obs2 = true;
				}	
			}
			if(obs2 == false){
				col++;
			}
			obs2 = false;
		}
		
		return uniquePaths(row, col);
	     
    }

	public static void main(String[] args) {
		
		int[][] Array =  {{0,0},{0,1}};
		
		
		System.out.println(uniquePathsWithObstacles(Array));

	}

}
