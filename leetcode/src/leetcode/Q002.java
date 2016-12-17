package leetcode;
// My first Linked list exercise
import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q002 {
	
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		ListNode head =new ListNode(0);    
        ListNode tail = head;
        
        ListNode current = tail; 
        int hand = 0;
        int n1 = 0;
        int n2 = 0;
        while(!( l1 == null && l2 == null)){

        	if(l1 != null){
        		n1 = l1.val;
        		l1 = l1.next;
        	}
        	if(l2 != null){
        		n2 = l2.val;
        		l2 = l2.next;
        	}
        	current.val = ((n1 + n2 + hand) % 10);
        	hand = (n1 + n2 + hand) /10;
        	if(!( l1 == null && l2 == null)){
        	current.next = new ListNode(0);
        	current = current.next;
        	}
        	n1 = 0;
        	n2 = 0;
        }
        if(hand > 0){
        	//current = current.next;
        	current.next = new ListNode(0);
        	current = current.next;
        	current.val = 1;	
        }    
        return head;
}
	public static void main(String[] args) {
		
		ListNode head = new ListNode(2);
		ListNode tail = head;
		tail.next = new ListNode(4);
		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		
		ListNode head2 = new ListNode(5);
		ListNode tail2 = head2;
		tail2.next = new ListNode(6);
		tail2 = tail2.next;
		tail2.next = new ListNode(9);
		tail2 = tail2.next;
		tail2.next = new ListNode(1);
		tail2 = tail2.next;
		
		ListNode head3 = addTwoNumbers(head, head2);

		
		ListNode current = head3;
		while(current != null){
			System.out.println(current.val);
			current = current.next;	
		}
		
		

		
	}

}
