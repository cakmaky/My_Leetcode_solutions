package leetcode;

public class Q328 {
	
	public static ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null){
			return head;
		}
		
		ListNode oddstart = head;
		ListNode evenstart = head.next;		
		ListNode odd = oddstart;
		ListNode even = evenstart;

		ListNode current = head.next.next;	
		while(current != null){	
			odd.next = current;
			current = current.next;
			odd = odd.next;
			
			if(current != null){
				even.next = current;
				current = current.next;
				even = even.next;
			}	
		}
		even.next = null;
		odd.next = evenstart;
		
		return oddstart;
     
    }

	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		//head.next.next.next.next = new ListNode(5);
		//head.next.next.next.next.next = new ListNode(6);
		//head.next.next.next.next.next.next = new ListNode(7);
		
		
		ListNode head2 = oddEvenList(head);
		
		ListNode current = head2;
		while(current != null){
			System.out.print(current.val + " ");
			current = current.next;
			
		}
		

	}

}
