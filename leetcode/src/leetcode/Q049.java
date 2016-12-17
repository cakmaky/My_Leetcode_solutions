package leetcode;
// ayni file a 2. bir class yazilabiliyor. public private demeden eklenebiliyor.
import java.util.*;

public class Q049 {
	
	public static int calculateCode(String s){
		int total = 0;
		for(int i=0; i<s.length(); i++){
			char c= s.charAt(i);
			total += (s.charAt(i)+ "").hashCode()*(s.charAt(i)+ "").hashCode()*(s.charAt(i)+ "").hashCode();
		}
		return total;
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> list = new ArrayList<>();
	    List<String> l;     
		
		Map<Integer, ListN> map = new HashMap();
		for(int i=0; i<strs.length; i++){
			if(map.containsKey(calculateCode(strs[i]))){
				ListN node = map.get(calculateCode(strs[i]));
				while(node.next != null){
					node = node.next;
				}
				node.next = new ListN(strs[i]);
				
			}else{
			map.put(calculateCode(strs[i]),new ListN(strs[i]));
			}
		}	
		Set<Integer> set = map.keySet();
				
		for(Integer i: set){
			ListN node = map.get(i);
			l = new ArrayList();
			l.add(node.val);
			while(node.next != null){
				l.add(node.next.val);
				node = node.next;
			}
			list.add(l);
			
		}	
      return list;  
    }

	public static void main(String[] args) {
		
		//String[] str = {"eat", "tea", "tan", "ate", "nat", "bat", "tae", "nta"};
		String[] str = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
		
		
		
		List<List<String>>  s = groupAnagrams(str);
		
		System.out.println(s.toString());

	}

}
class ListN {
	 String val;
	 ListN next;
	 ListN(String x) { 
		 val = x; 
		 }
}

