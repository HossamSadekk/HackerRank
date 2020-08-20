/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null)
        {
            return 0;
        }
        if(root.children==null)
        {
            return 1;
        }
        
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            while(size>0)
            {
                Node current = queue.poll();
                Iterator<Node> i = current.children.iterator();
                while(i.hasNext())
                {
                    queue.add(i.next());
                }
                size--;
            }
            count++;
        }
        return count;
    }
}