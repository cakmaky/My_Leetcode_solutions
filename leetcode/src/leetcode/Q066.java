package leetcode;

import java.util.ArrayList;

public class Q066 {
	
	public static  int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--){

				digits[i] ++;
				if(digits[i] == 10){
					digits[i] = 0;
					continue;
				}
				else {
					break;
				}
			
		}
		if(digits[0] == 0){
			
			int[] digits2 = new int[digits.length + 1];
			digits2[0] = 1;
			return digits2;
		}
		return digits;	   
    }

	public static void main(String[] args) {
		int[] array = {9,9,9};
		int[] array2 = plusOne(array);
		System.out.println("Result is " + array2[0] + array2[1] + array2[2] + array2[3]  );

	}

}
