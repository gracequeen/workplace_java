
/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
 
public class invertTree{

    public TreeNode invertTree(TreeNode root) {
    	if (root != null) {
    		root.left = invert(root.left);
        	root.right = invert(root.right);
        	TreeNode temp = root.left;
        	root.left = root.right;
        	root.right = temp;
    	}
    	return root;
        
    }

    public static void main(String[] args) {
    	
    }
}