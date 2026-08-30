package practice;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class tree_practice {
    static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);;
        preorder(root.left);
        preorder(root.right);
    }
    static int height(Node root){
        if (root==null){
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.left);
        return Math.max(lh,rh)+1;
    }

//    count Node
    static int count(Node root){
        if (root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    static int sum(Node root){
        if (root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }
    static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.left.right=new Node(50);
        root.left.left.left=new Node(60);
        preorder(root);
    }
}
