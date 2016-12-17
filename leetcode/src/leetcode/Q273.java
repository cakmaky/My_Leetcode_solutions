package leetcode;

public class Q273 {
	
	public static String numberToWords(int num) {
		if(num == 0){
			return "Zero";
		}
		String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String[] tens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tents = {"", "Ten", "Twenty","Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty","Ninety"};
		
		int[] block = new int[4];
		int i=0;
		while(num > 0){
			block[i] = num % 1000;
			num /= 1000;
			i++;
		}
		String[] str = new String[4];
		for( i=0; i<4; i++){
			int n = block[i];
			int one = n %10;
			int ten = (n/10) %10;
			int hundred = (n/100) % 10;
			String s = "";
			if(hundred >0){
				s = ones[hundred] + " " + "Hundred";
			}
			if(ten>=2){
				if(!s.isEmpty()){
					s +=" ";
				}
				s += tents[ten];
				if(one > 0){
					s += " ";
				}
				s += ones[one];
			}else if(ten == 1){
				if(!s.isEmpty()){
					s +=" ";
				}
				s += tens[one];
			} else {
				if(!s.isEmpty() && one != 0){
					s +=" ";
				}
				s += ones[one];
			}
			str[i] = s;	
		}
		
		String result ="";
		if(!str[3].isEmpty()){
			result += str[3] + " " + "Billion";
		}
		if(!str[2].isEmpty()){
			if(!result.isEmpty()){
				result +=" ";
			}
			result +=str[2] + " " + "Million";
		}
		if(!str[1].isEmpty()){
			if(!result.isEmpty()){
				result +=" ";
			}
			result += str[1] + " " + "Thousand";
		}
		if(!str[0].isEmpty()){
			if(!result.isEmpty()){
				result +=" ";
			}
			result +=str[0];	
		}
			return result;
		}

	
	public static void main(String[] args) {
	
			//System.out.println(Integer.MAX_VALUE);
			System.out.println(numberToWords(123456));
			
	}

}
