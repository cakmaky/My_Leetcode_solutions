package leetcode;

public class Q061 {
	
public static ListNode rotateRight(ListNode head, int k) {
	
	ListNode tail = head;
	int count = 1;
	while(tail.next != null){
		tail = tail.next;
		count++;
	}
	k= k % count; 
	
	tail.next= head;
	for(int i=1; i<= (count-k); i++){
		tail = tail.next;		
	}
	head = tail.next;
	tail.next = null;
	
	return head; 
    }

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(2);
		head.next = tail;
		
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(4);
		tail = tail.next;
		tail.next = new ListNode(5);
		tail = tail.next;
		tail.next = null;

	
		ListNode node = rotateRight(head , 4);
	
		ListNode current = node;
		while(current.next != null){
			System.out.print(current.val + " "); 
			current = current.next;	
		}
		System.out.print(current.val + " "); 
	
	
	}

}
