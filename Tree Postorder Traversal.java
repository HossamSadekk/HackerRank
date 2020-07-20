public static void postOrder(Node root) {
        if(root==null)
        {
            return;
        }
        else
        {
            Node current=root;
            Stack<Node> s = new Stack<Node>();
            while(current != null || !s.isEmpty())
            {
                if(current!=null)
                {
                    s.push(current);
                    current=current.left;
                }
                else
                {
                    Node temp=s.peek().right;
                    if(temp==null)
                    {
                        temp = s.pop();
                        System.out.print(temp.data+" ");
                        while(!s.isEmpty() && s.peek().right==temp)
                        {
                            temp=s.pop();
                            System.out.print(temp.data+" ");
                        }
                    }
                    else
                    {
                        current=temp;
                    }
                }
            }
        
    }}

