import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class ConvertSortedListToBST {
    private static ListNode node;

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(4);

        TreeNode node = sortedListToBST(start);

        printTree(node);
    }

    public static void printTree(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = node;

        while(!stack.empty() || p!=null) {
            if(p!=null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                System.out.print(t.val + " ");
                p = t.right;
            }
        }
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;

        ListNode runner = head;
        node = head;
        
        int size = 0;
        while(runner != null) {
            runner = runner.next;
            size++;
        }
        
        return inorderHelper(0, size-1);
    }
    
    //why has to assign to another left / right node ?
    public static TreeNode inorderHelper(int start, int end) {
        if(start > end) return null;

        int mid = start + (end-start)/2;
        TreeNode left = inorderHelper(start, mid-1);

        TreeNode treeNode = new TreeNode(node.val);
        treeNode.left = left;
        
        node = node.next;

        TreeNode right = inorderHelper(mid+1, end);
        treeNode.right = right;

        return treeNode;
    }
}