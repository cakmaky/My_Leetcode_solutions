package leetcode;

import java.util.*;
public class Q059 {
	
	public static int[][] generateMatrix(int n) {
		
		int[][] array = new int[n][n];
		int row = n;
		int col= n;
		int r=0;
		int c=0;
		int direction = 1;
		for(int i=1; i<=n*n; i++){
			
			array[r][c] = i;
			if(direction == 1){
				c++;
			}
			else if(direction == 2){
				r++;
			}
			else if(direction == 3){
				c--;
			}
			else if(direction == 4){
				r--;
			}
			
			if(direction == 1 && c== col){
				direction = 2;
				c--;
				r++;
			}
			else if(direction == 2 && r == row){
				direction = 3;
				r--;
				c--;
			}
			else if(direction == 3 && c == (n-col)){
				direction = 4;
				row--;
				col--;
			}
			else if(direction == 4 && r == (n-row)){
				direction = 1;
			}	
			
		}
		return array;
    }

	public static void main(String[] args) {
		
		int n = 4;
		int[][] array = new int[n][n];
		
		
		array = generateMatrix(n);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
			
		}
		
		
		
		//System.out.println(generateMatrix(n).toString());
		

	}

}
