package leetcode;

public class Q147 {
	
	public static ListNode insertionSortList(ListNode head) {
		if(head == null){
			return head;
		}
		ListNode move = head;
		ListNode current = move;	
		ListNode prev = move;
		while(current.next != null){		
			move = current;
			prev = move;
			move = move.next;
			if(move.val >= prev.val){
				current = current.next;
			} else {
				prev.next = move.next;
				if(move.val < head.val){
					move.next = head;
					head = move;
				} else {
				ListNode start = head;
				while(start.next.val < move.val){
					start = start.next;
				}
				ListNode next = start.next;
				start.next= move;
				move.next = next;	
			}
		}	
		}
        return head;
    }
	

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(8);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(4);
		
		
		ListNode head2 =  insertionSortList(head);
		
		ListNode current = head2;
		while(current != null){
			System.out.print(current.val + " ");
			current = current.next;
		}
		

	}

}
