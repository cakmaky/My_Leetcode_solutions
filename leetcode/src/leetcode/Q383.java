package leetcode;

public class Q383 {
	
	public static boolean canConstruct_(String ransomNote, String magazine) {
		// bu ilk yazdigim
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for(int i=0; i<ransomNote.length(); i++){
			arr1[ransomNote.charAt(i) - 'a']++;
		}
		for(int i=0; i<magazine.length(); i++){
			arr2[magazine.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<26; i++){
			if(arr1[i] > arr2[i]){
				return false;
			}	
		}
		return true;    
    }

	public static boolean canConstruct(String ransomNote, String magazine) {
		// bu daha concise ama ayni hizda calisti. ikiside %60 i beat etti
		int[] arr = new int[26];
		
		for(int i=0; i<magazine.length(); i++){
			arr[magazine.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<ransomNote.length();i++){
			if(--arr[ransomNote.charAt(i) - 'a'] < 0){
				return false;
			}
		
		}
		return true;    
    }

	
	public static void main(String[] args) {
	
		String ransomNote= "aa";
		String magazine = "aab";
		
		System.out.print(canConstruct(ransomNote,magazine));

	}

}
