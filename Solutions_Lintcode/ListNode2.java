/**
* Given a sorted linked list, delete all nodes that 
* have duplicate numbers, leaving only distinct 
* numbers from the original list.
* Example
* Given 1->2->3->3->4->4->5, return 1->2->5.
* Given 1->1->1->2->3, return 2->3.
**/

public class ListNode2 {
 	int val;
	ListNode2 next;
	ListNode2(int x) {
		val = x;
		next = null;
	}

	public static ListNode2 deleteDuplicates(ListNode2 head) {
        // write your code here
        if ((head == null) || (head.next == null)) {
            return head;
        }
        
        ListNode2 dummy = new ListNode2(1);
        dummy.next = head;
        head = dummy;
        
        while (head.next != null) {
            if (head.next.val == head.next.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
            
        }
        return head;
    }
    public static void main(String[] args) {
    	/*
    	ListNode2 node0 = new ListNode2(1);
    	ListNode2 node1 = new ListNode2(1);
    	ListNode2 node2 = new ListNode2(2);
    	ListNode2 node3 = new ListNode2(3);

    	node0.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	// node3.next = null;
    	// node0 = deleteDuplicates(node0);
    	System.out.print(node0.val + "->" + node1.val + "->" + node2.val + "->" + node3.val);
    	*/
    	
    }

}