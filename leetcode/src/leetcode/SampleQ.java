package leetcode;
import java.util.*;

public class SampleQ {
	public static boolean checkSum2(int[] array, int sum){
		Arrays.sort(array);
		boolean result = false;
		int leftIndex = 0;
		int rightIndex = array.length -1;
		while(leftIndex < rightIndex){
			int addition = array[leftIndex] + array[rightIndex];
			if(addition == sum){
				result = true;
				break;
			}
			else if(addition > sum){
				rightIndex--;
			}
			else {
				leftIndex++;
			}
		}
		return result;	
	}
	public static boolean checkSum(int[] array, int sum){
		boolean result = false;
		for(int i=0; i< array.length;i++){
			for(int j=i+1; j<array.length; j++){
				if((array[i] + array[j]) == sum){
					result = true;
					System.out.println("The sum of numbers " + array[i] + " and " + array[j] + " is " + sum); 
				}	
			}	
		}	
		return result;
	}
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		int sum= 8;

		System.out.println("The result is " + checkSum2(array, sum));

	}

}
