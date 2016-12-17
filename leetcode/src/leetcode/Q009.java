package leetcode;

import java.util.Scanner;

public class Q009 {

	public static boolean isPalindrome(int n){
		int number = n;
		int result = 0;
		while(n != 0){
			
			result *= 10;
			result += n % 10;
			n /= 10;
		}
		
		if(number == result && number >= 0){
			return true;
		}
		else {
			return false;
   
    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter integer to check palindrome: ");
		int n = sc.nextInt();
		
		System.out.println("The answer is = " + isPalindrome(n));  

	}

}
