package leetcode;

import java.util.Scanner;

public class Q007 {

	public static int reverse(int x){
		int initial = x;
		int result = 0;
		int resulttest;
		while(x != 0){
			resulttest = result;
			result *= 10;
			if(result / 10 != resulttest){
				return 0;
			}
			result += x % 10;
			
			x /= 10;
		}	
	
		return result;	
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer to reverse");
		int n = sc.nextInt();
		
		System.out.println("Reverse is " + reverse(n));
		

	}

}
