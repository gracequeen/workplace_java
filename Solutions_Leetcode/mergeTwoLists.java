/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists
*/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class mergeTwoLists{

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// boundary situation
		if (l1 == null) return l2;
		if (l2 == null) return l1;

        // seudo head
        ListNode shead = new ListNode(0);
        // pointers for both lists and the head of new list
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode hp = shead;

        // use seodo headpointer to stick to the smaller node sequencially
        while(p1 != null && p2 != null) {
        	if (p1.val >= p2.val) {
        		hp.next = p2;
        		hp = hp.next;
        		p2 = p2.next;
        	} else {
        		hp.next = p1;
        		hp = hp.next;
        		p1 = p1.next;
        	}
        }

        // add on the last two nodes
        if (p2 == null) {
            hp.next = p1;
        }
        if (p1 == null) {
            hp.next = p2;
        }

        return shead.next;
    }
	
	public static void main(String[] args) {

	}
}