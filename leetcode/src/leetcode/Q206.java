package leetcode;

public class Q206 {
	
	public static ListNode reverseList2(ListNode head) {
	// Bu cozum submitten gecti ama degerleri kopyalayip yeni bir zincir kuruyor. reverse yapmiyor tam olarak	
		if(head == null){
			return head;
		}
		ListNode head2 = new ListNode(head.val);
		//head2.next = null;
		ListNode current = head;

		while(current.next != null){
			ListNode node = new ListNode(current.next.val);
			node.next = head2;
			head2 = node;
			current = current.next;
		}
		
		return head2;
    
    }
	
	public static ListNode reverseList(ListNode head) {
	// iterative cok guzel bi cozum	
		ListNode newhead = null;
		while (head != null){
			
			ListNode next = head.next;
			head.next = newhead;
			newhead = head;
			head = next;	
		}	
		return newhead;	
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode node = head.next.next;
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ListNode head2 = reverseList(head);
		
		
		ListNode current = head2;
		while(current.next != null){
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.print(current.val + " ");
		

	}

}
