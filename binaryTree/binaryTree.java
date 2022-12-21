package binaryTree;
import java.util.Scanner;
public class binaryTree{
    class Node{
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