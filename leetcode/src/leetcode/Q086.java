package leetcode;

public class Q086 {
	
	public static ListNode partition(ListNode head, int x) {
		
		ListNode node= head;
		ListNode low = null;
		ListNode lowStart = null;
		ListNode high = null;
		ListNode highStart = null;
		
		while(node != null){
		if(node.val < x){
			if(low == null){
				low = node;
				lowStart = low;
			}
			else {
			low.next = node;
			low = low.next;
			}	
		}
		else {
			if(high == null){
				high = node;
				highStart = high;
			} else {
			high.next = node;
			high = high.next;
			}	
		}
		node = node.next;
		}
		if(high != null){
		high.next = null;
		}
		if(low != null){
		low.next = highStart;
		}
		else {
			lowStart = highStart;
		}
		return lowStart;
  
    }

	
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(4);
		head.next = tail;
		
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(2);
		tail = tail.next;
		tail.next = new ListNode(5);
		tail = tail.next;
		tail.next = new ListNode(2);
		tail = tail.next;
		
		tail.next = null;
		
		ListNode node = partition(head, 3);
		
		ListNode current = node;
		while(current.next != null){
			System.out.print(current.val + " "); 
			current = current.next;	
		}
		System.out.print(current.val + " "); 

	}

}
