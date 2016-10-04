## 61 Rotate List 

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

**Tag:** two pointer | linked list

**Idea:** one pointer to the end, one pointer to the (l-k+1)th


	public class Solution {
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head == null || head.next == null) return head;
	        if(k == 0) return head;
	        
	        //length
	        int l = 0;
	        ListNode temp = head;
	        while(temp != null) {
	            l++;
	            temp = temp.next;
	        }
	        
	        k = k%l;
	        if(k == 0) return head;
	        
	        //rotate head
	        ListNode p1 = head;
	        for(int i = 0; i < l-k; i++) {
	            p1 = p1.next;
	        }
	        
	        ListNode p2 = p1;
	        for(int j = 0; j < k-1; j++) {
	            p2 = p2.next;
	        }
	        
	        p2.next = head;
	        
	        for(int m = 0; m<l-k; m++) {
	            p2 = p2.next;
	        }
	        
	        p2.next = null;
	        
	        return p1;
	    }
	}
	

Time Complexity: O(n) 