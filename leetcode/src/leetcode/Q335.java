package leetcode;

public class Q335 {

	
	public static boolean isSelfCrossing(int[] x) {
		
		for(int i=0; i<x.length-3; i++){
			if(x[i+2] <= x[i] && x[i+3] >= x[i+1]){
				System.out.println("1");
				return true;
				
			}
			if(i<x.length-4 && x[i+1] == x[i+3] && x[i+4] >= (x[i+2] - x[i])){
				System.out.println("2");
				return true;
			}
			if(i<x.length - 5 && x[i+4] >= (x[i+2] - x[i]) && x[i+2] > x[i] && x[i+5] >= (x[i+3] - x[i+1]) && x[i+3] > x[i+1] &&x[i+4] < x[i+2]){
				System.out.println("3");
				return true;
			}
		}
		return false;    
    }
	public static void main(String[] args) {
		int[] x = {1,1,2,2,3,3,4,4,10,4,4,3,3,2,2,1,1};
		
		System.out.println(isSelfCrossing(x));

	}

}
