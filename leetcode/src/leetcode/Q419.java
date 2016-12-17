package leetcode;

public class Q419 {
	
	public static int countBattleships(char[][] board) {
	// board u modify ede ede gittim. Modify etmeden de cozuluyor.
	// solunda ve ustunde X olmayan her X degerini sayinca da cikiyor.
		int count = 0;
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){
				if(board[i][j] == 'X'){
					count++;
					int m = i;
					int n = j;
				while((m+1) < board.length && board[m+1][n] == 'X'){
					board[m+1][n] ='.';
					m++;
				}
					
				while((n+1) < board[m].length && board[m][n+1] == 'X'){
					board[m][n+1] ='.';
					n++;
				}
						
				}
			
			}
		}
		return count;    
    }

	public static void main(String[] args) {
		
		//char[] board = {"'X','.','.','X'","...X","...X"};
	//	System.out.println(countBattleships(board));
		

	}

}
