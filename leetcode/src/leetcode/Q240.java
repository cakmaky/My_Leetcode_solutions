package leetcode;

public class Q240 {

	public static boolean searchMatrix(int[][] matrix, int target) {

		int row= matrix.length;
		int col= matrix[0].length;

		int i=0, j= col-1;

		while(i<row && j>=0){
			if(matrix[i][j] == target){
				return true;
			}
			else if(matrix[i][j] < target){
				i++;
			} else{
				j--;
			}	
		}
		return false;	      
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};

		System.out.println(searchMatrix(matrix, 24)); 

	}

}
