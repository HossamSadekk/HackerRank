public static Node insert(Node root,int data) {
    Node newnode = new Node(data);
    if(root==null)
    {
        root = newnode;
    }
    else if(root.data<=newnode.data)
    {
        root.right = insert(root.right,data);    
    }
    else
    {
        root.left = insert(root.left,data);    
    }
    return root;
    
    
    }

