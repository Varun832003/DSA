package BinarySearchTree_Part1;

public class Mirror_A_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        /*8              8
         / \            / \
        5   10         10  5   ---> Mirror image of BST
       / \   \         /  / \
      3  6    11      11 6   3
         */

       Node root = new Node(8);
       root.left = new Node(5);
       root.right = new Node(10);
       root.left.left = new Node(3);
       root.left.right = new Node(6);
       root.right.right = new Node(11);
        mirrorBST(root);
        preOrder(root);

    }
}
