package leetcode;

import java.util.*;
public class Q142 {
	
	public static ListNode detectCycle_(ListNode head) {
		Set<ListNode> set = new HashSet<>();	
		ListNode current = head;
		while(current != null){	
			if(!set.contains(current)){
				set.add(current);
				current = current.next;
			} else {
				return current;
			}	
		}
		return null;     
    }

	public static ListNode detectCycle(ListNode head) {
	// daha hizli calisiyor. 	
		
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){	
				ListNode slow2 = head;
				while(!slow2.equals(slow)){
					slow= slow.next;
					slow2= slow2.next;
				}
				return slow;
			}	
		}
		return null;
		
	}
	public static void main(String[] args) {
		
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(8);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = head.next.next;
		
		ListNode head2 = detectCycle(head);
		
		ListNode current = head2;
		int count = 0;
		while(count < 100){
			System.out.print(current.val + " ");
			current = current.next;
			count++;
		}

	}

}
