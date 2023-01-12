package binaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class binaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }
    static class BTree{
        static int idx=-1;
        public static Node createBinarytree(int[]arr){
            idx++;
            if(arr[idx]==-1) 
                return null;
            Node newNode=new Node(arr[idx]);
            newNode.left=createBinarytree(arr);
            newNode.right=createBinarytree(arr);

            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root==null) return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static lvlOrder(Node root){
        Queue<Integer> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.println(temp.data+" ");

            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }
    static int sum=0;
    public static void sumOfLeaf(Node root){
        if(root==null) return;

        if(root.left==null && root.right==null){
            sum+=root.data;
        }
        sumOfLeaf(root.left);
        sumOfLeaf(root.right);
    }
    public static void mergeBST(Node root1, Node root)
    public static int height(Node root){
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight>=rightHeight){
            return leftHeight+1;
        }
        return rightHeight+1;
    }
    // public static int diameter(Node root){
        
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BTree tree=new BTree();
        int []arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        Node root=tree.createBinarytree(arr);
        sc.close();
    }
}