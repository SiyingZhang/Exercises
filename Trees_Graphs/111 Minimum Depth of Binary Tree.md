## 111 Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth

	public class Solution {
	    public int minDepth(TreeNode root) {
	        
	        if(root == null) return 0;
	        
			/* Solution 1:     
	        int L = minDepth(root.left);
	        int R = minDepth(root.right);
	        int m = Math.min(L, R)；     
	        return 1+(m>0?m:Math.max(L, R));*/
	        
	        if(root.left != null && root.right != null) return Math.min(minDepth(root.left), minDepth(root.right))+1;
	        else if(root.left == null) return minDepth(root.right)+1;
	        else if(root.right==null) return minDepth(root.left)+1;
	        else return 1;
	    }
	}

**Recursive way**: get right and left minimum path.  


	public class Solution {
	    public int minDepth(TreeNode root) {
	        if(root == null) return 0;
	        int L = minDepth(root.left), R = minDepth(root.right);
	        
	        return 1+(Math.min(L, R)>0?Math.min(L,R):Math.max(L,R));
	    }
	}