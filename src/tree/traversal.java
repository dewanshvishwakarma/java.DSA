package tree;

import java.util.logging.SocketHandler;

public class traversal {
    static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

   static void inorder(Node root){
       if (root==null){
           return;
       }
       inorder(root.left);
       System.out.print(root.data + " ");
       inorder(root.right);

   }
    static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        preorder(root);
        postorder(root);
        inorder(root);

    }
}
