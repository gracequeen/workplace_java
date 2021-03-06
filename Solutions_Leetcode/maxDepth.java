/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * Given a binary tree, find its maximum depth.
 */
class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
			val = x;
		}
	}

public class maxDepth {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} 
		return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
	}
	
    public static void main(String[] args) {
    	
    }
}
