package leetcode;
//finished.
public class Q415 {
	
public static String addStrings(String num1, String num2) {
	
	String result = "";
	int hand = 0;
	int size;
	if(num1.length() > num2.length()){
		size = num1.length();
	}
	else {
		size = num2.length();
	}
	int n1,n2;
	for(int i=1; i<=size; i++){
		if(i<=num1.length()){	
			n1 = Character.getNumericValue(num1.charAt(num1.length() -i));
		}
		else {
			n1 = 0;
		}
		
		if(i<= num2.length()){
			n2 = Character.getNumericValue(num2.charAt(num2.length() -i));
		}
		else {
			n2 = 0;
		}
		
	int sum = n1 + n2;
	sum += hand;
	hand =sum/10;
	
	result = sum % 10 + result;
	}
	if(hand > 0){
		result = hand + result;
	}
	return result;
    }

	public static void main(String[] args) {
		String num1 = "123456";
		String num2 = "123789789";
		
		String result =  addStrings(num1,num2);
		System.out.println(result);
		
	}

}
