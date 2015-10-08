/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/

class ListNode {
	int val;
    ListNode next;
 	ListNode(int x) { val = x; }
}

public class deleteDuplicates{
	// Idea 0: Iteration
	public ListNode deleteDuplicates0(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode p = head; // p as the moving pointer, keep "head" as the actual list head
		while(p.next != null) {
			if (p.val == p.next.val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		
		return head;
	}

	// Idea 1: Recursion
	public ListNode deleteDuplicates1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		while (head.next != null && head.val == head.next.val) {
			head = head.next;
		}

		// head.next as the second node after original head, represents the list after the head
		head.next = deleteDuplicates1(head.next);
		return head;
	}

}