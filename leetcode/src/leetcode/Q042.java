package leetcode;

import java.util.*;
public class Q042 {
	
	public static int trap_2pointer(int[] height) {
	// two pointer ile discussion dan bakip yazdim. Bunu pek anlamadim	
		
		int left = 0;
		int right = height.length-1;
		int leftmax = 0;
		int rightmax = 0;
		int max = 0;
		
		while(left <= right){
			if(height[left] > leftmax){
				leftmax = height[left];
			}
			if(height[right] > rightmax){
				rightmax = height[right];
			}
			
			if(leftmax < rightmax){
				max += (leftmax - height[left]);
				left++;
			}
			else {
				max += rightmax - height[right]; 
				right--;
			}
			System.out.println("left=" + left + " right=" + right +" max is " + max);
		}
		
		return max;
        
    }
	public static int trap(int[] height){
	// discussion daki stack li cozume biraz bakip yazdim, o biraz karisikti.
	// stack ta indexleri tutunca is cozuluyor.
		int sum = 0;
		int res = 0;
		Stack<Integer> stack = new Stack<>();
		int i=0;
		while(i<height.length){
			if(stack.isEmpty() || height[i] <= height[stack.peek()]){
				stack.push(i);
				i++;
			} 
			else {
				int x = stack.pop();
				if(stack.isEmpty()){
					continue;
				}
				else if(height[i] < height[stack.peek()]){
					sum = (height[i] -height[x]) *  (i - stack.peek()-1);
					if(sum > 0){
						res += sum;
					}
					stack.push(i);
				}else if(height[i] == height[stack.peek()]){
					sum = (height[i]-height[x]) *  (i - stack.peek()-1);
					if(sum > 0){
						res += sum;
					}	
				}
				else {
					sum = (height[stack.peek()]-height[x]) *  (i - stack.peek() -1);
					if(sum > 0){
						res +=sum;
					}
				}
			}	
			
		}
		
		return res;	
	}
	public static void main(String[] args) {
		
		int[] height = { 0,1,0,2,1,0,1,3,2,1,2,1};
		//int[] height = { 4,2,3};
		
		System.out.println(trap(height));
		

	}

}
