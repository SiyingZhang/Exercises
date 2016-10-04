## 222 Count Complete Tree Nodes

Tag: Tree Binary Search

### Solution 1
Time Limit Exceeded. O(h)

	public class Solution {
	    public int countNodes(TreeNode root) {
	        if(root == null) return 0;
	        if(root.right == null && root.left == null) return 1;
	        if(root.right == null || root.left == null) return 2;
	        
	        int count = 0;
	        count += countNodes(root.left) + countNodes(root.right);
	        
	        return count+1; //don't forget root node
	    }
	}
	
### Solution 2
This solution has the time complexity O(logn) which is the height.


	public class Solution {
	    public int countNodes(TreeNode root) {
	        int l = leftHeight(root), r = rightHeight(root);
	        
	        if(l == r)
	            return (1<<l)-1;
	        else {
	            return 1+countNodes(root.left)+countNodes(root.right);
	        }
	    }
	    
	    public int leftHeight(TreeNode left) {
	        int h = 0;
	        while(left != null) {
	            left = left.left;
	            h++;
	        }
	        
	        return h;
	    }
	
	    public int rightHeight(TreeNode right) {
	        int h = 0;
	        while(right != null) {
	            right = right.right;
	            h++;
	        }
	        
	        return h;
	    }
	}