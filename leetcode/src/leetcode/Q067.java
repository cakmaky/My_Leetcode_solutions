package leetcode;

public class Q067 {

	public static String addBinary(String a, String b) {
		int i = 1;
		int hand = 0;
		String s = "";
		int n1,n2;
		while(i<=a.length() || i<= b.length()){
			if(a.length()>=i){
				n1 = Integer.parseInt(a.charAt(a.length()-i) + "");
			}
			else {
				n1 = 0;
			}
			if(b.length()>=i){
				n2 = Integer.parseInt(b.charAt(b.length()-i) + "");
			}
			else {
				n2 = 0;
			}
			int sum = n1 + n2 + hand;

			if(sum == 0 || sum == 1){
				s = Integer.toString(sum) + s;
				hand = 0;
			}
			else if(sum == 2 || sum == 3){
				s = Integer.toString(sum-2) + s;
				hand = 1;	
			}
			i++;
		}
		if(hand == 1){
			s= "1" + s;
		}
		return s;
	}

	public static void main(String[] args) {

		String a = "1010";
		String b = "1011";

		System.out.println(addBinary(a,b));

	}

}
