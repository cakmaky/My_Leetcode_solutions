package leetcode;

public class Q048 {
	
	public static void rotate_(int[][] matrix) {
		// ayri bir matrix tanimlayip en son ordaki degeri matrix e attim
		int[][] matrix2 = new int[matrix.length][matrix.length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0; j<matrix[0].length; j++){
				 matrix2[j][matrix.length-1-i] = matrix[i][j];
				
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0; j<matrix[0].length; j++){
				matrix[i][j] = matrix2[i][j];
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
        
    }
	public static void rotate(int[][] matrix) {
		for(int i=0;i<matrix.length / 2;i++){
			for(int j=0; j<matrix[0].length; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length-1-i][j];
				matrix[matrix.length-1-i][j] = temp;	
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=i+1; j<matrix[0].length; j++){
				int temp = matrix[i][j];
				 matrix[i][j] = matrix[j][i];
				 matrix[j][i] = temp;	
				}
			}
		
		
	}
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		

	}

}
