/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.
*/

class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class mergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// seudo-head node: shead
		ListNode shead = new ListNode(0);
		shead.next = l1;
		while (l1 != null && l2 != null) {
			if(l1.val > l2.val) {
				// if default order is ascending
				shead.next = l2;
				l2.next = l1;
				
			} else {
				ListNode
			}
		}
	}
}