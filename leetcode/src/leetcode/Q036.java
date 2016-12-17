package leetcode;

import java.util.*;
public class Q036 {
	
	public static boolean isValid(char [] arr){
		Set<Character> set = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			if(arr[i] == '.'){
				continue;
			}
			else if(!set.contains(arr[i]) && arr[i] >= '1' && arr[i] <= '9'){
				set.add(arr[i]);
			} else {
				return false;
			}
		}
		return true;	
	}
	
	public static boolean isValidSudoku(char[][] board) {
		// passed submit. Box is hard . i = 3*(i/3) + j/3   and j = 3*(i%3) + j%3
		int size = board.length;
		char[] row = new char[size];
		char[] col = new char[size];
		char[] box = new char[size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				row[j] = board[i][j];
				col[j] = board[j][i];
				box[j] = board[3*(i/3) + j/3][3*(i%3) + j%3];
				System.out.println(Arrays.asList(row).toString());
			}
			if(!(isValid(row) && isValid(col) && isValid(box))){
				return false;
			}	
		}
		return true;
    }

	public static void main(String[] args) {
		// ["....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"]  false olmali
		// test code for box
		/*for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				//box[j] = board[3*(i%3) + j/3][3*(i%3) + j%3];
				
				int k = 3*(i/3) + j/3;
				int l = 3*(i%3) + j%3;
				System.out.print(k + "," + l + "  ");
				
			}
				System.out.println();
	}*/
		
	}

}
