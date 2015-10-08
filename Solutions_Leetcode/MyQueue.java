/*
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue),
as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

Stack methods:
E pop, E push, E peek, boolean empty, int search
*/

import java.util.Stack;

public class MyQueue{
	// initialize 2 empty stacks
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	// Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
    	if(!s2.empty()) {
    		s2.pop();
    	} else {
    		while (!s1.empty()) {
    			s2.push(s1.pop()); // push s1 elements into s2
    		}
    		s2.pop();
    	}
    }

    // Get the front element.
    public int peek() {
    	if(!s2.empty()) {
    		return s2.peek();
    	} else 
    		while (!s1.empty()) {
    			s2.push(s1.pop()); // push s1 elements into s2
    		}
    		return s2.peek();       
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		System.out.println(q.peek()); // current front element
		System.out.println(q.empty());
		q.pop();
		System.out.println(q.peek());
		q.pop();
		System.out.println(q.peek());
		q.pop();
		System.out.println(q.peek());
		System.out.println(q.empty());
		q.pop();
		System.out.println(q.peek());
		System.out.println(q.empty());




	}
}