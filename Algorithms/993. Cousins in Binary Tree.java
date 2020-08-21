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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root==null || root.val==x || root.val==y)
        {
            return false;
        }
        
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            boolean cousin1=false;
            boolean cousin2=false;
            for(int i=0;i<size;i++)
            {
                TreeNode current_node = queue.poll();
                if(current_node.left!=null && current_node.right!=null)
                {
                    if(current_node.left.val==x && current_node.right.val==y){return false;}
                    if(current_node.left.val==y && current_node.right.val==x){return false;}
                }
                if(current_node.val==x)cousin1=true;
                if(current_node.val==y)cousin2=true;
                
                if(current_node.right!=null)queue.add(current_node.right);
                if(current_node.left!=null)queue.add(current_node.left);
            }
            if(cousin1 && cousin2 == true)
            {
                return true;
            }
        }
        return false;
    }
}