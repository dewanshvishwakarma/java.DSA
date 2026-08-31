package tree;

import java.util.logging.SocketHandler;

//day 30/8/2026
//create node class
//traversal inorder preorder postorder
//height of tree
//count node
//count leaf node
//sum of node
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


   static int heightOfTree(Node root){
        if (root==null){
            return -1;
        }
        int leftHeight=heightOfTree(root.left);
        int rigthHeight=heightOfTree(root.right);
        int h=Math.max(leftHeight,rigthHeight);
        return h+1;
   }

   static int count(Node root){
        if (root==null){
            return 0;
        }
        int Cleft=count(root.left);
        int Cright=count(root.right);
        return Cleft+Cright+1;
   }

   static int sum(Node root){
        if (root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rifhtsum=sum(root.right);
        return leftsum+rifhtsum+root.data;
   }
    static int countLeaf(Node root) {

        if (root == null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        }
        int left = countLeaf(root.left);
        int right = countLeaf(root.right);

        return left + right;
    }

    static int max_in_tree(Node root){
        if ( root==null){
            return Integer.MIN_VALUE;
        }
        int l=max_in_tree(root.left);
        int r=max_in_tree(root.right);
        return Math.max(l,Math.max(r,root.data));
    }

    static int minimum_in_tree(Node root){
        if (root==null){
            return Integer.MAX_VALUE;
        }
        int lm=minimum_in_tree(root.left);
        int rm=minimum_in_tree(root.right);
        return Math.min(lm,Math.min(rm,root.data));
    }

    static int countInternal(Node root){
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 0;
        }
        int l=countInternal(root.left);
        int r=countInternal(root.right);
        return l+r+1;
    }

    static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.left.left.left=new Node(60);
        preorder(root);
        postorder(root);
        inorder(root);
        int height=heightOfTree(root);
        System.out.println(height);
        int count=count(root);
        System.out.println("number of node is " + count);
        int s=sum(root);
        System.out.println("sum is " + s);
        int lnode=countLeaf(root);
        System.out.println("leaf node is an" + lnode);
        int max=max_in_tree(root);
        System.out.println("maximum is " + max);
        int min=minimum_in_tree(root);
        System.out.println("minimum tree is" + min);
    }
}
