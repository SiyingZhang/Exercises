## 101 Symmetric Tree
Given a binary tree, check whether it is a mirror of itself

### Recursive Way

The left node should be the mirror of the right node. 

**Time Complexity**: since the all nodes have been traversed, then should be O(n), n is the number of nodes.


	public class Solution {
	    public boolean isSymmetric(TreeNode root) {
	        if(root == null)   return true;
	        return isMirror(root.left, root.right);
	    }
	    
	    public boolean isMirror(TreeNode n1, TreeNode n2) {
	        if(n1 == null && n2 == null) return true;
	        if(n1 == null || n2 == null) return false;
	        return (n1.val == n2.val) && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
	    }
	}
	

### Iterative Way

	public class Solution {
		public boolean isSymmetric(TreeNode root) {
			if(root == null) return true;
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			q.add(root);
			
			while(!q.isEmpty()) {
				TreeNode n1 = q.poll();
				TreeNode n2 = q.poll();
				if(n1 == null && n2 == null) continue;
				if(n1 == null || n2 != null) return false;
				if(n1.val != n2.val) return false;
				q.add(n1.left);
				q.add(n2.right);
				q.add(n1.right);
				q.add(n2.left);
			}
			return true;
		}
	}