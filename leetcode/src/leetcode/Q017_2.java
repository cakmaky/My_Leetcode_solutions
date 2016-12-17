package leetcode;
import java.util.*;
// backtracting ile cozdum
public class Q017_2 {
	
	public static List<String> letterCombinations(String digits) {
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		for(int i=0; i<digits.length(); i++){
			if(digits.charAt(i) == '2'){
				list.add("abc");
			}if(digits.charAt(i) == '3'){
				list.add("def");
			}if(digits.charAt(i) == '4'){
				list.add("ghi");
			}if(digits.charAt(i) == '5'){
				list.add("jkl");
			}if(digits.charAt(i) == '6'){
				list.add("mno");
			}if(digits.charAt(i) == '7'){
				list.add("pqrs");
			}if(digits.charAt(i) == '8'){
				list.add("tuv");
			}if(digits.charAt(i) == '9'){
				list.add("wxyz");
			}	
		}
		if(list.size() == 0){
			return list;	
		}
		int[] array = new int[list.size()];
		Arrays.fill(array, 0); 		
		int index = list.size()-1;		
		while(array[0] < list.get(0).length()){
			String st = "";			
			for(int i=0; i<list.size(); i++){	
				st = st + list.get(i).charAt(array[i]);
				}
				list2.add(st);
				//System.out.println(st);
				if(array[0] == list.get(0).length()){
					break;
				}
			while(array[index] +1 == list.get(index).length() && index >= 0){
				array[index] = 0;
				index--;
				if(index < 0){
					break;
				}
			}
			if(index < 0){
				break;
			}
			array[index]++;	
			index = list.size()-1;		
		}
		System.out.println("size = " + list2.size());
		return list2;	     
    }	
	public static void main(String[] args) {
		
		
		
		String s = "6789";
		System.out.println(letterCombinations(s).toString());
		

	}

}

