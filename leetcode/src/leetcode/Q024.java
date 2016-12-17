package leetcode;

public class Q024 {
	
	public static ListNode swapPairs_(ListNode head){
		
		if(head == null || head.next == null){
			return head;
		}
		ListNode first = head;
		ListNode second = first.next;
		head = second;
		
		while(true){
		ListNode next = second.next;
		second.next = first;
		
		if(next == null || next.next== null){
			first.next = next;
			break;
		}
		first.next= next.next; 
		
		first = next;
		second=	next.next;
		
		
		}			
		return head;   
	}
	//ref:http://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list-by-changing-links/
	public static ListNode swapPairs(ListNode head){
		
		if(head == null || head.next == null){
			return head;
		}
		ListNode prev = head;
		ListNode cur= prev.next;
		
		head = cur;
		
		while(true){
			ListNode next = cur.next;
			cur.next = prev;
			
			if(next == null || next.next == null){
				prev.next = null;
				break;
			}
			prev.next = next.next;
			
			prev = next;
			cur = next.next;	
		}
		return head;
	}
	

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode tail = head;
		tail.next = new ListNode(2);
		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(4);
		tail = tail.next;
		tail.next = new ListNode(5);
		tail = tail.next;
		tail.next = new ListNode(6);
		tail = tail.next;
		
		
		ListNode head2 = swapPairs(head);
		
		ListNode currentx = head2;
		while(currentx != null){
			System.out.println(currentx.val);
			currentx = currentx.next;	
		}

	}

}
