package leetcode;
// Ben ArrayList kullandim, diger kisiler stack class ini kullanmis.
// En basit cozum 2. bir stack tanimlamak minimumlari tutan. Ben o sekilde yaptim
//Diger bir cozum de node tanimlamak, node hem kendi degerini hem de minimum u tutabilir. node class ini da yazmak gerek
import java.util.*;
public class MinStack {
	
	private List<Integer> list; 
	private List<Integer> min;
	
	public MinStack() {
		list = new ArrayList<>();  
		min  = new ArrayList<>(); 
    }
    
    public void push(int x) {
    	if(list.size() == 0){
    		min.add(x);
    	}
    	list.add(x);
    	if(min.size() != 0){
    		if(x <= min.get(min.size()-1)){
    		min.add(x);
    		}
    	}
        
    }
    
    public void pop(){
    	if(list.size() > 0){
    	Integer value = list.get(list.size()-1);
    	list.remove(list.size()-1);
    	if(value.equals( min.get(min.size()-1))){
    		min.remove(min.size()-1);
    	}
    	}
        
    }
    
    public int top(){
    	if(list.size() > 0){
    	return list.get(list.size()-1);   
    	}
    	return 0;
    }
    
    public int getMin(){
    	if(min.size() > 0){
    	return min.get(min.size()-1);
    	}
    	return 0;
    }
}




/* Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


