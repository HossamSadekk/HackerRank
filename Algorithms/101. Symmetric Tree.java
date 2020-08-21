/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
         if( root==null)
        {
            return true;
        }
        
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root.left);
	    queue.add(root.right);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size/2;i++)
            {
                TreeNode current_node1 = queue.poll();
                TreeNode current_node2 = queue.poll();
                
                if (current_node1.val != current_node2.val) return false;
                
                    if(current_node1.left!=null && current_node2.right==null || 
                    current_node1.right!=null && current_node2.left==null||
                    current_node2.left!=null && current_node1.right==null ||    
                    current_node2.right!=null && current_node1.left==null)return false;

               if (current_node1.left != null) 
		        {
                    queue.add(current_node1.left); queue.add(current_node2.right);
                }
                if (current_node1.right != null) 
		        {
                    queue.add(current_node1.right); queue.add(current_node2.left);
                }

            }
        }
        return true;
    }
}