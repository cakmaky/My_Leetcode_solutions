package leetcode;

import java.util.*;
public class Q148 {
	public static ListNode merge(ListNode first, ListNode second){
		ListNode merged = new ListNode(Integer.MIN_VALUE);
		ListNode result = merged;
		while(first != null && second != null){
		if(first.val < second.val){
			merged.next = first;
			first = first.next;
		} else {
			merged.next = second;
			second = second.next;
		}
		merged = merged.next;
		}
		
		if(first != null){
			merged.next = first;
			merged = merged.next;
			first = first.next;
			
		}
		while(second != null){
			merged.next = second;
			merged = merged.next;
			second = second.next;	
		}
		return result.next;	
	}
	public static ListNode sortList(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}	
		ListNode prev = null, slow = head, fast = head;
		while (fast != null && fast.next != null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		
		ListNode left = sortList(head);
		ListNode right = sortList(slow);
		
		return merge(left, right);
    }
	public static void main(String[] args) {
		
		
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(1);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode head2 = sortList(head);
		
		ListNode current = head2;
		while(current != null){
			System.out.print(current.val + " ");
			current = current.next;
			
		}
	}

}
