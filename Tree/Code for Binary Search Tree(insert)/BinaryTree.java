class Node
{
    int data;
    Node left;
    Node right;  

    public Node(int data)
    {
        this.data = data;
    }
}

public class BinaryTree {

    Node root;


    //insert

    public void insert(int data) {
        
        root = insertRec(root, data);

    }
    public Node insertRec(Node root,int data)
    {
        if(root==null) 
           root = new Node(data);
        else if(data < root.data)
           root.left = insertRec(root.left, data);
        else if(data > root.data)
           root.right = insertRec(root.right, data);

        return root;
    }


    // //Tree traversal(inorder)

    // public void inorder()
    // {
    //   inorderRec(root);
    // }
    // public void inorderRec(Node root)
    // {
    //   if(root != null)
    //   {
    //      inorderRec(root.left);
    //      System.out.print(root.data + " ");
    //      inorderRec(root.right);
    //   }
    // }


    //or (use any one Tree traversal)


    //Tree traversal(preorder)

    public void preorder()
    {
      preorderRec(root);
    }
    public void preorderRec(Node root)
    {
      if(root != null)
      {
        System.out.print(root.data + " ");//bas preorder mein yeh upar liya
        preorderRec(root.left);
        preorderRec(root.right);
      }
    }
}
//note: inorder:o/p:2 5 7 8 12 15 
//      preorder:o/p:8 7 2 5 12 15