package leetcode;

public class Q237 {
	
	public static void deleteNode(ListNode node) {
		
		node.val = node.next.val;
		node.next = node.next.next;
        
    }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode node = head.next.next;
		head.next.next.next = new ListNode(4);
		
		deleteNode(node);
		
		ListNode current = head;
		while(current.next != null){
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.print(current.val + " ");
		
		
		
		
		
	}

}
