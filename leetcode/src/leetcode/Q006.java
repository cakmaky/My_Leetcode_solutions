package leetcode;

import java.util.Scanner;

public class Q006 {

	
	public static String convert(String s, int row){
		
		if(row == 1){
			return s;
		}
		else {
		
		String[] array = new String[row];
		
		for(int i=0; i<array.length; i++){
			array[i] = "";
		}
		
		for(int i=0; i<s.length(); i++){
			
			int mod = (i) % (2*row-2);
			
			if(mod < row){
				array[mod] += s.charAt(i);
			}
			else {
				array[2*row -2 -mod] += s.charAt(i);
			}	
		}
		
		String result = "";
		for(int i=0; i<array.length; i++){
			result += array[i];
			
		}
		return result;
		}
     
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		
		System.out.println("Enter row #: ");
		int row = sc.nextInt();
		
		
		System.out.println("Result is " + convert(s, row));
		
	}

}
