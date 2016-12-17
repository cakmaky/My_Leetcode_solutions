package leetcode;
// cozdum ama Timelimitexceeded hatasi verdi.49 inputtan 47 sini gectim.
import java.util.*;
public class Q011 {

	public static int maxArea2(int[] array) {
	// 49 inputtan 47 sini gecti bu fonksiyon	
		int result = 0;
		int area = 0;
		for(int i=0; i<array.length; i++){
			for(int j=array.length-1; j>i; j--){
				
				area = Math.min(array[i], array[j])* (j-i);
				
				if(area > result){
					result = area;
				}	
				if(array[j] >= array[i]){
					break;
				}		
			}
		}
		return result;
    }
	
	public static int maxArea3(int[] array) {
	// Bu da 47 / 49 test cases passed.
		if(array == null || array.length == 1){
			return 0;
		}
		int result = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(0));
		
		for(int i=0; i< array.length; i++){
			for(Integer k: list){		
				int height = array[i] > array[k] ? array[k] : array[i];
				int area = height * (i-k);
				if(area > result){
					result = area;
				}	
			}		
			int lasti = list.get(list.size()-1).intValue();
			if(array[i] > array[lasti]){
				list.add(new Integer(i));
			}	
		}
		return result;		
	}
	
	public static int maxArea(int[] array){
	// Guzel cevap . %71 i beat etti.
		int left = 0;
		int right = array.length -1;
		int result = 0;
		while(left < right){
			int height = array[right] > array[left] ? array[left] : array[right];
			int area = height * (right - left);
			if(area > result){
				result = area;
			}
			
			if(array[left] < array[right]){
				left++;
			} else if(array[left] == array[right]){
				left++;
				right--;
			}
			else {
				right--;
			}	
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,3,2,4};
		
		System.out.println("The answer is " + maxArea(array));

	}

}
