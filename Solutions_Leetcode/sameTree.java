/*
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class sameTree {
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if ((p == null) && (q == null)) {
    		return true;
    	}
        return (p != null) && (q != null) && (isSameTree(p.left, q.left)) && isSameTree(p.right, q.right);
    }
}