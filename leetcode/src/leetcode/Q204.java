package leetcode;
// 3 yontemle de cozdum.
import java.util.*;
public class Q204 {
	
	public static boolean isPrime(int n){
	
		for(int i=2 ; i<= Math.sqrt(n) ; i++){
			if( n % i == 0){
				return false;
			}	
		}
		return true;	
	}
	public static int countPrimes(int n) {
		Set<Integer> set = new HashSet<>();
		
		if(n <= 2) {
			return 0;
		}
		set.add(2);
		boolean test = true;
		for(int i=3; i < n ; i++ ){
			for(Integer num: set){
				if(i % num == 0){
					test = false;
					break;
				}
			}
			if(test){
				set.add(i);
			}
			test = true;
		}
		//System.out.println(set.toString());
        return set.size();
    }
	

	public static int countPrimesBest(int n){
		boolean[] primes = new boolean[n];
		for(int i=0; i < n; i++){
			primes[i] = true;
		}
		
		for( int i=2; i*i < n; i++){
			if(!primes[i]){
				continue;
			}
			for(int j= i*i; j<n; j+= i){
				primes[j] = false;
			}	
		}
		int count = 0;
		for(int i=2; i < n; i++){
			if(primes[i]){
				count++;
			}
		}	
	return count;	
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(isPrime(23));
		System.out.println(countPrimesBest(1500000));
	}

}
