
public static void preOrder(Node root) {
if(root == null)
        {
            return;
        }
        else
        {
            Stack<Node> s = new Stack<Node>();
            s.push(root);
            while(!s.isEmpty())
            {
                root = s.pop();
                System.out.print(root.data+" ");
                
                if(root.right!=null)
                {
                    s.push(root.right);
                }
                if(root.left!=null)
                {
                    s.push(root.left);
                }
    }}}

