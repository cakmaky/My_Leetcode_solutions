package leetcode;

import java.util.*;
public class Q160 {
	
	public static ListNode getIntersectionNode_(ListNode headA, ListNode headB) {
		// HashSet ile yaptim submiti gecti ama %1 kisiyi gecti sadece
		if(headA == null || headB == null){
			return null;
		}
		Set<ListNode> set = new HashSet<>();
		while(headA != null & headB != null){
			
			if(set.contains(headA)){
				return headA;
			} else {
				set.add(headA);
				headA = headA.next;
			}
			
			if(set.contains(headB)){
				return headB;
			} else{
				set.add(headB);
				headB = headB.next;
			}	
		}
		while (headA != null){
			if(set.contains(headA)){
				return headA;
			} else {
				set.add(headA);
				headA = headA.next;
			}	
		}
		while (headB != null){
			if(set.contains(headB)){
				return headB;
			} else {
				set.add(headB);
				headB = headB.next;
			}	
		}
		return null; 
    }

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
   // editorial solution a  gore yazdim ama time limite takiliyor. Bi ara bakilabilir
		ListNode pa = headA;
		ListNode pb = headB;
		ListNode taila = headA;
		ListNode tailb = headB;
		
		while (pa != null && pb != null){
			
			if(pa.equals(pb) && pa != null){
				taila.next = null;
				tailb.next = null;
				return pa;
			}
			if(pa.next == null){
				taila = pa;
				pa.next = headB;
			}
			pa = pa.next;
			
			if(pb.next == null){
				tailb = pb;
				pb.next = headA;
			}
			pb = pb.next;
			
			if(pa == null && pb == null){
				taila.next = null;
				tailb.next = null;
				return null;
			}
		}	
		return null;
	}
	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		headA.next = new ListNode(2);
		headA.next.next = new ListNode(3);
		headA.next.next.next = new ListNode(4);
		headA.next.next.next.next = new ListNode(5);
		
		ListNode headB = new ListNode(9);
		headB.next = new ListNode(8);
		headB.next.next = new ListNode(7);
		
		headB.next.next.next = headA.next.next.next;
		
		ListNode head2 = getIntersectionNode(headA, headB);
		
		ListNode current = head2; 		
		while(current != null){
			System.out.print(current.val + " ");
			current = current.next;	
		}
		
		
		

	}

}
