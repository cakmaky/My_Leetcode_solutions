package leetcode;

public class Q021 {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1 == null && l2== null){
        	return l1;
        }
		if(l1 == null && l2!= null){
			return l2;
		}
		if(l1 != null && l2== null){
			return l1;
		} 
		ListNode headx = new ListNode(0);
		ListNode current = headx;
		if(l1.val< l2.val){
			current.val=l1.val;       
			l1 = l1.next;
		}
		else if(l1.val >= l2.val){
			current.val = l2.val;    
			l2 = l2.next;
		}
		int n1=0;
		int n2=0;
		while(!(l1 == null && l2== null)){	
			if(l1 != null){
				n1 = l1.val;
			}
			if(l2 != null){
				n2 = l2.val;	
			}
			if(n1< n2 && l1 != null && l2 != null ){
				current.next = new ListNode(n1);
				l1 = l1.next;
			}
			else if(n1 >= n2 && l1 != null && l2 != null ){
				current.next = new ListNode(n2);
				l2 = l2.next;
			}
			else if(l1 == null && l2 != null ){ 
				current.next = new ListNode(n2);
				l2= l2.next;
			}
			else if(l1 != null && l2 == null ){ 
				current.next = new ListNode(n1);
				l1= l1.next;
			}
			current = current.next;
			
			n1=0;
			n2=0;
		}
			return headx;
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(-3);
		ListNode tail = head;
		tail.next = new ListNode(-1);
		tail = tail.next;
		tail.next = new ListNode(5);
		tail = tail.next;
		tail.next = new ListNode(7);
		tail = tail.next;
		tail.next = new ListNode(9);
		tail = tail.next;
		
		
		ListNode head2 = new ListNode(-2);
		tail = head2;
		tail.next = new ListNode(4);
		tail = tail.next;
		//tail.next = new ListNode(6);
		//tail = tail.next;
		//tail.next = new ListNode(8);
		//tail = tail.next;
		//tail.next = new ListNode(10);
		//tail = tail.next;
		
		ListNode head3 = mergeTwoLists(head, head2);
		
		
		
		ListNode currentx = head3;
		while(currentx != null){
			System.out.println(currentx.val);
			currentx = currentx.next;	
		}
		

	}

}
