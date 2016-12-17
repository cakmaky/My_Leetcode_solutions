package leetcode;
// My second link list exercise in leetcode
// List i 2 defa pass ettim. 1 pass de yapamadim.
public class Q019 {
	// Bu benim cozumum
	public static ListNode removeNthFromEnd_(ListNode head, int n) {
		int count = 0;
		ListNode current = head;
		while(current != null){
			current = current.next;	
			count++;
		}
		//System.out.println(count);
	    int wanted = count - n +1;
	    
	    count = 1;
	    current = head;
	    while(count < (wanted - 1)){
	    	current = current.next;	
			count++;	
	    }
	    
	    if(wanted == 1){
	    	head = head.next; 
	    }else {
	   current.next = current.next.next;
	    }
	    
	return head;
	} 
	// Bu da editorial solution
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode dummy =new ListNode(0);
		dummy.next = head;
		ListNode current1 = dummy;		
		ListNode current2 = dummy;
		for(int i=1; i<=(n+1);i++){
			current1 = current1.next;
		}
	
		while(current1 != null){
			current1 = current1.next;
			current2 = current2.next;	
		}
		
	  current2.next = current2.next.next;
	    
	return dummy.next;
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
		
		int n = 5;
		
		ListNode head2 = removeNthFromEnd(head, n);

		
		ListNode current = head2;
		while(current != null){
			System.out.println(current.val);
			current = current.next;	
		}
	

	}

}
