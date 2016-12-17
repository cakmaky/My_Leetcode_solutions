package leetcode;

public class Q083 {
	
  public static ListNode deleteDuplicates(ListNode head) {
	  
	  //ListNode tail = head;
	  if(head == null){
		  return head;
	  }
	  ListNode current = head;
	  ListNode compare = current.next;
	  while(compare != null){
		  
		  if(current.val != compare.val){
			  current.next = compare;
			  current = compare;
			  compare = compare.next;
			  
		  }else {
			  compare = compare.next;
		  }
		  
	  }
	  current.next = null;
	  return head;
    }

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(1);
		head.next = tail;
		
		tail.next = new ListNode(2);
		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = null;
		
		ListNode node = deleteDuplicates(head);
		
		ListNode current = head;
		while(current.next != null){
			System.out.print(current.val + " "); 
			current = current.next;	
		}
		System.out.print(current.val + " "); 
	
		

	}

}
