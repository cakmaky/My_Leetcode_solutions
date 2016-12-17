package leetcode;

public class Q374 {
	// sayi tahmin etme sorusu. klasik binary search
	/* The guess API is defined in the parent class GuessGame.
	   @param num, your guess
	   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
	      int guess(int num); */
/*
	public class Solution extends GuessGame {
	    public int guessNumber(int n) {
	        int left = 0;
	        int right = n;
	        int  rand = left + (right-left)/2;
	        while(left<=right){
	            if(guess(rand) == 0){
	                return rand;
	            } else if(guess(rand)== -1){
	                right = rand -1;
	            } else {
	                left = rand + 1;
	            }
	            rand = left + (right-left)/2;
	        }
	       return rand; 
	        
	    }
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.random()*11);
		
	}

}
