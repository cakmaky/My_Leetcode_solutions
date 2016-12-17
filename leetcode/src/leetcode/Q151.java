package leetcode;

public class Q151 {
	
	public static String reverseWords2(String s) {
		
		int i=0;
		int space = -1;
		String news = "";	
		while(i< s.length()){
			if(s.charAt(i) == ' '){
				if((i - space) >1){
					if(news.length() == 0){
						news = s.substring(space+1, i);
					}else {
						news = s.substring(space+1, i) + " " + news;
					}
				}
				space = i;
			}	
			i++;	
			if(i == s.length() && s.charAt(i-1) != ' '){
				if(space == -1){
					news = s.substring(space+1, i);
				} else {
				news = s.substring(space+1, i) + " " + news;
				}
				space = i;
			}	
		}
		
		return news;
        
    }

	public static String reverseWords(String s) {
		
		String[] array = s.split(" ");
		
		String news = "";
		for(int i=0; i<array.length; i++){
			
			if(array[i].length() > 0){ 
				if(news.length() == 0){
						news = array[i];
				}else {
						news = array[i] + " " + news;
				}
			}
		}
		return news;
	}
	public static void main(String[] args) {
		
		String s =  "  a   ";
		//String s = "";
		 System.out.println("a" +reverseWords(s) + "a");
		

	}

}
