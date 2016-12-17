package leetcode;

public class Q289 {
	
	public static int compute(int[][] board, int row, int col){
		int r = board.length;
		int c = board[0].length;
		int sum = 0;
		for(int i = Math.max(row-1, 0); i<=row+1 && i < r; i++){
			for(int j=Math.max(col-1, 0); j<=col+1 && j < c; j++){
				sum += board[i][j];
			}
		}
		sum -= board[row][col];
		return sum;
	}
	
	public static void gameOfLife(int[][] board){
		int[][] arr = new int[board.length][board[0].length];	
		for(int i=0; i<board.length;i++){
			for(int j=0; j<board[0].length;j++){
				//int sum = board[i-1][j] + board[i+1][j] + board[i][j-1] + board[i][j+1] + board[i+1][j+1] + board[i-1][j-1] + board[i-1][j+1] + board[i+1][j-1];                                  
				int sum = compute(board,i,j);
				if(board[i][j] == 1){
					if(sum <2 || sum > 3){
						arr[i][j] = 0;
					}else {
						arr[i][j] = 1;
					}
				} else {
					if(sum == 3){
						arr[i][j] = 1;
					}		
				}	
			}
		}
		
		for(int i=0; i<board.length;i++){
			for(int j=0; j<board[0].length;j++){
				board[i][j] = arr[i][j];
			}
		}   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
