package leetcode;

public class Q234 {
	
	public static boolean isPalindrome(ListNode head) {
		ListNode forward = head;
		ListNode backward = new ListNode(forward.val);
		
		while(forward.next != null){
		forward = forward.next;
		
		ListNode node = new ListNode(forward.val);
		node.next = backward;
		
		backward = node;
		}
	     
		while(head != null){
			if(head.val != backward.val){
				return false;
			}
			head = head.next;
			backward = backward.next;	
		}
		return true;
		
		
	    }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(1);
		
		
		
		ListNode current = head;
		while(current != null){
			System.out.print(current.val + " ");
			current = current.next;	
		}
		
		System.out.print(isPalindrome(head));
		
		
	}

}
