package leetcode;

import java.util.*;
public class Q141 {
	
	public static boolean hasCycle2(ListNode head){
	
		if(head == null || head.next == null){
			return false;
		}
		
		ListNode node1 = head;
		ListNode node2 = head.next;
		
		while(node1 != node2){	
			
			if(node2 == null || node2.next == null){
				return false;
			}
			node1 = node1.next;
			node2 = node2.next.next;
		}
       return true; 
    }
	
	public static boolean hasCycle(ListNode head){
		
		Set<ListNode> set = new HashSet<>();
		while(head != null){
			if(set.contains(head)){
				return true;
			}
			set.add(head);
			head = head.next;	
		}
		return false;	
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = head;
		
		System.out.println(hasCycle(head));

	}

}
