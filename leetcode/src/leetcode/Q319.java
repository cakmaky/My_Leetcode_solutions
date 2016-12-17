package leetcode;

public class Q319 {
	
	public static int bulbSwitch_(int n){
		// Time limite takildi
		boolean[] arr = new boolean[n];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j< arr.length; j++){
				if((j+1) % (i+1) == 0){
					arr[j] = !arr[j];	
				}
				
			}
		}
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == true){
				count++;
			}
		}
		return count;
        
    }
	public static int bulbSwitch(int n){
	// submiti gecti	
		int count = 0;
		for(int i=1; i*i <= n; i++){
			count++;
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		//boolean[] n = {false,false,false,false,false};
		
		System.out.print(bulbSwitch(99999));
	}

}
