
public class DoubleChain {
	/* private DNode(double val) {
			this(null, val, null);
		}
		
		private DNode(DNode prev, double val, DNode next) {
			this.prev = prev;
			this.val = val;
			this.next =next;
		}
	*/
	private DNode head; 
	public DoubleChain(double val) {
		/* your code here. */
		head = new DNode(val);
	}

	public DNode getFront() {
		return head;
	}

	/** Returns the last item in the DoubleChain. */		
	public DNode getBack() {
		/* your code here */
		DNode p = head;
		while (p.next != null) {
			p = p.next;
		} // close while loop
		return p;
	}
	
	/** Adds D to the front of the DoubleChain. */	
	public void insertFront(double d) {
		/* your code here */
		DNode oldHead = head;
		head = new DNode(oldHead.prev, d, oldHead);

	}
	
	/** Adds D to the back of the DoubleChain. */	
	public void insertBack(double d) {
		/* your code here */
		DNode p = head;
		while (p.next != null) {
			p = p.next;
		} // close while
		// DNode oldBack = p;
		p.next = new DNode(p, d, null);
	}
	
	/** Removes the last item in the DoubleChain and returns it. 
	  * This is an extra challenge problem. */
	public DNode deleteBack() {
		/* your code here */
		DNode p = head;
		while (p.next != null) {
			p = p.next;
		} // close while
		p = p.prev;
		return p;
	}
	
	/** Returns a string representation of the DoubleChain. 
	  * This is an extra challenge problem. */
	public String toString() {
		/* your code here */
		// present front-to-back chain	
		String chain = "The double chain is: ";
		String arrow = "->";
		DNode p = head;
		while (p.next != null) {
			chain = chain + p.val + arrow;
			p = p.next;
		}
		chain += "null;";
		return chain;
	}

	/* DNode */
	public static class DNode {
		public DNode prev;
		public DNode next;
		public double val;
		
		private DNode(double val) {
			this(null, val, null);
		}
		
		private DNode(DNode prev, double val, DNode next) {
			this.prev = prev;
			this.val = val;
			this.next =next;
		}
	}

	public static void main(String[] args) {
		DoubleChain L = new DoubleChain(0);
		L.insertFront(1);
		L.insertFront(2);
		L.insertFront(3);
		System.out.println(L.toString());
	}
	
}
