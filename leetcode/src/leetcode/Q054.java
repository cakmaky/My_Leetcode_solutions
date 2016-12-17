package leetcode;

import java.util.*;
public class Q054 {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> list = new ArrayList<Integer>(); 
		if(matrix.length == 0 || matrix[0].length == 0){
			return list;
		}
		int i=0;
		int j=0;
		int row = matrix.length;
		int col = matrix[0].length;
		int direction = 1;
		while (true){
			int number = matrix[i][j];
			list.add(number);
			System.out.println(list.toString());
			if(list.size() == (matrix.length * matrix[0].length)){
				break;
			}
			if(direction == 1){
				j++;
			}
			else if(direction == 2){
				i++;
			}
			else if(direction == 3){ 
				j--;
			}
			else if(direction == 4){
				i--;
			}
			
			if(j == col  && direction == 1){
				direction = 2;
				i++;
				j--;
			}
			if(i == row  && direction == 2){
				direction =3;
				i--;
				j--;
			}
			if(j == (matrix[0].length - col)  && direction ==3){
				direction = 4;
				col--;
				row--;
			}
			if(i == (matrix.length - row)  && direction == 4){
				direction = 1;	
			}	
		}
		return list;
    }

	
	
	
	public static void main(String[] args) {
		
    //int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
   //  int[][] matrix = {{1,2,3,1}, {4,5,6,4},{7,8,9,3},{2,3,4,5}};
  // int[][] matrix = {{2,5},{8,4},{0,1}};
     int[][] matrix ={{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
    //spiralOrder(matrix);
    
    List<Integer> list =
    
   list = spiralOrder(matrix);
    
   System.out.println(list.toString());
    
   
	}

}
