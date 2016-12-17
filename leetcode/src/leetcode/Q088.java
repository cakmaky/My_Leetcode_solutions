package leetcode;

public class Q088 {
	
	public static void merge_(int[] nums1, int m, int[] nums2, int n) {
		// eski cozumun. ayri array tanimlayip onu nums1 e attim. tam istenildigi sekilde degil
		m = nums1.length;
		n = nums2.length;
		int[] array = new int[nums1.length + nums2.length];
		int i=0;
		int j=0;
		for(int k=0; k<array.length; k++){
			
			if(i == m){
				array[k] = nums2[j];
				j++;
			}
			else if(j == n){
				array[k] = nums1[i];
				i++;
			}
			else if(nums1[i] > nums2[j] && i < m){
				array[k] = nums1[i];
				i++;
			} 
			else if(nums1[i] <= nums2[j] && j < n) {
				array[k] = nums2[j];
				j++;
			}
			
		}
		for(int k=0; k<array.length; k++){
			nums1[k] = array[k];	
		}   
    }

	public static void merge(int[] nums1, int m, int[] nums2, int n){
		
		for(int i = (m+n-1); i>=0; i-- ){
			if(m>=1 && n>=1){
			if(nums1[m-1] > nums2[n-1]){
				nums1[i] = nums1[m-1];
				m--;
			} else {
				nums1[i] = nums2[n-1];
				n--;
			}	
			}else {
			if(m>=1){
				nums1[i] = nums1[m-1];
				m--;
			}
			else if(n>=1){
				nums1[i] = nums2[n-1];
				n--;
			}	
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[] nums1 = {0};
		//nums1 = {2,5,8,11,16};
		int[] nums2 = {1};
		
		merge(nums1,0, nums2, nums2.length);

	}

}
