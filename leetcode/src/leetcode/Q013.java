package leetcode;

public class Q013 {
	
	public static int romanToInt(String s) {
		int count = 0;	
	if(s.indexOf("IV") != -1)
		count -= 2;
	if(s.indexOf("IX") != -1)
		count -= 2;
	if(s.indexOf("XL") != -1)
		count -= 20;
	if(s.indexOf("XC") != -1)
		count -= 20;
	if(s.indexOf("CD") != -1)
		count -= 200;
	if(s.indexOf("CM") != -1)
		count -= 200;
		
		
	for(int i=0; i<s.length(); i++){
		if(s.charAt(i) == 'I'){
			count +=1;
		}
		if(s.charAt(i) == 'V'){
			count +=5;
		}
		if(s.charAt(i) == 'X'){
			count +=10;
		}
		if(s.charAt(i) == 'L'){
			count +=50;
		}
		if(s.charAt(i) == 'C'){
			count +=100;
		}
		if(s.charAt(i) == 'D'){
			count +=500;
		}
		if(s.charAt(i) == 'M'){
			count +=1000;
		}	
	}
	return count;	
    }
	

	public static void main(String[] args) {
	System.out.println(romanToInt("MCMLXXXIV"));

	}

}
