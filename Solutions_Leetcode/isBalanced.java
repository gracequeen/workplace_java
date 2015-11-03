/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/
import java.lang.Math;
class TreeNode {
 	int val;
 	TreeNode left;
 	TreeNode right;
 	TreeNode(int x) { val = x; }
}
 
public class isBalanced{

	public boolean isBalanced(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {return true;}
		int hLeft = getHeight(root.left);
		int rLeft = getHeight(root.right);
		// balance conditions:
		// 1. left and right height difference <= 1
		// 2. left and right both are balanced
		return Math.abs(hLeft - rLeft) <= 1 && isBalanced(root.left) && isBalanced(root.right);
	}

	// recursion, get the node height
	public int getHeight(TreeNode v) {
		int h = 0;
		if (v == null) {return 0;}
		return Math.max(getHeight(v.left), getHeight(v.right)) + 1;
	}

	public static void main(String[] args) {

	}
}