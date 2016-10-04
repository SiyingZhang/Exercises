## 257 Binary Tree Paths

1 2 3 null 5

["1->2->5", "1->3"]

**base case**: no children, then only add **value**.
 


	public class Solution {
	    public List<String> binaryTreePaths(TreeNode root) {
	        List<String> paths = new ArrayList<String>();
	        if(root == null) return paths;
	        
	        StringBuilder sb = new StringBuilder();
	        helper(paths, sb, root);
	        
	        return paths;
	    }
	    
	    public void helper(List<String> slist, StringBuilder sb, TreeNode node) {
	        if(node == null) return;
	        int temp = sb.length();
	        
	        if(node.left == null && node.right == null) {
	            sb.append(node.val);
	            slist.add(sb.toString());
	            
	            sb.delete(temp, sb.length());
	            return;
	        }
	        
	        sb.append(node.val + "->");
	        helper(slist, sb, node.left);
	        helper(slist, sb, node.right);
	        
	        sb.delete(temp, sb.length());
	        return;
	    }
	}