public static void inOrder(Node root) {
        if(root==null)
        {
            return;
        }
        else
        {
          Stack<Node> s = new Stack<Node>();
          while(!s.isEmpty() || root!=null)
          {
              if(root!=null)
              {
                  s.push(root);
                  root = root.left;
              }
              else
              {
                  root = s.pop();
                  System.out.print(root.data+" ");
                  root = root.right;
              }
          }

        }
    }
