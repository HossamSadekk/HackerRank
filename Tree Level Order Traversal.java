public static void levelOrder(Node root) {
        
      Queue<Node> q = new LinkedList<Node>();

      q.add(root);

      while(!q.isEmpty())
      {   
          
          Node current = q.poll();

          System.out.print(current.data+" ");

          if(current.left!=null){q.add(current.left);}
          if(current.right!=null){q.add(current.right);}
      }
      
    }
